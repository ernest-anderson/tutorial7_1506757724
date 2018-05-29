package com.example.service;

import java.util.List;
import com.example.model.CourseModel;
import com.example.model.StudentModel;

public interface StudentService {
	StudentModel selectStudent(String npm);
	
	CourseModel selectCourse(String id_course);

	List<StudentModel> selectAllStudents();

	void addStudent(StudentModel student);

	void deleteStudent(String npm);

	void updateStudent(StudentModel student);
}
