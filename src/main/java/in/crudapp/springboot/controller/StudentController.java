package in.crudapp.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.crudapp.springboot.entity.Student;
import in.crudapp.springboot.repository.StudentRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class StudentController {

	@Autowired
	StudentRepository studRepo;
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudents(){
		return new ResponseEntity<List<Student>> (studRepo.findAll(),HttpStatus.OK);
	}
	
	@PostMapping("/students")
	public ResponseEntity<Student> createStudent(@RequestBody Student stud){
		return new ResponseEntity<Student>(studRepo.save(stud),HttpStatus.CREATED);
	}
	
	@GetMapping("/students/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable Long id){
		return new ResponseEntity<Student>(studRepo.findById(id).get(),HttpStatus.OK);
	}
}
