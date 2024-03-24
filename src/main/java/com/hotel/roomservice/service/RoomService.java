package com.hotel.roomservice.service;

import com.hotel.roomservice.dto.RoomRequest;
import com.hotel.roomservice.model.Room;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    public void create(RoomRequest roomRequest){

        System.out.println("Room Object from Service "+roomRequest);
        Room rm = Room.builder()
                .no(roomRequest.getNo())
                .price(roomRequest.getPrice())
                .build();

        System.out.println(rm);
    }
}
