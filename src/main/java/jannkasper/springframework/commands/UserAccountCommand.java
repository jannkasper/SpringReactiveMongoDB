package jannkasper.springframework.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserAccountCommand {
    String id;
    String login;
    String password;
    String email;
}
