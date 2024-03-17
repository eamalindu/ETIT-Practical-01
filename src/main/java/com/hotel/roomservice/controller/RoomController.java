package com.hotel.roomservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    @PostMapping
    public void create(){
        System.out.println("Room Service");

    }
}
