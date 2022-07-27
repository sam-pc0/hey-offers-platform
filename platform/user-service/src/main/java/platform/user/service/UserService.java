package platform.user.service;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import platform.user.api.UserSignInRequest;
import platform.user.api.UserSignUpRequest;
import platform.user.entity.UserEntity;
import platform.user.repository.UserRepository;

import java.util.Optional;

/**
 * @author sam-pc
 */

@NoArgsConstructor
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public boolean signIn(UserSignInRequest request) {
        Optional<UserEntity> user = userRepository.findByUsername(request.username);
        return user.isPresent() && user.get().getPassword().equals(request.password);
    }

    public boolean signUp(UserSignUpRequest request) {
        if (userRepository.existsByUsername(request.username)) return false;
        if (userRepository.existsByEmail(request.email)) return false;
        UserEntity user = new UserEntity();
        user.setUsername(request.username);
        user.setPassword(request.password);
        user.setEmail(request.email);
        userRepository.save(user);
        return true;
    }
}
