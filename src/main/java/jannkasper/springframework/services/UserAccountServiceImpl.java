package jannkasper.springframework.services;

import jannkasper.springframework.entities.UserAccount;
import jannkasper.springframework.repositories.reactive.UserAccountReactiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    private UserAccountReactiveRepository userAccountRepository;

    @Override
    public Flux<UserAccount> findAll() {
        return userAccountRepository.findAll();
    }

    @Override
    public Mono<UserAccount> findById(String id) {
        return userAccountRepository.findById(id);
    }

    @Override
    public Mono<UserAccount> save(UserAccount object) {
        return userAccountRepository.save(object);
    }

    @Override
    public Mono<Void> deleteById (String id) {
        userAccountRepository.deleteById(id);
        return Mono.empty();
    }

    @Override
    public Mono<UserAccount> findUserAccountByLogin(String login) {
        return userAccountRepository.findUserAccountByLogin(login);
    }
}
