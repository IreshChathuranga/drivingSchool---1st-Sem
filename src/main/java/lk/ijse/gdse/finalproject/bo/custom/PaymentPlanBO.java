package lk.ijse.gdse.finalproject.bo.custom;

import lk.ijse.gdse.finalproject.model.PaymentPlanDto;
import lk.ijse.gdse.finalproject.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface PaymentPlanBO {
    public String getNextPaymentPlanId() throws SQLException, ClassNotFoundException;
    public ArrayList<PaymentPlanDto> getAllPaymentPlan() throws SQLException, ClassNotFoundException;
    public boolean savePaymentPlan(PaymentPlanDto paymentPlanDto) throws SQLException, ClassNotFoundException;
    public boolean deletePaymentPlan(String payPlanId) throws SQLException, ClassNotFoundException;
    public boolean updatePaymentPlan(PaymentPlanDto paymentPlanDto) throws SQLException, ClassNotFoundException;
    public ArrayList<String> getAllPayId() throws SQLException, ClassNotFoundException;
}
