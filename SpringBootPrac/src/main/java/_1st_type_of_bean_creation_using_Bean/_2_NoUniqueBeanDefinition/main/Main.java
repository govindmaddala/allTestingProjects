package _1st_type_of_bean_creation_using_Bean._2_NoUniqueBeanDefinition.main;

import _1st_type_of_bean_creation_using_Bean._2_NoUniqueBeanDefinition.beans.Person;
import _1st_type_of_bean_creation_using_Bean._2_NoUniqueBeanDefinition.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        context.getBean(Person.class);
    }
}
