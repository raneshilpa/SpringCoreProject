package co.spring.homepractice;

public class AClass {
    private int x;
    private BClass ob;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public BClass getOb() {
        return ob;
    }

    public void setOb(BClass ob) {
        this.ob = ob;
    }

    public AClass() {
        super();
    }

    @Override
    public String toString() {
        return "AClass{" +
                "x=" + x +
                ", ob=" + ob +
                '}';
    }
}
