package com.hotel.roomservice.controller;

import com.hotel.roomservice.dto.RoomRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody RoomRequest roomRequest){
        System.out.println("Room Service");
        System.out.println(roomRequest);
    }
}
