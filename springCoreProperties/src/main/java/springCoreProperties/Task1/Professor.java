package springCoreProperties.Task1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Professor {

    @Value("${professor.name}")
    private String profName;

    @Value("${professor.subject}")
    private String subject;

    @Override
    public String toString() {
        return "Professor [profName=" + profName + ", subject=" + subject + "]";
    }
}
