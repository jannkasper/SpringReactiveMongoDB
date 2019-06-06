package jannkasper.springframework.services;

import jannkasper.springframework.entities.UserAccount;

public interface UserAccountService extends CrudService<UserAccount,Long> {

    UserAccount findUserAccountByLogin (String login);
}
