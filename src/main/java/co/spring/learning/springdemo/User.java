package co.spring.learning.springdemo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

private String firstName;
private String lastName;
private String courseName;
List<String> hobbies;
public void init()
{
    if(hobbies==null)
        hobbies=new ArrayList<>();
    hobbies.add("coding");

}



}
