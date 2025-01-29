package lk.ijse.gdse.finalproject.dao.custom.impl;

import lk.ijse.gdse.finalproject.dao.custom.SigninDAO;
import lk.ijse.gdse.finalproject.model.SigninDto;
import lk.ijse.gdse.finalproject.util.CrudUtil;

import java.sql.SQLException;
import java.util.ArrayList;

public class SigninDAOImpl implements SigninDAO {
    @Override
    public boolean save(SigninDto signinDto) throws SQLException, ClassNotFoundException {
        Boolean isSaved = CrudUtil.execute("insert into signup values(?,?,?,?,?)",
                signinDto.getName(),
                signinDto.getUserName(),
                signinDto.getContactNumber(),
                signinDto.getUserAddress(),
                signinDto.getUserPassword()
        );
        return isSaved;
    }

    @Override
    public String getNextId() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public ArrayList<SigninDto> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }
    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean update(SigninDto dto) throws SQLException, ClassNotFoundException {
        return false;
    }
}
