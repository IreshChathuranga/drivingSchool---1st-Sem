package lk.ijse.gdse.finalproject.dao.custom.impl;

import lk.ijse.gdse.finalproject.dao.custom.MaintainersDAO;
import lk.ijse.gdse.finalproject.model.MaintainersDto;
import lk.ijse.gdse.finalproject.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MaintainersDAOImpl implements MaintainersDAO {
    @Override
    public String getNextId() throws SQLException, ClassNotFoundException {
        ResultSet rst=CrudUtil.execute("select maintain_id from maintainer order by maintain_id desc limit 1");
        if(rst.next()){
            String lastId = rst.getString(1);
            String subString = lastId.substring(1);
            int i = Integer.parseInt(subString);
            int newIdIndex = i+1;
            return String.format("M%03d",newIdIndex);
        }
        return  "M001";

    }
    @Override
    public ArrayList<MaintainersDto> getAll() throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.execute("select * from maintainer");
        ArrayList<MaintainersDto> maintainersDtos = new ArrayList<>();
        while (rst.next()){
            MaintainersDto maintainersDto =  new MaintainersDto(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getInt(4));
            maintainersDtos.add(maintainersDto);
        }
        return maintainersDtos;
    }
    @Override
    public boolean save(MaintainersDto maintainersDto) throws SQLException, ClassNotFoundException {
        Boolean isSaved = CrudUtil.execute("insert into maintainer values(?,?,?,?)",maintainersDto.getMaintainId(),maintainersDto.getMaintainName(),maintainersDto.getMaintainTask(),maintainersDto.getContactNumber());
        return isSaved;
    }
    @Override
    public boolean delete(String maintainId) throws SQLException, ClassNotFoundException {
        return  CrudUtil.execute("delete from maintainer where maintain_id=?", maintainId);
    }
    @Override
    public boolean update(MaintainersDto maintainersDto) throws SQLException, ClassNotFoundException {
        return CrudUtil.execute(
                "update maintainer set maintain_name=?, maintain_task=?,  contact_number=? where maintain_id=?",
                maintainersDto.getMaintainName(),
                maintainersDto.getMaintainTask(),
                maintainersDto.getContactNumber(),
                maintainersDto.getMaintainId()
        );
    }
}
