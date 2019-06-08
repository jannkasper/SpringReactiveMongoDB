package jannkasper.springframework.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UserAccountTest {

    private UserAccount userAccount;

    @BeforeEach
    void setUp() {
        userAccount = new UserAccount();
    }

    @Test
    void getId()  {
        String idValue = UUID.randomUUID().toString();
        userAccount.setId(idValue);

        assertEquals(idValue, userAccount.getId());
    }

}