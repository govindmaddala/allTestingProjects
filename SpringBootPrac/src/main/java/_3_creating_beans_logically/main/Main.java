package _3_creating_beans_logically.main;


import _3_creating_beans_logically.beans.Mobile;
import _3_creating_beans_logically.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var num = new Random();
        var number = num.nextInt(10);
        Mobile android = new Mobile();
        android.setName("Android mobile");
        Supplier<Mobile> androidSupplier = () -> {
            return android;
        };

        Mobile mac = new Mobile();
        Supplier <Mobile> macSupplier = () -> {
            mac.setName("APPLE Iphone");
            return mac;
        };

        System.out.println(number);
        if(number % 2 == 0){
            context.registerBean("ANDROID",Mobile.class, androidSupplier);
        }else {
            context.registerBean("APPLE",Mobile.class, macSupplier);
        }

        Mobile andObj = null;
        Mobile macObj = null;
        try {
            andObj = context.getBean("ANDROID",Mobile.class);
        }catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("Android bean is not formed");
        }

        try {
            macObj = context.getBean("APPLE",Mobile.class);
        }catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("MAC bean is not formed");
        }

        if(andObj != null){
            System.out.println(andObj.getName());
        }else{
            System.out.println(macObj.getName());
        }

    }
}
