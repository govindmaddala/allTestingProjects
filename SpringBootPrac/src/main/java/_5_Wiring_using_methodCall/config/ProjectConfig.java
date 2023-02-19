package _5_Wiring_using_methodCall.config;

import _5_Wiring_using_methodCall.beans.Mobile;
import _5_Wiring_using_methodCall.beans.Person;
import org.springframework.context.annotation.Bean;

public class ProjectConfig {

    @Bean
    Mobile mobile(){
        var mobile = new Mobile();
        mobile.setName("ANDROID");
        return mobile;
    }

    @Bean
    Person person(){
        var person = new Person();
        person.setName("Govind");
        person.setMobile(mobile());
        return person;
    }
}
