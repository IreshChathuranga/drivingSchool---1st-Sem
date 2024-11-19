package lk.ijse.gdse.finalproject.model;

import lk.ijse.gdse.finalproject.dto.BookingDetailsDto;
import lk.ijse.gdse.finalproject.dto.BookingDto;
import lk.ijse.gdse.finalproject.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookingDetailsModel {
    public boolean saveBookingDetaileList(ArrayList<BookingDetailsDto> bookingDetailsDTOS) throws SQLException, ClassNotFoundException {
        for (BookingDetailsDto bookingDetailsDTO : bookingDetailsDTOS){
            boolean isBookingDetailsSaved = saveBookingDetails(bookingDetailsDTO);
            if (!isBookingDetailsSaved){
                return false;
            }
//            boolean isBookingUpdate = bookingDetailsModel.updateBookingDetail(bookingDto);
//            if (!isBookingUpdate) {
//                return false;
//            }
        }
        return true;
    }
//    public boolean updateBookingDetail(BookingDto bookingDto) throws SQLException, ClassNotFoundException {
//        // Execute SQL query to update the item quantity in the database
//        return CrudUtil.execute(
//                "update booking_details set stg_Id = ?  where book_id = ?",
//                bookingDto.getBookingId()
//        );
//    }
//    private final StudentsModel studentsModel= new StudentsModel();
//
//    public boolean saveBookingDetailsList(ArrayList<BookingDetailsDto> bookingDetailsDtos) throws SQLException, ClassNotFoundException {
//        for (BookingDetailsDto bookingDetailsDto : bookingDetailsDtos){
//            boolean isBookingSaved = saveBookingDetails(bookingDetailsDto);
//            if (!isBookingSaved){
//                return false;
//            }
//            boolean isBookingUpdate = bookingModel.updateBooking(bookingDetailsDto);
//            if (!isBookingUpdate) {
//                // Return false if updating the item quantity fails
//                return false;
//            }
//        }
//        return true;
//    }
    private boolean saveBookingDetails(BookingDetailsDto bookingDetailsDto) throws SQLException, ClassNotFoundException {
        return CrudUtil.execute(
                "insert into booking_details values (?,?)",
                bookingDetailsDto.getBookId(),
                bookingDetailsDto.getBookId()
        );
    }
//    private final BookingModel bookingModel= new BookingModel();

//    public String getNextBookingId() throws SQLException, ClassNotFoundException {
//        ResultSet rst=CrudUtil.execute("select book_id from booking order by book_id desc limit 1");
//        if(rst.next()){
//            String lastId = rst.getString(1);
//            String subString = lastId.substring(1);
//            int i = Integer.parseInt(subString);
//            int newIdIndex = i+1;
//            return String.format("B%03d",newIdIndex);
//        }
//        return  "B001";
//
//    }
//
//    public ArrayList<BookingDetailsDto> getAllBooking() throws SQLException, ClassNotFoundException {
//        ResultSet rst = CrudUtil.execute("select * from booking");
//        ArrayList<BookingDetailsDto> bookingDetailsDtos = new ArrayList<>();
//        while (rst.next()){
//            BookingDetailsDto bookingDetailsDto =  new BookingDetailsDto(
//                    rst.getString(1),
//                    rst.getDate(2),
//                    rst.getString(3),
//                    rst.getString(4));
//            bookingDetailsDtos.add(bookingDetailsDto);
//        }
//        return bookingDetailsDtos;
//    }
//
//    public boolean rescheduleBooking(BookingDetailsDto bookingDetailsDto) throws SQLException, ClassNotFoundException {
//        Boolean isRescheduled = CrudUtil.execute("insert into booking values(?,?,?,?)", bookingDetailsDto.getBookId(), bookingDetailsDto.getBookDate(), bookingDetailsDto.getBookTime(), bookingDetailsDto.getRescheduleReason());
//        return isRescheduled;
//    }
//    public boolean deleteBooking(String bookId) throws SQLException, ClassNotFoundException {
//        return  CrudUtil.execute("delete from booking where book_id=?", bookId);
//    }
//
//    public boolean updateBooking(BookingDetailsDto bookingDetailsDto) throws SQLException, ClassNotFoundException {
//        return CrudUtil.execute(
//                "update booking set book_date=?,  book_time=?,  reschedule_reason=? where book_id=?",
//                bookingDetailsDto.getBookDate(),
//                bookingDetailsDto.getBookTime(),
//                bookingDetailsDto.getRescheduleReason(),
//                bookingDetailsDto.getBookId()
//        );
//    }
}
