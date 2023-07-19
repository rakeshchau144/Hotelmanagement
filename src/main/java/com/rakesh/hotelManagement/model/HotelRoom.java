package com.rakesh.hotelManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity   //it makes table of  this class name and variable of all column;
@Table(name = "Room")
public class HotelRoom {
    @Id //define primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId;
    @Column(unique = true)
    private Integer roomNo;
    @Enumerated(EnumType.STRING)
    private Type roomType;
    private Double price;
    @Column(name = "status")
    private Boolean roomStatus;

}
