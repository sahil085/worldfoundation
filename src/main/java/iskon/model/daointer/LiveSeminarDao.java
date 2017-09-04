package iskon.model.daointer;

import org.springframework.stereotype.Component;

@Component
public interface LiveSeminarDao {
    String askQuestion(String qtn);
}
