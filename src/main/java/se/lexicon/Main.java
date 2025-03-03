package se.lexicon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.config.ComponentScanConfig;
import se.lexicon.data_access.StudentDao;
import se.lexicon.data_access.StudentDaoListImpl;
import se.lexicon.service.StudentManagement;
import se.lexicon.service.StudentManagementConsoleImpl;
import se.lexicon.util.ScannerInputService;
import se.lexicon.util.UserInputService;


public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ComponentScanConfig.class);

        StudentDao studentDao=context.getBean(StudentDaoListImpl.class);
        UserInputService userInputService=context.getBean(ScannerInputService.class);
        StudentManagement studentManagement=context.getBean(StudentManagementConsoleImpl.class);

        studentManagement.save( studentManagement.create());
        studentManagement.save( studentManagement.create());
        System.out.println(studentManagement.findAll());
        System.out.println(studentManagement.find(1));
        System.out.println(studentManagement.remove(1));
        System.out.println(studentManagement.findAll());



    }
}