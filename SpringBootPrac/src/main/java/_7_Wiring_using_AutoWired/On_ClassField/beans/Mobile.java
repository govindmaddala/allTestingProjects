package _7_Wiring_using_AutoWired.On_ClassField.beans;

import org.springframework.stereotype.Component;

@Component
public class Mobile {
    private String name = "APPLE FROM CLASS_FIELD";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){ return name; }
}
