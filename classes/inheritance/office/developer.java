package classes.inheritance.office;

public class developer extends employee{
    private String progLang;

    public developer(){
        System.out.println();
    }

    public developer(String name, int empId, String progLang){
        super(name, empId);
        this.progLang = progLang;
    }

    public void show(){
        display();
        System.out.println("The developer uses " + progLang + " language");
    }
}
