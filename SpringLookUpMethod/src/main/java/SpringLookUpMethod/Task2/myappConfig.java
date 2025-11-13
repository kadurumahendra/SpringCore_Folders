package SpringLookUpMethod.Task2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("SpringLookUpMethod.Task2")
@PropertySource("classpath:company.properties")
public class myappConfig {
}
