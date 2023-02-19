package _7_Wiring_using_AutoWired.On_Constructor.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;

    private final Mobile mobile;

    @Autowired
    public Person(Mobile mobile){
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mobile getMobile() {
        return mobile;
    }

//    public void setMobile(Mobile mobile) {
//        this.mobile = mobile;
//    }
}
