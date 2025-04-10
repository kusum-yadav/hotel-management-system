package lcwd.user.service.UserService.entities;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rating {
  private String ratingId;
  private String userId;
  private String hotelId;
  private int rating;
  private String feedback;




}
