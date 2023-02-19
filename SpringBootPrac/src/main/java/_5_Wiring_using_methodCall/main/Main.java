package _5_Wiring_using_methodCall.main;

import _5_Wiring_using_methodCall.beans.Person;
import _5_Wiring_using_methodCall.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var person = context.getBean(Person.class);
        System.out.println(person.getName());
        System.out.println(person.getMobile());
    }
}