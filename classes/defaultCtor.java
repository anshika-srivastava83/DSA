package classes;

public class defaultCtor {
    //this is a main file that will run on default constructor but values of the student details will be given
    public static void main(String[] args) {
        student A = new student();
        A.name = "rahul";
        A.age = 18;
        A.id = 1;
        A.nos = 5;

        System.out.println("The details of student is:");
        System.out.println("Name :" + A.name + "\nAge: " + A.age + "\nID: "+ A.id + "\n Number of subjects studying: " + A.nos);  //this is attribute call 

        //behavior or method call
        A.sleep();
        A.study();    
    }
}
