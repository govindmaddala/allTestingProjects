package _1st_type_of_bean_creation_using_Bean._3_Bean_Custom_name.main;

import _1st_type_of_bean_creation_using_Bean._3_Bean_Custom_name.beans.Person;
import _1st_type_of_bean_creation_using_Bean._3_Bean_Custom_name.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var person = context.getBean(Person.class);
        System.out.println(person.getName());
    }
}
