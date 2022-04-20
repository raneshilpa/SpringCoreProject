package co.spring.homepractice.Annotations;


import org.springframework.beans.factory.annotation.Autowired;

public class Employee
{
    private int Id;
    private String name;

    @Autowired
    public Employee(int id, String name, Address address) {
        Id = id;
        this.name = name;
        this.address = address;
    }

    //@Autowired
    private Address address;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
