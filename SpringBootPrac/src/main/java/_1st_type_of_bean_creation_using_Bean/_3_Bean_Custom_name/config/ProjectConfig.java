package _1st_type_of_bean_creation_using_Bean._3_Bean_Custom_name.config;

import _1st_type_of_bean_creation_using_Bean._3_Bean_Custom_name.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    Person person1(){
        var person = new Person();
        person.setName("Govind from person1");
        return person;
    }

    @Primary
    @Bean
    Person person2(){
        var person = new Person();
        person.setName("Govind from primary annotation");
        return person;
    }
}
