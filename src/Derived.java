public class Derived extends Base {
    private int d;

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
