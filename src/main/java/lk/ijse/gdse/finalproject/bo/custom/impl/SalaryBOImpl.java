package lk.ijse.gdse.finalproject.bo.custom.impl;

import lk.ijse.gdse.finalproject.bo.custom.SalaryBO;
import lk.ijse.gdse.finalproject.dao.custom.SalaryDAO;
import lk.ijse.gdse.finalproject.dao.custom.impl.SalaryDAOImpl;
import lk.ijse.gdse.finalproject.model.SalaryDto;

import java.sql.SQLException;
import java.util.ArrayList;

public class SalaryBOImpl implements SalaryBO {
    SalaryDAO salaryDAO = new SalaryDAOImpl();
    public String getNextSalaryId() throws SQLException, ClassNotFoundException {
        return salaryDAO.getNextId();
    }
    public ArrayList<SalaryDto> getAllSalary() throws SQLException, ClassNotFoundException {
        ArrayList<SalaryDto> salaryDtos = salaryDAO.getAll();
        return salaryDtos;
    }
    public boolean saveSalary(SalaryDto salaryDto) throws SQLException, ClassNotFoundException {
        return salaryDAO.save(salaryDto);
    }
    public boolean deleteSalary(String salaryId) throws SQLException, ClassNotFoundException {
        return salaryDAO.delete(salaryId);
    }
    public boolean updateSalary(SalaryDto salaryDto) throws SQLException, ClassNotFoundException {
        return salaryDAO.update(salaryDto);
    }
}
