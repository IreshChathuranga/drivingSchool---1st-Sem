package lk.ijse.gdse.finalproject.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import lk.ijse.gdse.finalproject.dto.BookingDetailsDto;
import lk.ijse.gdse.finalproject.dto.tm.BookingDetailsTM;
import lk.ijse.gdse.finalproject.model.BookingDetailsModel;

import java.net.URL;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;

public class BookingDetailsController{


    public TableColumn<BookingDetailsTM,String> bookId;
    public TableColumn<BookingDetailsTM,Date> bookDate;
    public TableColumn<BookingDetailsTM,String> bookTime;
    public TableColumn<BookingDetailsTM,String> rescheduleReason;
    public Label lblBokk;
    public Button btnDelete;
    public Button btnUpdate;
    public Button btnReschedule;
    public TextField txtDate;
    public TextField txtTime;
    public TextField txtReason;
    public TableView<BookingDetailsTM> tblBook;
    public Button btnRefresh;


    BookingDetailsModel bookingDetailsModel = new BookingDetailsModel();

//    private void loadTableData() throws SQLException, ClassNotFoundException {
//        ArrayList<BookingDetailsDto> bookingDetailsDtos = bookingDetailsModel.getAllBooking();
//        ObservableList<BookingDetailsTM> bookingDetailsTMS = FXCollections.observableArrayList();
//        for(BookingDetailsDto bookingDetailsDto : bookingDetailsDtos){
//            BookingDetailsTM bookingDetailsTM =new BookingDetailsTM();
//            bookingDetailsTM.setBookId(bookingDetailsDto.getBookId());
//            bookingDetailsTM.setBookDate(bookingDetailsDto.getBookDate());
//            bookingDetailsTM.setBookTime(bookingDetailsDto.getBookTime());
//            bookingDetailsTM.setRescheduleReason(bookingDetailsDto.getRescheduleReason());
//            bookingDetailsTMS.add(bookingDetailsTM);
//        }
//        tblBook.setItems(bookingDetailsTMS);
//    }
//
//    public void loadNextBookingId() throws SQLException, ClassNotFoundException {
//        String nextBookingId = bookingDetailsModel.getNextBookingId();
//        lblBokk.setText(nextBookingId);
//    }
//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//        bookId.setCellValueFactory(new PropertyValueFactory<>("bookId"));
//        bookDate.setCellValueFactory(new PropertyValueFactory<>("bookDate"));
//        bookTime.setCellValueFactory(new PropertyValueFactory<>("bookTime"));
//        rescheduleReason.setCellValueFactory(new PropertyValueFactory<>("rescheduleReason"));
//
//        try{
//            refreshPage();
//        }catch(Exception e){
//            e.printStackTrace();
//            new Alert(Alert.AlertType.ERROR,"Fail Booking id").show();
//        }
//    }
//    private void refreshPage() throws SQLException, ClassNotFoundException {
//        loadNextBookingId();
//        loadTableData();
//
//        btnReschedule.setDisable(false);
//
//        btnUpdate.setDisable(true);
//        btnDelete.setDisable(true);
//
//        txtDate.setText("");
//        txtTime.setText("");
//        txtReason.setText("");
//    }
//
//    public void updateOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
//        String bookId = lblBokk.getText();
//        Date bookDate = Date.valueOf(txtDate.getText());
//        String bookTime = txtTime.getText();
//        String rescheduleReason = txtReason.getText();
//
//        BookingDetailsDto bookingDetailsDto = new BookingDetailsDto(
//                bookId,
//                bookDate,
//                bookTime,
//                rescheduleReason
//        );
//        boolean isUpdate = bookingDetailsModel.updateBooking(bookingDetailsDto);
//        if (isUpdate) {
//            refreshPage();
//            new Alert(Alert.AlertType.INFORMATION, "Booking Updated").show();
//        } else {
//            new Alert(Alert.AlertType.ERROR, "Fail to update booking...!").show();
//        }
//    }
//
//    public void deleteOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
//        String bookId = lblBokk.getText();
//
//        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure?", ButtonType.YES, ButtonType.NO);
//        Optional<ButtonType> optionalButtonType = alert.showAndWait();
//
//        if(optionalButtonType.isPresent() && optionalButtonType.get() == ButtonType.YES){
//            boolean isDeleted = bookingDetailsModel.deleteBooking(bookId);
//            refreshPage();
//            new Alert(Alert.AlertType.INFORMATION, "Booking deleted").show();
//        } else {
//            new Alert(Alert.AlertType.ERROR, "Fail to delete booking...!").show();
//        }
//    }
//
//    public void rescheduleOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
//        String bookId = lblBokk.getText();
//        Date bookDate = Date.valueOf(txtDate.getText());
//        String bookTime = txtTime.getText();
//        String rescheduleReason = txtReason.getText();
//
//        BookingDetailsDto bookingDetailsDto = new BookingDetailsDto(
//                bookId,
//                bookDate,
//                bookTime,
//                rescheduleReason
//        );
//
//        boolean isRescheduled = bookingDetailsModel.rescheduleBooking(bookingDetailsDto);
//        if(isRescheduled){
//            loadNextBookingId();
//            txtDate.setText("");
//            txtTime.setText("");
//            txtReason.setText("");
//            new Alert(Alert.AlertType.INFORMATION, "Booking Rescheduled").show();
//            loadTableData();
//        }else{
//            new Alert(Alert.AlertType.ERROR, "Reschedule fail").show();
//        }
//    }
//
//    public void refreshOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
//        refreshPage();
//    }
//
//    public void onClickTable(MouseEvent mouseEvent) {
//        BookingDetailsTM bookingDetailsTM = tblBook.getSelectionModel().getSelectedItem();
//        if(bookingDetailsTM != null){
//            lblBokk.setText(bookingDetailsTM.getBookId());
//            txtDate.setText(String.valueOf(bookingDetailsTM.getBookDate()));
//            txtTime.setText(bookingDetailsTM.getBookTime());
//            txtReason.setText(bookingDetailsTM.getRescheduleReason());
//
//            btnReschedule.setDisable(true);
//            btnUpdate.setDisable(false);
//            btnDelete.setDisable(false);
//        }
//    }
}
