package _7_Wiring_using_AutoWired.On_Constructor.main;

import _7_Wiring_using_AutoWired.On_Constructor.beans.Person;
import _7_Wiring_using_AutoWired.On_Constructor.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var person = context.getBean(Person.class);
        person.setName("Person from Constructor");

        System.out.println(person.getName());
        System.out.println(person.getMobile());
    }
}