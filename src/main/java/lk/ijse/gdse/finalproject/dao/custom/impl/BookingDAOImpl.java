package lk.ijse.gdse.finalproject.dao.custom.impl;

import lk.ijse.gdse.finalproject.dao.custom.BookingDAO;
import lk.ijse.gdse.finalproject.dao.custom.BookingDetailsDAO;
import lk.ijse.gdse.finalproject.dao.custom.ChooseTrainerDAO;
import lk.ijse.gdse.finalproject.dao.custom.LessonsDAO;
import lk.ijse.gdse.finalproject.db.DBConnection;
import lk.ijse.gdse.finalproject.model.BookingDto;
import lk.ijse.gdse.finalproject.util.CrudUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookingDAOImpl implements BookingDAO {
    private final BookingDetailsDAO bookingDetailsDAO= new BookingDetailsDAOImpl();
    private final LessonsDAO lessonsDAO= new LessonsDAOImpl();
    private final ChooseTrainerDAO chooseTrainerDAO = new ChooseTrainerDAOImpl();
    @Override
    public boolean save(BookingDto bookingDto) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        try {
            connection.setAutoCommit(false);
            boolean isBookingSaved = CrudUtil.execute(
                    "insert into booking values (?, ?, ?, ?)",
                    bookingDto.getBookId(), bookingDto.getBookDate(), bookingDto.getBookTime(), bookingDto.getRescheduleReason());

            if (isBookingSaved) {
                boolean isBookingDetailsSaved = bookingDetailsDAO.saveBookingDetaileList(bookingDto.getBookingDetailsDTOS());
                if (isBookingDetailsSaved) {
                    boolean isLessonsSaved = lessonsDAO.saveLessonList(bookingDto.getLessonsDTOS());
                    if (isLessonsSaved) {
                        boolean isChooseTrainerSaved =  chooseTrainerDAO.saveChooseTrainer(bookingDto.getChooseTrainerDTOS());
                        if(isChooseTrainerSaved){
                            connection.commit();
                            return true;
                        }
                    }
                }
            }
            connection.rollback();
            return false;
        } catch (SQLException e) {
            connection.rollback();
            e.printStackTrace();
            return false;
        } finally {
            connection.setAutoCommit(true);
        }
    }

    @Override
    public String getNextId() throws SQLException, ClassNotFoundException {
        ResultSet rst=CrudUtil.execute("select book_id from booking order by book_id desc limit 1");
        if(rst.next()){
           String lastId = rst.getString(1);
           String subString = lastId.substring(1);
           int i = Integer.parseInt(subString);
            int newIdIndex = i+1;
            return String.format("B%03d",newIdIndex);
       }
        return  "B001";

    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean update(BookingDto dto) throws SQLException, ClassNotFoundException {
        return false;
    }
    @Override
    public ArrayList<BookingDto> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }
}
