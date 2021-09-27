package classes.one;

import java.util.ArrayList;
/**
 * If there is a public class in a file, the name of the file must match the name of the public class
 * There can only be one public class per code file
 * A file can have more than one non public class
 * A file with no public class, can have names that do not match the code file
 */
public class ClassA {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Hello World");
    }

    public void myMethod(){}
}
