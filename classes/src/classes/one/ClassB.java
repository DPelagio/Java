package classes.one;

import classes.two.ClassC;

/**
 * Class Modifiers: Access modifiers
 */
public class ClassB {
    /**
     * Variables can be instance variables or local vairables
     * Instance variables are inside the class scope
     * Local variables are declare inside the method scode, including the method arguments
     * Variables can be primitives or refetences
     * Primitive variables can be of 8 types: char, boolean, shot, int, long, float, double, byte
     * Refetences point to an instance (Object)
     * Once declared, a variable cannot change its type
     */ 
    public int instanceVariable = 5;

    public static void main(String[] args) {
        ClassC instanceOfClassC = new ClassC("hola");
        instanceOfClassC.doSomething();
    }

    public void myMethod(int localVariable) {
        int localVariable2 = localVariable;

        System.out.println("local variables live in methods");
        System.out.println("the value of the local variable localVariable2 is " + localVariable2);
    }
}
