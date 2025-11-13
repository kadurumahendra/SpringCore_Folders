package springCoreProperties.Task4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("springCoreProperties.Task4")
@PropertySource("classpath:Student.properties")
public class myappConfig {
	

}
