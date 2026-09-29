package classes;

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
        
    }
}
