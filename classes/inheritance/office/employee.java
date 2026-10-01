package classes.inheritance.office;

public class employee {
    protected String name;
    protected int empId;

    public employee(){
        System.out.println();
    }

    public employee(String name, int empId){
        this.name = name;
        this.empId = empId;
    }

    public void display(){
        System.out.println("The employee " + name + " has id " + empId);
    }
}

