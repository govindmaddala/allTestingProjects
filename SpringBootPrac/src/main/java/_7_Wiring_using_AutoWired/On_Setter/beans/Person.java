package _7_Wiring_using_AutoWired.On_Setter.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;

    private Mobile mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mobile getMobile() {
        return mobile;
    }

    @Autowired
    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }
}
