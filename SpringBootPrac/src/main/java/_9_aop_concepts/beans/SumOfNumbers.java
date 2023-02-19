package _9_aop_concepts.beans;


import org.springframework.stereotype.Component;

@Component
public class SumOfNumbers {

    public void getSum(int n){
        System.out.println (n*(n+1)/2);
    }
}
