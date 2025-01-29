package lk.ijse.gdse.finalproject.dao.custom;

import lk.ijse.gdse.finalproject.model.LessonsDto;
import lk.ijse.gdse.finalproject.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface LessonsDAO extends CrudDAO<LessonsDto>{
    public boolean saveLessons(LessonsDto lessonsDto) throws SQLException, ClassNotFoundException;
    ArrayList<String> getAlllesson() throws SQLException, ClassNotFoundException;
    boolean saveLessonList(ArrayList<LessonsDto> lessonsDTOS) throws SQLException, ClassNotFoundException;
}
