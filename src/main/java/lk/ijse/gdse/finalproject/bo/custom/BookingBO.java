package lk.ijse.gdse.finalproject.bo.custom;

import lk.ijse.gdse.finalproject.db.DBConnection;
import lk.ijse.gdse.finalproject.model.BookingDto;
import lk.ijse.gdse.finalproject.util.CrudUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface BookingBO {
    public boolean saveBooking(BookingDto bookingDto) throws SQLException, ClassNotFoundException;
    public String getNextBookingId() throws SQLException, ClassNotFoundException;
}
