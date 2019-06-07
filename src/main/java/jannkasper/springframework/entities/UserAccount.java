package jannkasper.springframework.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.UUID;

@Getter
@Setter
@Document(collection = "user_account")
public class UserAccount {

//    @Id
//    @GeneratedValue(generator = "UUID")
//    @GenericGenerator( name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
//    @Column(name = "id", updatable = false, nullable = false)
//    private UUID id;


    public UserAccount() {
        this.id = UUID.randomUUID().toString();
    }

    @Id
    private String id;

    @NotEmpty
    private String login;

    @Size(min=3,max=15)
    private String password;

    @Email
    private String email;

}
