package com.hotel.roomservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value = "room")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {

    @Id
    private String id;

    private String no;

    private BigDecimal price;
}
