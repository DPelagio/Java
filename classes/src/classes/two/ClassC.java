package classes.two;

public class ClassC {
    // Constructor
    /**
     * They are provided by the developer or the compiler
     * they do not have a return type
     * they have the same name of the class
     * cannot be marked as static, final or abstract
     * take arguments and varargs
     * @param string
     */
    public ClassC(String string){
        this.myString = string;
    }

    // State
    public String myString = "Something";

    // Behavior
    public void doSomething(){
        System.out.println(myString);
    }
}
