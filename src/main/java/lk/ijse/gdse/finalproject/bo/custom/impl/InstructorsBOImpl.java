package lk.ijse.gdse.finalproject.bo.custom.impl;

import lk.ijse.gdse.finalproject.bo.custom.InstructorsBO;
import lk.ijse.gdse.finalproject.dao.custom.InstructorsDAO;
import lk.ijse.gdse.finalproject.dao.custom.impl.InstructorsDAOImpl;
import lk.ijse.gdse.finalproject.model.InstructorsDto;

import java.sql.SQLException;
import java.util.ArrayList;

public class InstructorsBOImpl implements InstructorsBO {
    InstructorsDAO instructorsDAO = new InstructorsDAOImpl();
    public String getNextInstructorId() throws SQLException, ClassNotFoundException {
       return instructorsDAO.getNextId();
    }

    public ArrayList<InstructorsDto> getAllInstructors() throws SQLException, ClassNotFoundException {
        ArrayList<InstructorsDto> instructorsDtos = instructorsDAO.getAll();
        return instructorsDtos;
    }
    public boolean saveInstructor(InstructorsDto instructorsDto) throws SQLException, ClassNotFoundException {
        return instructorsDAO.save(instructorsDto);
    }
    public boolean deleteInstructor(String instructorId) throws SQLException, ClassNotFoundException {
        return instructorsDAO.delete(instructorId);
    }
    public boolean updateInstructor(InstructorsDto instructorsDto) throws SQLException, ClassNotFoundException {
        return instructorsDAO.update(instructorsDto);
    }
    public ArrayList<String> getAllInstructorIds() throws SQLException, ClassNotFoundException {
        return instructorsDAO.getAllInstructorIds();
    }
    public InstructorsDto findById(String selectedInstructorId) throws SQLException, ClassNotFoundException {
        return instructorsDAO.findById(selectedInstructorId);
    }
}
