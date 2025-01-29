package lk.ijse.gdse.finalproject.bo.custom.impl;

import lk.ijse.gdse.finalproject.bo.custom.LessonsBO;
import lk.ijse.gdse.finalproject.dao.custom.LessonsDAO;
import lk.ijse.gdse.finalproject.dao.custom.impl.LessonsDAOImpl;
import lk.ijse.gdse.finalproject.model.LessonsDto;

import java.sql.SQLException;
import java.util.ArrayList;

public class LessonsBOImpl implements LessonsBO {
    LessonsDAO lessonsDAO = new LessonsDAOImpl();
    public ArrayList<LessonsDto> getAllLessons() throws SQLException, ClassNotFoundException {
        ArrayList<LessonsDto> lessonsDtos = lessonsDAO.getAll();
        return lessonsDtos;
    }
    public boolean saveLesson(LessonsDto lessonsDto) throws SQLException, ClassNotFoundException {
       return lessonsDAO.save(lessonsDto);
    }
    public boolean deleteLesson(String lessonName) throws SQLException, ClassNotFoundException {
        return lessonsDAO.delete(lessonName);
    }
    public boolean updateLesson(LessonsDto lessonsDto) throws SQLException, ClassNotFoundException {
        return lessonsDAO.update(lessonsDto);
    }
    public ArrayList<String> getAlllesson() throws SQLException, ClassNotFoundException {
        return lessonsDAO.getAlllesson();
    }
    public boolean saveLessonList(ArrayList<LessonsDto> lessonsDTOS) throws SQLException, ClassNotFoundException {
        return lessonsDAO.saveLessonList(lessonsDTOS);
    }

    public boolean saveLessons(LessonsDto lessonsDto) throws SQLException, ClassNotFoundException {
        return lessonsDAO.saveLessons(lessonsDto);
    }
}
