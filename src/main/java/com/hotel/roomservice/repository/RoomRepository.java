package com.hotel.roomservice.repository;

import com.hotel.roomservice.model.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface    RoomRepository extends MongoRepository<Room,String> {
}
