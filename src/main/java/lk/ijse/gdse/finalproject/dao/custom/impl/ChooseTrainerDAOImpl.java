package lk.ijse.gdse.finalproject.dao.custom.impl;

import lk.ijse.gdse.finalproject.dao.custom.ChooseTrainerDAO;
import lk.ijse.gdse.finalproject.model.ChooseTrainerDto;
import lk.ijse.gdse.finalproject.util.CrudUtil;

import java.sql.SQLException;
import java.util.ArrayList;

public class ChooseTrainerDAOImpl implements ChooseTrainerDAO {
    @Override
    public boolean saveChooseTrainer(ArrayList<ChooseTrainerDto> chooseTrainerDTOS) throws SQLException, ClassNotFoundException {
        for (ChooseTrainerDto chooseTrainerDTO : chooseTrainerDTOS) {
            boolean isChooseTrainerSaved = save(chooseTrainerDTO);
            if (!isChooseTrainerSaved) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean save(ChooseTrainerDto chooseTrainerDto) throws SQLException, ClassNotFoundException {
        return CrudUtil.execute("insert into choose_trainer values (?, ?)",
                chooseTrainerDto.getBookId(),
                chooseTrainerDto.getInstructorId());
    }

    @Override
    public String getNextId() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public ArrayList<ChooseTrainerDto> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean update(ChooseTrainerDto dto) throws SQLException, ClassNotFoundException {
        return false;
    }
}
