package com.lcwd.hotel.controllers;

import com.lcwd.hotel.entities.Hotel;
import com.lcwd.hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;
    //create
    @PostMapping
       public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
          Hotel createdHotel = hotelService.create(hotel);
          return ResponseEntity.status(HttpStatus.CREATED).body(createdHotel);
      }


      @GetMapping("/{hotelId}")
      public ResponseEntity<Hotel> createHotel(@PathVariable String hotelId) {
          return ResponseEntity.status(HttpStatus.OK).body(hotelService.get(hotelId));
      }


    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotels() {
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.getAll());
    }




}
