package se.lexicon.data_access;

import org.springframework.stereotype.Component;
import se.lexicon.models.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Component
public class StudentDaoListImpl implements StudentDao{
    private List<Student> students;

    public StudentDaoListImpl() {
        this.students = new ArrayList<>();
    }

    @Override
    public Student save(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student find(int id) {

      return students.stream().filter(student -> student.getId()== id).findFirst().orElse(null);
    }

    @Override
    public List<Student> findAll() {
     return Collections.unmodifiableList(students);
    }

    @Override
    public void delete(int id) {
     students.remove(find(id));

    }
}
