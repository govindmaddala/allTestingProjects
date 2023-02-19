package _3_creating_beans_logically.beans;

import org.springframework.stereotype.Component;

@Component
public class Mobile {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
