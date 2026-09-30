package classes.inheritance;

public class vehicle {
    // class superClass {
    //     //methods and attributes 
    // }

    // class subClass extends superClass{
    //     //inherts attributes and methods from superClass
    // }

    public String name;
    public String model;
    public int noOfTyres;

    vehicle(){
        System.out.println();
    }

    vehicle(String name, String model, int noOfTyres){
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    public void startEng()
    {
        System.out.println("Engine is starting of "+ name + " of model " + model);
    }

    public void stopEng(){
        System.out.println("Engine of " + name + " of model " + model + " is stopping");
    }
}
