package jannkasper.springframework.converters;

import jannkasper.springframework.commands.UserAccountCommand;
import jannkasper.springframework.entities.UserAccount;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class UserAccountToUserAccountCommand implements Converter<UserAccount, UserAccountCommand> {

    @Synchronized
    @Nullable
    @Override
    public UserAccountCommand convert(UserAccount source) {
        if (source == null){
            return null;
        }

        final UserAccountCommand userAccountCommand = new UserAccountCommand();
        userAccountCommand.setId(source.getId());
        userAccountCommand.setLogin(source.getLogin());
        userAccountCommand.setPassword(source.getPassword());
        userAccountCommand.setEmail(source.getEmail());
        return userAccountCommand;
    }
}
