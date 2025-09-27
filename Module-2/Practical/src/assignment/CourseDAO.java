package assesment;

import java.sql.*;
import java.util.*;

public class CourseDAO {

    public void addCourse(Course c) throws SQLException {
        String sql = "INSERT INTO Course (title, duration, fees) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.createConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, c.getTitle());
            ps.setInt(2, c.getDuration());
            ps.setDouble(3, c.getFees());
            ps.executeUpdate();
        }
    }

    public List<Course> getAllCourses() throws SQLException {
        List<Course> courses = new ArrayList<>();
        String sql = "SELECT * FROM Course";
        try (Connection conn = DBConnection.createConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Course c = new Course(
                    rs.getInt("course_id"),
                    rs.getString("title"),
                    rs.getInt("duration"),
                    rs.getDouble("fees")
                );
                courses.add(c);
            }
        }
        return courses;
    }

    public Course getCourseById(int id) throws SQLException {
        String sql = "SELECT * FROM Course WHERE course_id = ?";
        try (Connection conn = DBConnection.createConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Course(
                        rs.getInt("course_id"),
                        rs.getString("title"),
                        rs.getInt("duration"),
                        rs.getDouble("fees")
                    );
                } else {
                    return null;
                }
            }
        }
    }

    public void updateCourse(Course c) throws SQLException {
        String sql = "UPDATE Course SET title = ?, duration = ?, fees = ? WHERE course_id = ?";
        try (Connection conn = DBConnection.createConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, c.getTitle());
            ps.setInt(2, c.getDuration());
            ps.setDouble(3, c.getFees());
            ps.setInt(4, c.getCourseId());
            ps.executeUpdate();
        }
    }

    public void deleteCourse(int id) throws SQLException {
        String sql = "DELETE FROM Course WHERE course_id = ?";
        try (Connection conn = DBConnection.createConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }
}
//o Write a program that executes a SELECT query and processes the ResultSettodisplay records from the database