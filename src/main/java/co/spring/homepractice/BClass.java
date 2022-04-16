package co.spring.homepractice;

public class BClass {
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public BClass(int y) {
        this.y = y;
    }

    public BClass() {
        super();
    }

    @Override
    public String toString() {
        return "BClass{" +
                "y=" + y +
                '}';
    }
}
