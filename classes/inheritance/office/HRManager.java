package classes.inheritance.office;

public class HRManager extends employee{
    
    public HRManager(){
        System.out.println();
    }

    public HRManager(String name, int empId){
        super(name, empId);
    }

    public void handleHRDuties(){
        System.out.println(name + " handles HR duties");
    }
}

class HRDirector extends HRManager{
    public HRDirector(){
        System.out.println();
    }

    public HRDirector(String name, int empId){
        super(name, empId);
    }

    public void manageHRDept(){
        System.out.println(name + " manages HR department");
    }
}