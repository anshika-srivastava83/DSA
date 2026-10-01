package classes.inheritance.office;

public class marketManager extends employee{
    public marketManager(){
        System.out.println();
    }

    public marketManager(String name, int empId){
        super(name, empId);
    }

    public void createStrategy(){
        System.out.println("The market manager " + name + " handles and creates market strategy");
    }
}
