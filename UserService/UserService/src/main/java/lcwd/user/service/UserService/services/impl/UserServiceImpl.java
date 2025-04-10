package lcwd.user.service.UserService.services.impl;

import lcwd.user.service.UserService.entities.User;
import lcwd.user.service.UserService.exceptions.ResourceNotFoundException;
import lcwd.user.service.UserService.repositories.UserRepository;
import lcwd.user.service.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired    //create object of User Repository
    private UserRepository userRepository;

    public User saveUser(User user) {
        String randomUserId=UUID.randomUUID().toString();
        user.setUserId(randomUserId);
       return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(String userId) {
         return userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User with given Id not found on server !!"+userId));
    }
}
