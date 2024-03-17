package com.hotel.roomservice.controller;

import com.hotel.roomservice.dto.RoomRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    @PostMapping
    public void create(@RequestBody RoomRequest roomRequest){
        System.out.println("Room Service");
        System.out.println(roomRequest);
    }
}
