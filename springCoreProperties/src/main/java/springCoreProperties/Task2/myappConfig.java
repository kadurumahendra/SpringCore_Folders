package springCoreProperties.Task2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("springCoreProperties.Task2")
@PropertySource("classpath:car.properties")
public class myappConfig {

}
