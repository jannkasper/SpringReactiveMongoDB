package jannkasper.springframework.services;

import jannkasper.springframework.commands.UserAccountCommand;
import jannkasper.springframework.converters.UserAccountCommandToUserAccount;
import jannkasper.springframework.converters.UserAccountToUserAccountCommand;
import jannkasper.springframework.entities.UserAccount;
import jannkasper.springframework.repositories.reactive.UserAccountReactiveRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserAccountServiceImpl implements UserAccountService {


    private UserAccountToUserAccountCommand userAccountToUserAccountCommand;
    private UserAccountCommandToUserAccount userAccountCommandToUserAccount;
    private UserAccountReactiveRepository userAccountRepository;

    public UserAccountServiceImpl(UserAccountToUserAccountCommand userAccountToUserAccountCommand, UserAccountCommandToUserAccount userAccountCommandToUserAccount, UserAccountReactiveRepository userAccountRepository) {
        this.userAccountToUserAccountCommand = userAccountToUserAccountCommand;
        this.userAccountCommandToUserAccount = userAccountCommandToUserAccount;
        this.userAccountRepository = userAccountRepository;
    }

    @Override
    public Flux<UserAccountCommand> findAllCommand() {
        return userAccountRepository
                .findAll()
                .map(userAccountToUserAccountCommand::convert);
    }

    @Override
    public Mono<UserAccountCommand> findByIdCommand(String id) {
        return  userAccountRepository
                .findById(id)
                .map(userAccountToUserAccountCommand::convert);
    }

    @Override
    public Mono<UserAccount> saveCommand (UserAccountCommand object) {
        return userAccountRepository
                .save(userAccountCommandToUserAccount.convert(object));
    }

    @Override
    public Mono<Void> deleteById (String id) {
        userAccountRepository.deleteById(id);
        return Mono.empty();
    }

    @Override
    public Mono<UserAccountCommand> findUserAccountByLogin(String login) {
        return  userAccountRepository
                .findUserAccountByLogin(login)
                .map(userAccountToUserAccountCommand::convert);
    }


    @Override
    public Mono<UserAccount> findById(String s) {
        return null;
    }

    @Override
    public Mono<UserAccount> save(UserAccount object) {
        return null;
    }
}
