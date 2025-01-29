package lk.ijse.gdse.finalproject.bo.custom;

import lk.ijse.gdse.finalproject.model.BookedDto;

import java.sql.SQLException;
import java.util.ArrayList;

public interface BookedBO {
    ArrayList<BookedDto> getAllBooking() throws SQLException, ClassNotFoundException;
}
