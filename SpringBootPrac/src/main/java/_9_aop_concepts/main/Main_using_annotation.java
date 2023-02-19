package _9_aop_concepts.main;

import _9_aop_concepts.beans.Product_using_annotation;
import _9_aop_concepts.config.ProjectConfig_using_annotation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main_using_annotation {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig_using_annotation.class);
        var prod =  context.getBean(Product_using_annotation.class);
        prod.product(20,50);
    }
}
