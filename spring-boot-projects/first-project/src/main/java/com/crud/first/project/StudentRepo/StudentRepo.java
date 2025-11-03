package com.crud.first.project.StudentRepo;

import com.crud.first.project.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
