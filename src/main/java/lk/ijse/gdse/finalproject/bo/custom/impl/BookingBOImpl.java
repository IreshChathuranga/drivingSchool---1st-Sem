package lk.ijse.gdse.finalproject.bo.custom.impl;

import lk.ijse.gdse.finalproject.bo.custom.BookingBO;
import lk.ijse.gdse.finalproject.dao.custom.BookingDAO;
import lk.ijse.gdse.finalproject.dao.custom.impl.BookingDAOImpl;
import lk.ijse.gdse.finalproject.model.BookingDto;

import java.sql.SQLException;

public class BookingBOImpl implements BookingBO {
    BookingDAO bookingDAO = new BookingDAOImpl();
    public boolean saveBooking(BookingDto bookingDto) throws SQLException, ClassNotFoundException {
        return bookingDAO.save(bookingDto);
    }
    public String getNextBookingId() throws SQLException, ClassNotFoundException {
       return bookingDAO.getNextId();
    }

}
