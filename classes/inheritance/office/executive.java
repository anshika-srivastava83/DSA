package classes.inheritance.office;

public class executive extends employee{
    
    public executive(){
        System.out.println();
    }

    public executive(String name, int empId){
        super(name, empId);
    }

    public void makeDecision(){
        display();
        System.out.println("The decision lies in the hand of executive " + name);
    }
}

class ceo extends executive{                  //no use of public keyword, cause only one public class is allowed so java knows which is the main class
    
    public ceo(){
        System.out.println();
    }

    public ceo(String name, int empId){
        super(name, empId);
    }

    public void leadCompany(){
        System.out.println("The ceo is " + name);
        System.out.println("He leads the company");
    }
}
