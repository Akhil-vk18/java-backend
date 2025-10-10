package javaBackend01.hibernateProject;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Marks a Java class as database table
//default table name will be class name
// for naming table use @Table(name="student-table")
@Table(name = "student_data")
public class Student {
	@Id // Defines the primary key (essential for Hibernate to track rows)
	private int id;
	@Column(name = "student_Name")
	private String name;
	private String studentclass;
	@Embedded
	private Marks student_marks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", studentclass=" + studentclass + "]";
	}

	public String getStudentclass() {
		return studentclass;
	}

	public void setStudentclass(String studentclass) {
		this.studentclass = studentclass;
	}

	public Marks getStudent_marks() {
		return student_marks;
	}

	public void setStudent_marks(Marks student_marks) {
		this.student_marks = student_marks;
	}

}
