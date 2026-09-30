package classes;

import classes.encapsulation.student;
import classes.encapsulation.student2;

public class primary {
    public static void main(String[] args) {
        student s1 = new student();
        System.out.println(s1.name);   //give null as O/P since default constructor was used
        
        /*when we do : 
        student A = new student() 
        it's default ctor

        student A = new student(parameters); 
        it becomes parameterised ctor

        student B = new student(A)
        it becomes copy ctor
        */

        //ENCAPSULATION
        student2 A = new student2(1, "rekha", 18, 6, 49, 20);
        System.out.println(A.getMark());
        /*
        A.mark(); 
        it shows that this method is not visible
        */

        /* 
        A.age2 = 20; 
        shows the age2 is not visible as an attribute
        */

        
        System.out.println(A.getAge2());
        A.setAge(20);
        System.out.println(A.getAge2());
    }
}
