package info.ravali.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import info.ravali.binding.Student;
import info.ravali.entity.StudentEntity;
import info.ravali.repository.StudentRepository;
import info.ravali.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/student")
	public String loadStudentForm(Model model) {
		
		model.addAttribute("course",studentService.getByCourseName());
		model.addAttribute("gender",studentService.getGenderName());
		model.addAttribute("timing",studentService.getTimingName());
		model.addAttribute("student",new Student());
		
		return "studentReg";
	}
	@PostMapping("/savedata")
	public String msgForm(Student student,Model model) {
		System.out.println(student);
		studentService.saveStudent(student);
	return "saveReg";	
	}
}
