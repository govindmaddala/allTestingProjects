package _9_aop_concepts.main;

import _9_aop_concepts.beans.SumOfNumbers;
import _9_aop_concepts.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var sumOfNumbers =  context.getBean(SumOfNumbers.class);
        sumOfNumbers.getSum(100);
    }
}
