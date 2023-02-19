package _8_autowired_multipleSameBeans.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person_withPrimary {

    private String name = "Person_withPrimary";

    private Mobile mobile;

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    @Autowired
    public Person_withPrimary(Mobile mobile){
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
