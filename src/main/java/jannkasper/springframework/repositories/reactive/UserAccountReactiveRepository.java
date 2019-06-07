package jannkasper.springframework.repositories.reactive;

import jannkasper.springframework.entities.UserAccount;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UserAccountReactiveRepository extends ReactiveMongoRepository<UserAccount, String> {
    Mono<UserAccount> findUserAccountByLogin (String login);
}
