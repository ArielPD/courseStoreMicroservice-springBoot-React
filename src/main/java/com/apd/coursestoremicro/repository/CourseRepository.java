package com.apd.coursestoremicro.repository;

import com.apd.coursestoremicro.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
