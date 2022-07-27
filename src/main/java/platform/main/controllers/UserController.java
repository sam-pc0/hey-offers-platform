package platform.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import platform.user.api.UserSignInRequest;
import platform.user.api.UserSignUpRequest;
import platform.user.api.UserResponse;
import platform.user.api.UserResponseStatus;
import platform.user.service.UserService;

/**
 * @author sam-pc
 */

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/sign-in")
    public UserResponse signIn(@RequestBody UserSignInRequest request) {
        boolean response = userService.signIn(request);
        UserResponse userResponse = new UserResponse();
        userResponse.status = response ? UserResponseStatus.SUCCESS : UserResponseStatus.FAILED;
        return userResponse;
    }

    @PostMapping("/sign-up")
    public UserResponse signUp(@RequestBody UserSignUpRequest request) {
        boolean response = userService.signUp(request);
        UserResponse userResponse = new UserResponse();
        userResponse.status = response ? UserResponseStatus.SUCCESS : UserResponseStatus.FAILED;
        return userResponse;
    }
}