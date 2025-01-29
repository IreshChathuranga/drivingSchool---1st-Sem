package lk.ijse.gdse.finalproject.bo.custom.impl;

import lk.ijse.gdse.finalproject.bo.custom.CoursesBO;
import lk.ijse.gdse.finalproject.dao.custom.CoursesDAO;
import lk.ijse.gdse.finalproject.dao.custom.impl.CoursesDAOImpl;
import lk.ijse.gdse.finalproject.model.CoursesDto;

import java.sql.SQLException;
import java.util.ArrayList;

public class CoursesBOImpl implements CoursesBO {
    CoursesDAO coursesDAO = new CoursesDAOImpl();
    public String getNextCourseId() throws SQLException, ClassNotFoundException {
        return coursesDAO.getNextId();
    }
    public ArrayList<CoursesDto> getAllCourse() throws SQLException, ClassNotFoundException {
        ArrayList<CoursesDto> coursesDtos = coursesDAO.getAll();
        return coursesDtos;
    }
    public boolean saveCourse(CoursesDto coursesDto) throws SQLException, ClassNotFoundException {
        return coursesDAO.save(coursesDto);
    }
    public boolean deleteCourse(String courseId) throws SQLException, ClassNotFoundException {
        return coursesDAO.delete(courseId);
    }
    public boolean updateCourse(CoursesDto coursesDto) throws SQLException, ClassNotFoundException {
       return coursesDAO.update(coursesDto);
    }
}
