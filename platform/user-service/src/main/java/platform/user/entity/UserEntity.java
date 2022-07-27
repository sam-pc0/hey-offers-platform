package platform.user.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author sam-pc
 */
@Document(value = "user")
@Getter
@Setter
@NoArgsConstructor
public class UserEntity {
    @Id
    private String id;
    private String username;
    private String password;
    private String email;
}
