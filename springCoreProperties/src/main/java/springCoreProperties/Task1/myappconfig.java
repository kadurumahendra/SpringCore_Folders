package springCoreProperties.Task1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("springCoreProperties.Task1")
@PropertySource("classpath:university.properties")
public class myappconfig {
}
