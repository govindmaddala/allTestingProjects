package _2nd_type_of_bean_creation_using_component.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
@ComponentScan(basePackages = {"_2nd_type_of_bean_creation_using_component.beans",
        "_2nd_type_of_bean_creation_using_component.*"})

public class ProjectConfig {

}
