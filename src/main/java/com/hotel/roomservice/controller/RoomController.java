package com.hotel.roomservice.controller;

import com.hotel.roomservice.dto.RoomRequest;
import com.hotel.roomservice.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rooms")
@RequiredArgsConstructor
public class RoomController {

    private final RoomService roomService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody RoomRequest roomRequest){
//        System.out.println("Room Service");
//        System.out.println(roomRequest);

        roomService.create(roomRequest);

    }

}
