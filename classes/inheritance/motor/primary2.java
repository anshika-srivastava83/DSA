package classes.inheritance.motor;

public class primary2 {
    public static void main(String[] args) {
        car c = new car("Maruti" , "800", 4, 5, "automatic");
        c.startEng();
        c.startAC();
        c.stopEng();
    }
}
