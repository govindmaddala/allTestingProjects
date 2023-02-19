package _8_autowired_multipleSameBeans.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person_withQualifier {
    private String name = "Person_withQualifier";
    private Mobile mobile;

    public Person_withQualifier(@Qualifier("mobile3") Mobile mobile){
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    //    public void setName(String name) {
//        this.name = name;
//    }
}
