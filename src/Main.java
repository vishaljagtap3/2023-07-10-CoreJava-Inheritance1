public class Main {
    public static void main(String[] args) {

        Base b1 = new Base();
        b1.setB(99);

        Derived d1 = new Derived();
        d1.setB(100);
        d1.setD(200);
        System.out.println(d1.getB() + " " + d1.getD());
        d1.display();
        d1.displayD();

        System.out.println();

        b1.setB(300);
        System.out.println(d1.getB() + " " + d1.getD());

    }
}
