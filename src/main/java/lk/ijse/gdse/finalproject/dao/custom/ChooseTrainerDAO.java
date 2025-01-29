package lk.ijse.gdse.finalproject.dao.custom;

import lk.ijse.gdse.finalproject.model.ChooseTrainerDto;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ChooseTrainerDAO extends CrudDAO<ChooseTrainerDto>{
    boolean saveChooseTrainer(ArrayList<ChooseTrainerDto> chooseTrainerDTOS) throws SQLException, ClassNotFoundException;
}
