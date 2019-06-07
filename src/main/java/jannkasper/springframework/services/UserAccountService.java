package jannkasper.springframework.services;

import jannkasper.springframework.commands.UserAccountCommand;
import jannkasper.springframework.entities.UserAccount;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserAccountService extends CrudService<UserAccount,String> {

    Mono<UserAccountCommand> findUserAccountByLogin (String login);
    Flux<UserAccountCommand> findAllCommand();
    Mono<UserAccountCommand> findByIdCommand(String id);
    Mono<UserAccount> saveCommand (UserAccountCommand object);
}
