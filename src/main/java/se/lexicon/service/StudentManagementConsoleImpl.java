package se.lexicon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se.lexicon.data_access.StudentDao;
import se.lexicon.models.Student;
import se.lexicon.util.UserInputService;

import java.util.List;

@Component
public class StudentManagementConsoleImpl implements StudentManagement{


    private final UserInputService userInputService;
    private final StudentDao studentDao;

    @Autowired
    public StudentManagementConsoleImpl(UserInputService userInputService, StudentDao studentDao) {
        this.userInputService = userInputService;
        this.studentDao = studentDao;
    }


    @Override
    public Student create() {
        Student student=new Student(userInputService.getInt(),userInputService.getString());
        return student;
    }

    @Override
    public Student save(Student student) {
        return studentDao.save(student) ;
    }

    @Override
    public Student find(int id) {
        return studentDao.find(id);
    }

    @Override
    public Student remove(int id) {
       Student student= studentDao.find(id);
       studentDao.delete(id);
       return student;
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Student edit(Student student) {
        Student studentUpdated=studentDao.find(student.getId());
        studentUpdated.setName(student.getName());
        return  studentDao.save(studentUpdated);
    }
}
