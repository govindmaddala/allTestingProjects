package _3_creating_beans_logically.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "_3_creating_beans_logically.beans")
public class ProjectConfig {
}
