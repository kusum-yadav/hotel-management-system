package lcwd.user.service.UserService.repositories;

import lcwd.user.service.UserService.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
//If you want to implement to any custom query
//write


}
