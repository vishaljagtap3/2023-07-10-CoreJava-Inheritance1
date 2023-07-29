public class Derived extends Base {
    private int d;

    public Derived() {
        System.out.println("Derived()");
        d = 20;
    }

    public Derived(int b, int d) {
        super(b);
        System.out.println("Derived(int, int)");
        //this.b = b; //can not be done
        //setB(b); not needed now
        this.d = d;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void displayD() {
        System.out.println("d = " + d);
    }

    public void display() {
        super.display();
        System.out.println("b = " + getB() + " d = " + d);
    }
}
