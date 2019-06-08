package jannkasper.springframework.converters;

import jannkasper.springframework.commands.UserAccountCommand;
import jannkasper.springframework.entities.UserAccount;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class UserAccountCommandToUserAccount implements Converter<UserAccountCommand, UserAccount> {

    @Synchronized
    @Nullable
    @Override
    public UserAccount convert(UserAccountCommand source) {
        if (source == null){
            return null;
        }

        final UserAccount userAccount = new UserAccount();
        userAccount.setId(source.getId());
        userAccount.setLogin(source.getLogin());
        userAccount.setPassword(source.getPassword());
        userAccount.setEmail(source.getEmail());
        return userAccount;
    }
}
