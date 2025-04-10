package lcwd.user.service.UserService.controller;

import lcwd.user.service.UserService.entities.User;
import lcwd.user.service.UserService.services.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
  //
    @Autowired
    private UserService userService;
  @PostMapping
   public ResponseEntity<User> createUser(@RequestBody User user) {
     User user1= userService.saveUser(user);
      return ResponseEntity.status(HttpStatus.CREATED).body(user1);
   }



    //single user
   @GetMapping("/{userId}")
    public  ResponseEntity<User> GetSingleUserId(@PathVariable String userId){
      User user=userService.getUserById(userId);
      return ResponseEntity.ok(user);
   }

    //
    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
      List<User> allUsers=userService.getAllUser();
      return ResponseEntity.ok(allUsers);
    }


}
