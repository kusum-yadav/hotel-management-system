package lcwd.user.service.UserService.services;

import lcwd.user.service.UserService.entities.User;

import java.util.List;

public interface UserService {
    //User operation

    User saveUser(User user);

    //getAll User
    List<User> getAllUser();

    //get All user with given Id
    User getUserById(String userId);



}
