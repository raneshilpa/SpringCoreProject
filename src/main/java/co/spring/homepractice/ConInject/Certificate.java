package co.spring.homepractice.ConInject;

public class Certificate {

   String cname;

    public Certificate(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return this.cname;
    }
}
