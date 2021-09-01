package info.ravali.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import info.ravali.entity.Courses;

public interface CourseRepository extends JpaRepository<Courses, Serializable>{
	
	@Query("select courseName from Courses")
	public List<String> getCourseName();
}
