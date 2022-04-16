package co.spring.homepractice.ConInject;

import java.util.List;

public class Person {
    private String name;
    private int personId;
    private Certificate ct;
    private List<String> list;


    public Person(String name,int personId,Certificate ct,List<String>list)
    {
        this.name =name;
        this.personId=personId;
        this.ct=ct;
        this.list=list;

    }

    @Override
    public String toString() {
        return this.name+" : "+this.personId+"{"+this.ct.cname+"}"+" " +this.list;
    }
}
