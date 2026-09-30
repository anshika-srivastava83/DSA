package classes.constructors;

import classes.encapsulation.student;

public class copyCtor {
    public static void main(String[] args) {
        student A = new student(1,"rahul",14,5);
        //System.out.println(A.name);
        student B = new student(A);
        System.out.println(B.name);
    }
}
