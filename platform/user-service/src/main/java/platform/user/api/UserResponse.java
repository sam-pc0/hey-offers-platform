package platform.user.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

/**
 * @author sam-pc
 */
@NoArgsConstructor
public class UserResponse {
    @JsonProperty
    public UserResponseStatus status;
}
