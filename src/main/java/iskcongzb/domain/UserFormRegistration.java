package iskcongzb.domain;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserFormRegistration {
    private List<User> contacts;
  private User user;
    public List<User> getUser() {
        return contacts;
    }

    public void setUser(List<User> user) {
        this.contacts = user;
    }
    public void setUserobj(User userobj)
    {
        this.user=userobj;
    }
}
