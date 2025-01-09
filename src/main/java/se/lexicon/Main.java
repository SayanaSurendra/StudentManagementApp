package se.lexicon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.config.ComponentScanConfig;
import se.lexicon.data_access.StudentDao;
import se.lexicon.data_access.StudentDaoListImpl;
import se.lexicon.util.ScannerInputService;
import se.lexicon.util.UserInputService;


public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        StudentDao studentDao=context.getBean(StudentDaoListImpl.class);
        UserInputService userInputService=context.getBean(ScannerInputService.class);


    }
}