package co.spring.homepractice.beanlifecycle;

public class Samosa {
    private double price;

    public Samosa() {
        super();
    }

    public void init()
    {
        System.out.println("Inside init method");
    }
    public void destroy()
    {
        System.out.println("Inside destroy method");
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa [price = "+this.price+"]";
    }
}
