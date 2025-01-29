package lk.ijse.gdse.finalproject.dao.custom.impl;

import lk.ijse.gdse.finalproject.dao.custom.BookedDAO;
import lk.ijse.gdse.finalproject.model.BookedDto;
import lk.ijse.gdse.finalproject.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookedDAOImpl implements BookedDAO {
    @Override
    public ArrayList<BookedDto> getAll() throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.execute("select * from booking");
        ArrayList<BookedDto> bookedDtos = new ArrayList<>();
        while (rst.next()){
            BookedDto bookedDto = new BookedDto(
                    rst.getString(1),
                    rst.getDate(2),
                    rst.getString(3),
                    rst.getString(4));
            bookedDtos.add(bookedDto);
        }
        return bookedDtos;
    }
    @Override
    public String getNextId() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean save(BookedDto dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean update(BookedDto dto) throws SQLException, ClassNotFoundException {
        return false;
    }
}
