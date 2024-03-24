package com.hotel.roomservice.service;

import com.hotel.roomservice.dto.RoomRequest;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    public void create(RoomRequest roomRequest){

        System.out.println("Room Object from Service "+roomRequest);
    }
}
