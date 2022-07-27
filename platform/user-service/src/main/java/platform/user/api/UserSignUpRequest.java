package platform.user.api;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author sam-pc
 */
public class UserSignUpRequest {
    @JsonProperty
    public  String username;
    @JsonProperty
    public  String password;
    @JsonProperty
    public  String email;
}
