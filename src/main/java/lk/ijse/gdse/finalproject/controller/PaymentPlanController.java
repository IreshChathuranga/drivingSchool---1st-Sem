package lk.ijse.gdse.finalproject.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import lk.ijse.gdse.finalproject.dto.PaymentPlanDto;
import lk.ijse.gdse.finalproject.dto.tm.PaymentPlanTM;
import lk.ijse.gdse.finalproject.model.PaymentPlanModel;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class PaymentPlanController implements Initializable {
    public Button btnSave;
    public Button btnUpdate;
    public Button btnDelete;
    public TableView<PaymentPlanTM> tblPaymentPlan;
    public TableColumn<PaymentPlanTM,String> payplanId;
    public TableColumn<PaymentPlanTM,String> payId;
    public TableColumn<PaymentPlanTM,Double> amount;
    public TableColumn<PaymentPlanTM,Integer> rate;
    public TableColumn<PaymentPlanTM,Double> ratePrice;
    public TableColumn<PaymentPlanTM,String> description;
    public Label lblPaymentPlanId;
    public TextField txtRatePrice;
    public TextField txtDescription;
    public TextField txtRate;
    public TextField txtAmount;
    public TextField txtPayId;
    PaymentPlanModel paymentPlanModel= new PaymentPlanModel();
    private void loadTableData() throws SQLException, ClassNotFoundException {
        ArrayList<PaymentPlanDto> paymentPlanDtos = paymentPlanModel.getAllPaymentPlan();
        ObservableList<PaymentPlanTM> paymentPlanTMS = FXCollections.observableArrayList();
        for(PaymentPlanDto paymentPlanDto:paymentPlanDtos){
            PaymentPlanTM paymentPlanTM=new PaymentPlanTM();
            paymentPlanTM.setPayplanId(paymentPlanDto.getPayplanId());
            paymentPlanTM.setAmount(paymentPlanDto.getAmount());
            paymentPlanTM.setRate(paymentPlanDto.getRate());
            paymentPlanTM.setRatePrice(paymentPlanDto.getRatePrice());
            paymentPlanTM.setDescription(paymentPlanDto.getDescription());
            paymentPlanTM.setPayId(paymentPlanDto.getPayId());
            paymentPlanTMS.add(paymentPlanTM);
        }
        tblPaymentPlan.setItems(paymentPlanTMS);
    }

    public void loadNextPaymentPlanId() throws SQLException, ClassNotFoundException {
        String nextPaymentPalnId = paymentPlanModel.getNextPaymentPlanId();
        lblPaymentPlanId.setText(nextPaymentPalnId);
    }
    private void refreshPage() throws SQLException, ClassNotFoundException {
        loadNextPaymentPlanId();
        loadTableData();

        btnSave.setDisable(false);

        btnUpdate.setDisable(true);
        btnDelete.setDisable(true);

        txtAmount.setText("");
        txtRate.setText("");
        txtRatePrice.setText("");
        txtDescription.setText("");
        txtPayId.setText("");
    }
    public void saveOnAction(ActionEvent actionEvent) {
    }

    public void updateOnAction(ActionEvent actionEvent) {
    }

    public void deleteOnAction(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        payplanId.setCellValueFactory(new PropertyValueFactory<>("payplanId"));
        amount.setCellValueFactory(new PropertyValueFactory<>("amount"));
        rate.setCellValueFactory(new PropertyValueFactory<>("rate"));
        ratePrice.setCellValueFactory(new PropertyValueFactory<>("ratePrice"));
        description.setCellValueFactory(new PropertyValueFactory<>("description"));
        payId.setCellValueFactory(new PropertyValueFactory<>("payId"));

        try{
            refreshPage();
        }catch(Exception e){
            e.printStackTrace();
            new Alert(Alert.AlertType.ERROR,"Fail Paymentplan id").show();
        }
    }

    public void refreshOnAction(ActionEvent actionEvent) {
    }
}
