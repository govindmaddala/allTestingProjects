package _2nd_type_of_bean_creation_using_component.main;

import _2nd_type_of_bean_creation_using_component.beans.Person;
import _2nd_type_of_bean_creation_using_component.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var person = context.getBean(Person.class);
        if(person.getName() == null){
            person.setName("Govind from Component");
        }
        System.out.println(person.getName());
        context.close();
    }
}
