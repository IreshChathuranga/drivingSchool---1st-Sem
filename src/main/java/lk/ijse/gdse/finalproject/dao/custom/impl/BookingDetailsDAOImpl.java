package lk.ijse.gdse.finalproject.dao.custom.impl;

import lk.ijse.gdse.finalproject.dao.custom.BookingDetailsDAO;
import lk.ijse.gdse.finalproject.model.BookingDetailsDto;
import lk.ijse.gdse.finalproject.util.CrudUtil;

import java.sql.SQLException;
import java.util.ArrayList;

public class BookingDetailsDAOImpl implements BookingDetailsDAO {
    @Override
public boolean saveBookingDetaileList(ArrayList<BookingDetailsDto> bookingDetailsDTOS) throws SQLException, ClassNotFoundException {
    for (BookingDetailsDto bookingDetailsDTO : bookingDetailsDTOS) {
        boolean isBookingDetailsSaved = save(bookingDetailsDTO);
        if (!isBookingDetailsSaved) {
            return false;
        }
    }
    return true;
}

    @Override
    public boolean save(BookingDetailsDto bookingDetailsDto) throws SQLException, ClassNotFoundException {
        return CrudUtil.execute(
                "insert into booking_details values (?, ?)",
                bookingDetailsDto.getBookId(),
                bookingDetailsDto.getStudentId()
        );
    }

    @Override
    public String getNextId() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public ArrayList<BookingDetailsDto> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }
    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean update(BookingDetailsDto dto) throws SQLException, ClassNotFoundException {
        return false;
    }
}
