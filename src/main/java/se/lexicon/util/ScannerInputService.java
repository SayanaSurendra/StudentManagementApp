package se.lexicon.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;


//@Component
public class ScannerInputService implements UserInputService{


    private final Scanner scanner;

  //  @Autowired
    public ScannerInputService(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getString() {
        System.out.print("Enter a string: ");
        String  name=scanner.nextLine();
        return name;
    }

    @Override
    public int getInt() {
        System.out.print("Enter an integer: ");

         return Integer.parseInt(scanner.nextLine());
    }
}
