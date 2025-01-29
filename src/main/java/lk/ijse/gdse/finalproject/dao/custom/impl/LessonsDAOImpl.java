package lk.ijse.gdse.finalproject.dao.custom.impl;

import lk.ijse.gdse.finalproject.dao.custom.LessonsDAO;
import lk.ijse.gdse.finalproject.model.LessonsDto;
import lk.ijse.gdse.finalproject.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LessonsDAOImpl implements LessonsDAO {

    @Override
    public String getNextId() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public ArrayList<LessonsDto> getAll() throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.execute("select * from training_lesson");
        ArrayList<LessonsDto> lessonsDtos = new ArrayList<>();
        while (rst.next()){
            LessonsDto lessonsDto = new LessonsDto(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4));
            lessonsDtos.add(lessonsDto);
        }
        return lessonsDtos;
    }
    public boolean save(LessonsDto lessonsDto) throws SQLException, ClassNotFoundException {
        Boolean isSaved=CrudUtil.execute("insert into training_lesson values(?,?,?,?)", lessonsDto.getLessonName(),lessonsDto.getTimePeriod(),lessonsDto.getStudentId(),lessonsDto.getInstructorId());

        return  isSaved;
    }
    @Override
    public boolean delete(String lessonName) throws SQLException, ClassNotFoundException {
        return CrudUtil.execute("delete from training_lesson where less_name=?", lessonName);
    }
    @Override
    public boolean update(LessonsDto lessonsDto) throws SQLException, ClassNotFoundException {
        return CrudUtil.execute(
                "update training_lesson set time_period=?, stu_id=?, instruc_id=? where less_name=?",
                lessonsDto.getTimePeriod(),
                lessonsDto.getStudentId(),
                lessonsDto.getInstructorId(),
                lessonsDto.getLessonName()
        );
    }
    @Override
    public ArrayList<String> getAlllesson() throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.execute("select less_name from training_lesson");

        ArrayList<String> lessons = new ArrayList<>();

        while (rst.next()){
            lessons.add(rst.getString(1));
        }

        return lessons;
    }
    @Override
public boolean saveLessonList(ArrayList<LessonsDto> lessonsDTOS) throws SQLException, ClassNotFoundException {
    for (LessonsDto lessonsDTO : lessonsDTOS) {
        boolean isLessonSaved = saveLessons(lessonsDTO);
        if (!isLessonSaved) {
            return false;
        }
    }
    return true;
}
    @Override

    public boolean saveLessons(LessonsDto lessonsDto) throws SQLException, ClassNotFoundException {
        return CrudUtil.execute("insert into training_lesson values (?, ?, ?, ?)",
                lessonsDto.getLessonName(),
                lessonsDto.getTimePeriod(),
                lessonsDto.getStudentId(),
                lessonsDto.getInstructorId());
    }
}
