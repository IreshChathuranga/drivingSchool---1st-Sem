package lk.ijse.gdse.finalproject.bo.custom.impl;

import lk.ijse.gdse.finalproject.bo.custom.PaymentBO;
import lk.ijse.gdse.finalproject.dao.custom.PaymentDAO;
import lk.ijse.gdse.finalproject.dao.custom.impl.PaymentDAOImpl;
import lk.ijse.gdse.finalproject.model.PaymentDto;

import java.sql.SQLException;
import java.util.ArrayList;

public class PaymentBOImpl implements PaymentBO {
    PaymentDAO paymentDAO = new PaymentDAOImpl();
    public String getNextPaymentId() throws SQLException, ClassNotFoundException {
        return paymentDAO.getNextId();
    }
    public ArrayList<PaymentDto> getAllPayment() throws SQLException, ClassNotFoundException {
        ArrayList<PaymentDto> paymentDtos = paymentDAO.getAll();
        return paymentDtos;
    }
    public boolean savePayment(PaymentDto paymentDto) throws SQLException, ClassNotFoundException {
        return paymentDAO.save(paymentDto);
    }
    public boolean deletePayment(String payId) throws SQLException, ClassNotFoundException {
        return paymentDAO.delete(payId);
    }
    public boolean updatePayment(PaymentDto paymentDto) throws SQLException, ClassNotFoundException {
        return paymentDAO.update(paymentDto);
    }
}
