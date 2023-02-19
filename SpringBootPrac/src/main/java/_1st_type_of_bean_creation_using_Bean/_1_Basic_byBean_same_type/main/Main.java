package _1st_type_of_bean_creation_using_Bean._1_Basic_byBean_same_type.main;

import _1st_type_of_bean_creation_using_Bean._1_Basic_byBean_same_type.beans.Person;
import _1st_type_of_bean_creation_using_Bean._1_Basic_byBean_same_type.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        var person =  context.getBean(Person.class);
        System.out.print(person.getName());
    }
}
