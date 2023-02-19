package _2nd_type_of_bean_creation_using_component.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void postConstruct(){
        this.name = "Govind from post construct method";
    }

    @PreDestroy
    public void predestroy(){
        System.out.println("Method executed before destroy");
    }
}
