package _9_aop_concepts.beans;

import _9_aop_concepts.interfaces.LogAnnotation;
import org.springframework.stereotype.Component;

@Component
public class Product_using_annotation {

    @LogAnnotation
    public void product(int a,int b){
        System.out.println(a*b);
    }
}
