package in.crudapp.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.crudapp.springboot.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
