package classes.encapsulation;

public class student {
    //attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    //defaulot constructor
    public student(){
        System.out.println("This is student default constructor");
    }


    //parameterised constructor
    public student(int id, String name, int age, int nos){
        System.out.println("This is parameterised call for student class");
        
        //we have to do the below so the constructor can construct all the values as they are passed as arguments
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    //copy constructor
    public student(student src){                                 //here, the constructor copies the values of one object in another object 
        System.out.println("This is copy constructor call");     //so instead of this.id = id, we do, this.id = src.id where src is the source object
        this.id = src.id;
        this.name = src.name;
        this.age = src.age;
        this.nos = src.nos;
    }

    //methods 
    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void study(){
        System.out.println(name + " is studying");
    }
}
