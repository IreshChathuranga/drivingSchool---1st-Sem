package lk.ijse.gdse.finalproject.dao.custom;

import lk.ijse.gdse.finalproject.model.BookingDetailsDto;

import java.sql.SQLException;
import java.util.ArrayList;

public interface BookingDetailsDAO extends CrudDAO<BookingDetailsDto>{
    boolean saveBookingDetaileList(ArrayList<BookingDetailsDto> bookingDetailsDTOS) throws SQLException, ClassNotFoundException;
}
