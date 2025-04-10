package com.lcwd.rating.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "ratings")
public class Rating {

    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private String ratingId;
            //= UUID.randomUUID().toString();
    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;



}
