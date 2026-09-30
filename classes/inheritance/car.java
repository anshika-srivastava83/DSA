package classes.inheritance;

public class car extends vehicle{
    public int noOfDoors;
    public String transmissionType;

    car()
    {
        System.out.println();
    }

    car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType){
        super(name, model, noOfTyres);           //super is used so the values can be set/invoked using the parent class i.e., initialising 
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
        /*
        super.startEng();
        super.endEng();
        this is how we invoke the imeediate parent class' methods but it's rarely used
        */
    }

    public void startAC(){
        System.out.println("AC started of " + name);
    }

}
