package _6_Wiring_using_methodParam.config;

import _6_Wiring_using_methodParam.beans.Mobile;
import _6_Wiring_using_methodParam.beans.Person;
import org.springframework.context.annotation.Bean;

public class ProjectConfig {

    @Bean
    public Mobile mobile(){
        var mobile = new Mobile();
        mobile.setName("MAC IPHONE");
        return mobile;
    }

    @Bean
    public Person person(Mobile mobile){
        var person = new Person();
        person.setName("Govind MADDALA");
        person.setMobile(mobile);
        return person;
    }
}
