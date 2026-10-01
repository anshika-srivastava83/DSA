package classes.inheritance.office;

public class salesManager extends employee{
    public salesManager(){
        System.out.println();
    }

    public salesManager(String name, int empId){
        super(name, empId);
    }

    public void closeSales(){
        System.out.println("Sales manager " + name + " closes sales for the company");
    }
}


interface marketManagers{
    void createStrategy();
}

class businessDeveloper extends salesManager implements marketManagers{
    public businessDeveloper(){
        System.out.println();
    }

    public businessDeveloper(String name, int empId){
        super(name, empId);
    }

    public void createStrategy(){
        System.out.println("Business developer " + name + " also creates startegy");
    }
}