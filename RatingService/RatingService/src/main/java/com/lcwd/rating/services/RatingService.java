package com.lcwd.rating.services;

import com.lcwd.rating.entities.Rating;

import java.net.InterfaceAddress;
import java.util.List;


public interface RatingService {

    //create
      Rating create (Rating rating);


    //getAll

    List<Rating> getAll();


    //get all by user id
     List<Rating> getAllByUserId(String userId);


    //get all by hotel id
        List<Rating> getAllByHotelId(String hotelId);
}
