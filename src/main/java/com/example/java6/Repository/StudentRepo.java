package com.example.java6.Repository;

import com.example.java6.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, String> {
}
