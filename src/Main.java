public class Main {
    public static void main(String[] args) {

        Derived d1 = new Derived();
        d1.display();
        System.out.println();

        Derived d2 = new Derived(100, 200);
        d2.display();


        /*Base b1 = new Base();
        b1.setB(99);*/

        /*Derived d1 = new Derived();
        d1.setB(100);
        d1.setD(200);
        System.out.println(d1.getB() + " " + d1.getD());
        d1.display();
        d1.displayD();
        d1.display();*/

        /*System.out.println();

        b1.setB(300);
        System.out.println(d1.getB() + " " + d1.getD());*/

    }
}
