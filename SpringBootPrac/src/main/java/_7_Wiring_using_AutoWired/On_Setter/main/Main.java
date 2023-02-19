package _7_Wiring_using_AutoWired.On_Setter.main;

import _7_Wiring_using_AutoWired.On_Setter.beans.Person;
import _7_Wiring_using_AutoWired.On_Setter.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var person = context.getBean(Person.class);
        person.setName("Person from Setter");

        System.out.println(person.getName());
        System.out.println(person.getMobile());
    }
}