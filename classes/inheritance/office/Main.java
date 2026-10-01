package classes.inheritance.office;

public class Main {
    public static void main(String[] args) {
        developer d = new developer("rahul" , 101, "java");
        employee e = new employee("riya" , 102);
        executive ex = new executive("harshita" , 103);
        HRManager h = new HRManager("priya" , 104);
        marketManager m = new marketManager("ansh", 105);
        salesManager s = new salesManager("ram", 106);
        HRDirector hd = new HRDirector("aysh", 107);
        businessDeveloper bd = new businessDeveloper("rishi", 108);

        d.show();
        e.display();
        //ex.display();
        ex.makeDecision();
        h.handleHRDuties();
        hd.display();
        hd.manageHRDept();
        m.createStrategy();
        s.display();
        s.closeSales();
        bd.createStrategy();
        bd.closeSales();

    }
}
