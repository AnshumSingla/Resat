package com.alibou.example;

//import com.alibou.example.practice.Order;
//import com.alibou.example.practice.OrderRecord;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class StudentController {

    private final StudentRepository repository;


    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/students")
    public Student post(
            @RequestBody StudentDto student
    ) {
        return repository.save(toStudent(student));
    }

    private Student toStudent(StudentDto dto) {
        var student = new Student();
        student.setFirstName(dto.firstname());
        student.setLastName(dto.lastname());
        student.setEmail(dto.email());
        student.setAge(dto.age());
        var school = new School();
        school.setId(dto.schoolId());
        student.setSchool(school);
        return student;
    }

    @GetMapping("/students")
    public List<Student> findAllStudent() {
        return repository.findAll();
    }

    @GetMapping("/students/{student-id}")
    public Student findStudentByID(
            @PathVariable("student-id") Integer id
    ){
        return repository.findById(id).orElse(null);
    }

    @GetMapping("/students/search/{student-name}")
    public List<Student> findStudentByName(
            @PathVariable("student-name") String name
    ){
        return repository.findByFirstNameContaining(name);
    }
    @DeleteMapping("/students/{student-id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteStudentByID(
            @PathVariable("student-id") Integer id
    ){
        repository.deleteById(id);
    }
}
