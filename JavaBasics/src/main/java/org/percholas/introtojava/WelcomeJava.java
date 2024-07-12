package org.percholas.introtojava;

import java.lang.reflect.Method;

/* A class identifier in Java is the name given to a class. 
It follows specific naming conventions to ensure clarity, uniqueness, and readability in the code. 
By adhering to these conventions, you can write more organized and maintainable Java programs. */
public class WelcomeJava {
    /*
    The main method is the entry point into the JVM. It is the main
    interaction with th user. Without the main method, nothing happens.
      */
    public static void main(String[] args) {
        //This is a one line comment inside of my main method
        //And create another comment.
        System.out.println("Welcome Java");
//This is me practicing adding comments//
        String firstName;
        final int NUMBER = 100;

    }

/*Access Modifier (public):

public is an access modifier that means the method can be accessed from other classes. In other words, it is visible to all other classes.
Static Keyword (static):

static means that the method belongs to the class, not instances of the class. This means you can call this method without creating an object of the class.
Return Type (void):

void means that the method does not return any value. If a method were to return a value, this part would specify the data type of the returned value (e.g., int, String).
Method Name (myMethod):

myMethod is the name of the method. Method names should be descriptive of what the method does and follow camel case convention (the first letter is lowercase and each subsequent word starts with an uppercase letter).
Parentheses (()):

The parentheses can contain parameters (inputs to the method). In this case, the method does not take any parameters.
Method Body ({ ... }):

The curly braces {} enclose the body of the method. The body contains the code that defines what the method does.
Statement (System.out.println("Welcome to Java!");):

Inside the method body, there is a statement that prints "Welcome to Java!" to the console. This is the action performed by the method when it is called.
*/ 
    public static void myMethod(){
        System.out.println("Welcome to Java!");

    }
}
