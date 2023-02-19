package _7_Wiring_using_AutoWired.On_Constructor.beans;

import org.springframework.stereotype.Component;

@Component
public class Mobile {
    private String name = "APPLE FROM CONSTRUCTOR";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){ return name; }
}
