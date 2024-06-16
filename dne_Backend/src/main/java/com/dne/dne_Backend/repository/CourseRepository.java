package com.dne.dne_Backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dne.dne_Backend.entity.Course;



@Repository
public interface  CourseRepository extends JpaRepository<Course, Long> {


}
