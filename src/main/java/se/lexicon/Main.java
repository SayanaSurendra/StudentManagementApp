package se.lexicon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.config.ComponentScanConfig;
import se.lexicon.data_access.StudentDao;
import se.lexicon.data_access.StudentDaoListImpl;


public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        StudentDao studentDao=context.getBean(StudentDaoListImpl.class);


    }
}