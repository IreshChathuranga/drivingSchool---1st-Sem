package lk.ijse.gdse.finalproject.dao.custom;

import lk.ijse.gdse.finalproject.model.PaymentPlanDto;
import lk.ijse.gdse.finalproject.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface PaymentPlanDAO extends CrudDAO<PaymentPlanDto>{
    ArrayList<String> getAllPayId() throws SQLException, ClassNotFoundException;
}
