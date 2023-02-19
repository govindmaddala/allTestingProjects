package _1st_type_of_bean_creation_using_Bean._1_Basic_byBean_same_type.config;

import _1st_type_of_bean_creation_using_Bean._1_Basic_byBean_same_type.beans.Person;
import org.springframework.context.annotation.Bean;

//@Configuration
public class Config {

    @Bean
    Person person(){
        var person = new Person();
        person.setName("Govind");
        return person;
    }
}
