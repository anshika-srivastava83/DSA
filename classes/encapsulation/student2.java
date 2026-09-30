package classes.encapsulation;

public class student2 {
    //attributes
    public int id;
    public int age;
    public String name;
    public int nos;
    private int marks;    //encapulated since marks is private
    private int age2;

    //getter function
    public int getMark(){    //how we access private attributes
        return this.marks;
    }

    //setter: we can set the value of attribute using a setter gunction
    public void setAge(int a){
        this.age2 = a;
    }

    //we need to make a getter function for age 2 since it is a private attribute
    public int getAge2(){
        return this.age2;
    }

    //default constructor
    public student2(){
        System.out.println("This is student default constructor");
    }


    //parameterised constructor
    public student2(int id, String name, int age, int nos, int marks, int age2){
        System.out.println("This is parameterised call for student class");
        
        //we have to do the below so the constructor can construct all the values as they are passed as arguments
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.marks = marks;
        this.age2 = age2;
    }

    //copy constructor
    /*
    public students(student src){                                 //here, the constructor copies the values of one object in another object 
        System.out.println("This is copy constructor call");     //so instead of this.id = id, we do, this.id = src.id where src is the source object
        this.id = src.id;
        this.name = src.name;
        this.age = src.age;
        this.nos = src.nos;
    }
    */

    //methods 
    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void study(){
        System.out.println(name + " is studying");
    }

    /* 
    private void mark(){
        System.out.println(name + "has average marks of" + marks);
    }
    */
    
}
