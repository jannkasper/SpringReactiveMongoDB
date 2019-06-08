package jannkasper.springframework.services;

import jannkasper.springframework.converters.UserAccountCommandToUserAccount;
import jannkasper.springframework.converters.UserAccountToUserAccountCommand;
import jannkasper.springframework.repositories.reactive.UserAccountReactiveRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class UserAccountServiceImplTest {

    private UserAccountServiceImpl userAccountService;

    @Mock
    UserAccountToUserAccountCommand userAccountToUserAccountCommand;
    @Mock
    UserAccountCommandToUserAccount userAccountCommandToUserAccount;
    @Mock
    UserAccountReactiveRepository userAccountRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        userAccountService = new UserAccountServiceImpl(userAccountToUserAccountCommand,userAccountCommandToUserAccount,userAccountRepository);
    }

    @Test
    void findAllCommand() {

    }

    @Test
    void findByIdCommand() {
    }

    @Test
    void saveCommand() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void findUserAccountByLogin() {
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }
}