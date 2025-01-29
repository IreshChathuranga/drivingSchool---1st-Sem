package lk.ijse.gdse.finalproject.bo.custom.impl;

import lk.ijse.gdse.finalproject.bo.custom.PaymentPlanBO;
import lk.ijse.gdse.finalproject.dao.custom.PaymentPlanDAO;
import lk.ijse.gdse.finalproject.dao.custom.impl.PaymentPlanDAOImpl;
import lk.ijse.gdse.finalproject.model.PaymentPlanDto;

import java.sql.SQLException;
import java.util.ArrayList;

public class PaymentPlanBOImpl implements PaymentPlanBO {
    PaymentPlanDAO paymentPlanDAO = new PaymentPlanDAOImpl();
    public String getNextPaymentPlanId() throws SQLException, ClassNotFoundException {
        return paymentPlanDAO.getNextId();
    }
    public ArrayList<PaymentPlanDto> getAllPaymentPlan() throws SQLException, ClassNotFoundException {
        ArrayList<PaymentPlanDto> paymentPlanDtos = paymentPlanDAO.getAll();
        return paymentPlanDtos;
    }
    public boolean savePaymentPlan(PaymentPlanDto paymentPlanDto) throws SQLException, ClassNotFoundException {
        return paymentPlanDAO.save(paymentPlanDto);
    }
    public boolean deletePaymentPlan(String payPlanId) throws SQLException, ClassNotFoundException {
        return paymentPlanDAO.delete(payPlanId);
    }
    public boolean updatePaymentPlan(PaymentPlanDto paymentPlanDto) throws SQLException, ClassNotFoundException {
        return paymentPlanDAO.update(paymentPlanDto);
    }
    public ArrayList<String> getAllPayId() throws SQLException, ClassNotFoundException {
        return paymentPlanDAO.getAllPayId();
    }
}
