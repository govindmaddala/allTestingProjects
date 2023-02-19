package _1st_type_of_bean_creation_using_Bean._2_NoUniqueBeanDefinition.config;

import _1st_type_of_bean_creation_using_Bean._1_Basic_byBean_same_type.beans.Person;

public class ProjectConfig {

    Person person1(){
        var person = new Person();
        person.setName("Govind from person1");
        return person;
    }

    Person person2(){
        var person = new Person();
        person.setName("Govind from person 2");
        return person;
    }
}
