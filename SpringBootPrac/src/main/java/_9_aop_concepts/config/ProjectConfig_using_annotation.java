package _9_aop_concepts.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"_9_aop_concepts.aspectsFolder","_9_aop_concepts.beans"})
public class ProjectConfig_using_annotation {
}
