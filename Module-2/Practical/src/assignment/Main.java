package assesment;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);
private static StudentDAO studentDAO = new StudentDAO();
private static CourseDAO courseDAO = new CourseDAO();
private static EnrollmentDAO enrollmentDAO = new EnrollmentDAO();

public static void main(String[] args) {
    while(true) {
     System.out.println("education system \n");
     System.out.println("1. Student Module");
     System.out.println("2. Course Module");
     System.out.println("3. Enrollment Module");
     System.out.println("4. Exit");
     System.out.print("Choose option: ");
     int option = Integer.parseInt(scanner.nextLine());

    switch(option) {
    case 1:
    studentModule();
    break;
    case 2:
    courseModule();
    break;
    case 3:
    enrollmentModule();
    break;
    case 4:
    System.out.println("Exiting...");
    System.exit(0);
    default:
     System.out.println("Invalid choice");
    }
   }
  }

 private static void studentModule() {
  try {
   System.out.println("\n--- Student Module ---");
   System.out.println("1. Add Student");
   System.out.println("2. View All Students");
   System.out.println("3. Search Student By ID");
   System.out.println("4. Update Student");
   System.out.println("5. Delete Student");
   System.out.print("Choose option: ");
   int choice = Integer.parseInt(scanner.nextLine());

  switch(choice) {
  case 1:
  System.out.print("Name: ");
  String name = scanner.nextLine();
  System.out.print("Email: ");
  String email = scanner.nextLine();
  System.out.print("Phone: ");
  String phone = scanner.nextLine();
  Student newStudent = new Student(name,email,phone);
  studentDAO.addStudent(newStudent);
  System.out.println("Student added.");
  break;
  case 2:
  List<Student> students = studentDAO.getAllStudents();
  for(Student s:students) {
   System.out.println(s.getStudentId()+" "+s.getName()+" "+s.getEmail()+" "+s.getPhone());
  }
  break;
  case 3:
  System.out.print("Enter student ID: ");
  int id = Integer.parseInt(scanner.nextLine());
  Student found = studentDAO.getStudentById(id);
  if(found!=null) {
   System.out.println(found.getStudentId()+" "+found.getName()+" "+found.getEmail()+" "+found.getPhone());
  } else {
    System.out.println("Student not found.");
  }
  break;
  case 4:
  System.out.print("Enter student ID to update: ");
  int updateId = Integer.parseInt(scanner.nextLine());
  System.out.print("New name: ");
  String newName = scanner.nextLine();
  System.out.print("New email: ");
  String newEmail = scanner.nextLine();
  System.out.print("New phone: ");
  String newPhone = scanner.nextLine();
  Student updateStudent = new Student(updateId,newName,newEmail,newPhone);
  studentDAO.updateStudent(updateStudent);
  System.out.println("Student updated.");
  break;
  case 5:
  System.out.print("Enter student ID to delete: ");
  int deleteId = Integer.parseInt(scanner.nextLine());
  studentDAO.deleteStudent(deleteId);
  System.out.println("Student deleted.");
  break;
  default:
  System.out.println("Invalid choice.");
  }
  }catch(SQLException e) {
   System.out.println("Error: "+e.getMessage());
  }
 }

private static void courseModule() {
 try {
 System.out.println("\n--- Course Module ---");
 System.out.println("1. Add Course");
 System.out.println("2. View All Courses");
 System.out.println("3. Search Course By ID");
 System.out.println("4. Update Course");
 System.out.println("5. Delete Course");
 System.out.print("Choose option: ");
 int choice = Integer.parseInt(scanner.nextLine());

 switch(choice) {
  case 1:
  System.out.print("Title: ");
  String title = scanner.nextLine();
  System.out.print("Duration (days): ");
  int duration = Integer.parseInt(scanner.nextLine());
  System.out.print("Fees: ");
  double fees = Double.parseDouble(scanner.nextLine());
  Course newCourse = new Course(title,duration,fees);
  courseDAO.addCourse(newCourse);
  System.out.println("Course added.");
  break;
  case 2:
  List<Course> courses = courseDAO.getAllCourses();
  for(Course c:courses) {
   System.out.println(c.getCourseId()+" "+c.getTitle()+" "+c.getDuration()+" "+c.getFees());
  }
  break;
  case 3:
  System.out.print("Enter course ID: ");
  int id = Integer.parseInt(scanner.nextLine());
  Course found = courseDAO.getCourseById(id);
  if(found!=null) {
   System.out.println(found.getCourseId()+" "+found.getTitle()+" "+found.getDuration()+" "+found.getFees());
  } else {
    System.out.println("Course not found.");
  }
  break;
  case 4:
  System.out.print("Enter course ID to update: ");
  int updateId = Integer.parseInt(scanner.nextLine());
  System.out.print("New title: ");
  String newTitle = scanner.nextLine();
  System.out.print("New duration: ");
  int newDuration = Integer.parseInt(scanner.nextLine());
  System.out.print("New fees: ");
  double newFees = Double.parseDouble(scanner.nextLine());
  Course updateCourse = new Course(updateId,newTitle,newDuration,newFees);
  courseDAO.updateCourse(updateCourse);
  System.out.println("Course updated.");
  break;
  case 5:
  System.out.print("Enter course ID to delete: ");
  int deleteId = Integer.parseInt(scanner.nextLine());
  courseDAO.deleteCourse(deleteId);
  System.out.println("Course deleted.");
  break;
  default:
  System.out.println("Invalid choice.");
 }
 } catch(SQLException e) {
  System.out.println("Error: "+e.getMessage());
 }
}

private static void enrollmentModule() {
 try {
 System.out.println("\n--- Enrollment Module ---");
 System.out.println("1. Enroll Student in Course");
 System.out.println("2. View All Enrollments");
 System.out.println("3. View Enrollments By Student");
 System.out.println("4. Cancel Enrollment");
 System.out.print("Choose option: ");
 int choice = Integer.parseInt(scanner.nextLine());

 switch(choice) {
  case 1:
  System.out.print("Student ID: ");
  int studentId = Integer.parseInt(scanner.nextLine());
  System.out.print("Course ID: ");
  int courseId = Integer.parseInt(scanner.nextLine());
  Date enrollmentDate = new Date(System.currentTimeMillis());
  Enrollment enrollment = new Enrollment(studentId,courseId,enrollmentDate);
  enrollmentDAO.enrollStudent(enrollment);
  System.out.println("Enrollment successful.");
  break;
  case 2:
  List<Enrollment> enrollments = enrollmentDAO.getAllEnrollments();
  for(Enrollment e:enrollments) {
   System.out.println(e.getEnrollmentId()+" StudentID:"+e.getStudentId()+" CourseID:"+e.getCourseId()+" Date:"+e.getEnrollmentDate());
  }
  break;
  case 3:
  System.out.print("Enter student ID: ");
  int sId = Integer.parseInt(scanner.nextLine());
  List<Enrollment> studentEnrollments = enrollmentDAO.getEnrollmentsByStudent(sId);
  for(Enrollment e:studentEnrollments) {
   System.out.println(e.getEnrollmentId()+" StudentID:"+e.getStudentId()+" CourseID:"+e.getCourseId()+" Date:"+e.getEnrollmentDate());
  }
  break;
  case 4:
  System.out.print("Enter enrollment ID to cancel: ");
  int eId = Integer.parseInt(scanner.nextLine());
  enrollmentDAO.cancelEnrollment(eId);
  System.out.println("Enrollment cancelled.");
  break;
  default:
  System.out.println("Invalid choice.");
 }
 }catch(SQLException e) {
  System.out.println("Error: "+e.getMessage());
 }
}
}
//Write a Java program that performs the following CRUD operations:
//Write SQL queries for:  Inserting a record into a table.  Updating specific fields of a record.  Selecting records based on certain conditions.  Deleting specific records. 
//o Implement these queries in Java using JDBC.