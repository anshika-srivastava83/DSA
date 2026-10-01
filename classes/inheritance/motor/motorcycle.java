package classes.inheritance.motor;

public class motorcycle extends vehicle{
    public String handleBarStyle;
    public String suspensionType;

    motorcycle(){
        System.out.println();
    }

    motorcycle(String name, String model, int noOfTyres, String handleBarStyle, String suspensionType){
        super(name, model, noOfTyres);
        this.handleBarStyle = handleBarStyle;
        this.suspensionType = suspensionType;
    }

    public void wheelie(){
        System.out.println(name + "can perform wheelie");
    }
}
