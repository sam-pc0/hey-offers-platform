package platform.user.api;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author sam-pc
 */

public class UserSignInRequest {
    @JsonProperty
    public String username;
    @JsonProperty
    public String password;
}
