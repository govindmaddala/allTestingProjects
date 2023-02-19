package _8_autowired_multipleSameBeans.config;

import _8_autowired_multipleSameBeans.beans.Mobile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
@Configuration
@ComponentScan(basePackages = "_8_autowired_multipleSameBeans.beans")
public class ProjectConfig {
    @Bean(name = "mobile1")
    Mobile mobile1(){
        Mobile mobile = new Mobile();
        mobile.setName("Mobile from bean name setup");
        return mobile;
    }
    @Bean
    @Primary
    Mobile mobile2(){
        Mobile mobile = new Mobile();
        mobile.setName("Mobile from Primary bean setup");
        return mobile;
    }
    @Bean
    Mobile mobile3(){
        Mobile mobile = new Mobile();
        mobile.setName("Mobile from qualifier setup");
        return mobile;
    }
}