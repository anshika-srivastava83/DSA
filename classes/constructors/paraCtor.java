package classes.constructors;

import classes.encapsulation.student;

public class paraCtor {
    //This is the second type of constructor
    //We pass the details as parameters(or arguments) when creating the object 
    public static void main(String[] args) {
        student A = new student(1,"rahul",14,5);
        System.out.println(A.name);
    }
}
