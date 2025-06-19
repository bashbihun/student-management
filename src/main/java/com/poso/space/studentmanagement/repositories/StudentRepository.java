package com.poso.space.studentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poso.space.studentmanagement.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
