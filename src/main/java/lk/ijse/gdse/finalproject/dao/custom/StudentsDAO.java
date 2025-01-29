package lk.ijse.gdse.finalproject.dao.custom;

import lk.ijse.gdse.finalproject.model.StudentsDto;
import lk.ijse.gdse.finalproject.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface StudentsDAO extends CrudDAO<StudentsDto>{
    ArrayList<String> getAllStudentIds() throws SQLException, ClassNotFoundException;
    StudentsDto findById(String selectedStudentId) throws SQLException, ClassNotFoundException;
}
