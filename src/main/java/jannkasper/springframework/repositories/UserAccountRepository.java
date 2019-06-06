package jannkasper.springframework.repositories;

import jannkasper.springframework.entities.UserAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepository extends CrudRepository<UserAccount,Long> {
    UserAccount findUserAccountByLogin (String login);

}
