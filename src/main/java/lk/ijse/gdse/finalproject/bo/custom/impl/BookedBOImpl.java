package lk.ijse.gdse.finalproject.bo.custom.impl;

import lk.ijse.gdse.finalproject.bo.custom.BookedBO;
import lk.ijse.gdse.finalproject.dao.custom.BookedDAO;
import lk.ijse.gdse.finalproject.dao.custom.impl.BookedDAOImpl;
import lk.ijse.gdse.finalproject.model.BookedDto;

import java.sql.SQLException;
import java.util.ArrayList;

public class BookedBOImpl implements BookedBO {
    BookedDAO bookedDAO = new BookedDAOImpl();
    public ArrayList<BookedDto> getAllBooking() throws SQLException, ClassNotFoundException {
        ArrayList<BookedDto> bookedDtos = bookedDAO.getAll();
        return bookedDtos;
    }
}
