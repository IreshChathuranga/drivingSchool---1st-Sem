package lk.ijse.gdse.finalproject.bo.custom.impl;

import lk.ijse.gdse.finalproject.bo.custom.StudentsBO;
import lk.ijse.gdse.finalproject.dao.custom.StudentsDAO;
import lk.ijse.gdse.finalproject.dao.custom.impl.StudentsDAOImpl;
import lk.ijse.gdse.finalproject.model.StudentsDto;

import java.sql.SQLException;
import java.util.ArrayList;

public class StudentsBOImpl implements StudentsBO {
    StudentsDAO studentsDAO = new StudentsDAOImpl();
    public String getNextStuentId() throws SQLException, ClassNotFoundException {
        return studentsDAO.getNextId();
    }

    public ArrayList<StudentsDto> getAllStudents() throws SQLException, ClassNotFoundException {
        ArrayList<StudentsDto> studentsDtos = studentsDAO.getAll();
        return studentsDtos;
    }
    public boolean saveStudent(StudentsDto studentsDto) throws SQLException, ClassNotFoundException {
        return studentsDAO.save(studentsDto);
    }
    public boolean deleteStudent(String studentId) throws SQLException, ClassNotFoundException {
        return  studentsDAO.delete(studentId);
    }

    public boolean updateStudent(StudentsDto studentsDto) throws SQLException, ClassNotFoundException {
        return studentsDAO.update(studentsDto);
    }
    public ArrayList<String> getAllStudentIds() throws SQLException, ClassNotFoundException {
        return studentsDAO.getAllStudentIds();
    }
    public StudentsDto findById(String selectedStudentId) throws SQLException, ClassNotFoundException {
        return studentsDAO.findById(selectedStudentId);
    }
}
