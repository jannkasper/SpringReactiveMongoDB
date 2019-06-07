package jannkasper.springframework.services;

import jannkasper.springframework.entities.UserAccount;
import reactor.core.publisher.Mono;

public interface UserAccountService extends CrudService<UserAccount,String> {

    Mono<UserAccount> findUserAccountByLogin (String login);
}
