package co.spring.homepractice.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee_Component {
    @Value("111")
    private int Id;

    @Value("Reema")
    private String name;

    private Address_Component address_component;

    public Address_Component getAddress_component() {
        return address_component;
    }
    @Autowired
    public void setAddress_component(Address_Component address_component) {
        this.address_component = address_component;
    }

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
}
