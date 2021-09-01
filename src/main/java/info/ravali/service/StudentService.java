package info.ravali.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import info.ravali.binding.Student;
import info.ravali.entity.StudentEntity;
import info.ravali.repository.CourseRepository;
import info.ravali.repository.GenderRepository;
import info.ravali.repository.StudentRepository;
import info.ravali.repository.TimingRepository;

@Service
public class StudentService {
	@Autowired
	private CourseRepository courseRepo;
	@Autowired
	private GenderRepository genderRepo;
	@Autowired
	private TimingRepository timingRepo;
	@Autowired
	private StudentRepository studentRepo;

	public List<String> getByCourseName() {
		List<String> courseName = courseRepo.getCourseName();
		/*
		 * List<String> course = new ArrayList<>(); for(Course course1 : findAll) {
		 * course.add(course1.getCourseName()); } return course;
		 */
		/*List<String> courses = courseRepo.findAll().stream()
		 * .map(course -> course.getCourseName())
				.collect(Collectors.toList());
		return courses;*/
		return courseName;
	}
	public List<String> getGenderName(){
		List<String> byGenederName = genderRepo.getByGenederName();
		return byGenederName;
	}
	public List<String> getTimingName(){
		List<String> byTimingName = timingRepo.getByTimingName();
		return byTimingName;
	}
	public boolean saveStudent(Student student) {
		StudentEntity entity = new StudentEntity();
		BeanUtils.copyProperties(student, entity);
		StudentEntity save = studentRepo.save(entity);
		return save!=null & save.getStudentId()!=null;
	}
}
