package com.sivasankar.spring.jpa.practices.hqlcrud;

import java.util.List;

import com.sivasankar.spring.jpa.practices.hqlcrud.entity.Student;

public class HibernateHQLApp {

	public static void main(String[] args) {

		StudentDao studentDao = new StudentDao();
		Student student = new Student("Siva", "", "siva@gmail.com");
		studentDao.saveStudent(student);

		studentDao.insertStudent();

		// update student
		Student student1 = new Student("Sankae", "", "sankar@gmail.com");
		studentDao.updateStudent(student1);

		// get students
		List<Student> students = studentDao.getStudents();
		System.out.println("**************** List of Students *****************");
		for (Student stud : students) {
			System.out.println(stud.toString());
		}

		System.out.println("*********************************");

		// get single student
		Student student2 = studentDao.getStudent(1);
		System.out.println(student2.getFirstName());

		// delete student
		studentDao.deleteStudent(1);

		// get students
		List<Student> students1 = studentDao.getStudents();
		System.out.println("**************** List of Students *****************");
		for (Student stud : students1) {
			System.out.println(stud.toString());
		}

	}

}
