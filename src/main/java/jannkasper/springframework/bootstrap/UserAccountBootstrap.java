package jannkasper.springframework.bootstrap;

import jannkasper.springframework.entities.UserAccount;
import jannkasper.springframework.repositories.UserAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserAccountBootstrap implements CommandLineRunner {

    private final UserAccountRepository userAccountRepository;

    public UserAccountBootstrap(UserAccountRepository userAccountRepository) {
        this.userAccountRepository = userAccountRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadUserAccountObject("johny@icloud.com", "johny", "johny1");
        loadUserAccountObject("stacy@icloud.com", "stacy", "stacy2");
        loadUserAccountObject("smith@gmail.com", "smith", "smith3");
        loadUserAccountObject("george@hotmail.com", "george", "george4");
        loadUserAccountObject("barbra@gmail.com", "barbra", "barbra5");
        loadUserAccountObject("jan@gmail.com", "jan", "jan6");

    }

    private void loadUserAccountObject(String email, String login, String password){
        UserAccount user = new UserAccount();
        user.setEmail(email);
        user.setLogin(login);
        user.setPassword(password);
        userAccountRepository.save(user);
    }
}
