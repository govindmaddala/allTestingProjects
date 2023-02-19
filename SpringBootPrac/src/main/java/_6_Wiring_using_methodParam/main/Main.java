package _6_Wiring_using_methodParam.main;

import _6_Wiring_using_methodParam.beans.Person;
import _6_Wiring_using_methodParam.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var person = context.getBean(Person.class);
        System.out.println(person.getName());
        System.out.println(person.getMobile());
    }
}