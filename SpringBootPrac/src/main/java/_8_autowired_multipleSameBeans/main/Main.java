package _8_autowired_multipleSameBeans.main;

import _8_autowired_multipleSameBeans.beans.Person_withBeanName;
import _8_autowired_multipleSameBeans.beans.Person_withPrimary;
import _8_autowired_multipleSameBeans.beans.Person_withQualifier;
import _8_autowired_multipleSameBeans.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var personWithBeanName =  context.getBean(Person_withBeanName.class);
        var personWithPrimary = context.getBean(Person_withPrimary.class);
        var personWithQualifier = context.getBean(Person_withQualifier.class);

        System.out.println(personWithBeanName.getName());
        System.out.println(personWithBeanName.getMobile());
        System.out.println("---------------");

        System.out.println(personWithPrimary.getName());
        System.out.println(personWithPrimary.getMobile());
        System.out.println("---------------");

        System.out.println(personWithQualifier.getName());
        System.out.println(personWithQualifier.getMobile());
        System.out.println("---------------");
    }
}