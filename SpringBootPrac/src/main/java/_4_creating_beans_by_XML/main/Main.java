package _4_creating_beans_by_XML.main;

import _4_creating_beans_by_XML.beans.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("_4_beans_by_xml.xml");
        var person = context.getBean(Person.class);
        System.out.println(person.getName());
    }
}