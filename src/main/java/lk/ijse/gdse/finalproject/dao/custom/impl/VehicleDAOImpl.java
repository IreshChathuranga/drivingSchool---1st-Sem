package lk.ijse.gdse.finalproject.dao.custom.impl;

import lk.ijse.gdse.finalproject.dao.custom.VehicleDAO;
import lk.ijse.gdse.finalproject.model.VehicleDto;
import lk.ijse.gdse.finalproject.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class VehicleDAOImpl implements VehicleDAO {
    @Override
    public String getNextId() throws SQLException, ClassNotFoundException {
        ResultSet rst=CrudUtil.execute("select vehi_id from vehicle order by vehi_id desc limit 1");
        if(rst.next()){
            String lastId = rst.getString(1);
            String subString = lastId.substring(1);
            int i = Integer.parseInt(subString);
            int newIdIndex = i+1;
            return String.format("V%03d",newIdIndex);
        }
        return  "V001";

    }
    @Override
    public ArrayList<VehicleDto> getAll() throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.execute("select * from vehicle");
        ArrayList<VehicleDto> vehicleDtos = new ArrayList<>();
        while (rst.next()){
            VehicleDto vehicleDto = new VehicleDto(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getDouble(3),
                    rst.getString(4));
            vehicleDtos.add(vehicleDto);
        }
        return vehicleDtos;
    }
    @Override
    public boolean save(VehicleDto vehicleDto) throws SQLException, ClassNotFoundException {
        Boolean isSaved = CrudUtil.execute("insert into vehicle values(?,?,?,?)",
                vehicleDto.getVehicleId(),vehicleDto.getVehicleType(),vehicleDto.getLessonFee(),vehicleDto.getAdminId());
        return isSaved;
    }
    @Override
    public boolean delete(String vehicleId) throws SQLException, ClassNotFoundException {
        return  CrudUtil.execute("delete from vehicle where vehi_id=?", vehicleId);
    }
    @Override
    public boolean update(VehicleDto vehicleDto) throws SQLException, ClassNotFoundException {
        return CrudUtil.execute(
                "update vehicle set vehi_type=?, lesson_fee=?,  admin_id=? where vehi_id=?",
                vehicleDto.getVehicleType(),
                vehicleDto.getLessonFee(),
                vehicleDto.getAdminId(),
                vehicleDto.getVehicleId()
        );
    }
    @Override
    public ArrayList<String> getAllVehicleType() throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.execute("select vehi_type from vehicle");

        ArrayList<String> vehicleType = new ArrayList<>();

        while (rst.next()){
            vehicleType.add(rst.getString(1));
        }

        return vehicleType;
    }
}
