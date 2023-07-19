package com.rakesh.hotelManagement.controller;

import com.rakesh.hotelManagement.model.HotelRoom;
import com.rakesh.hotelManagement.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomController {
    @Autowired
    RoomService roomService;

    @GetMapping("rooms")
    public Iterable<HotelRoom> getAllRoom(){

        return roomService.getAllRoom();
    }
    @PostMapping("room")
    public String addRoom(@RequestBody HotelRoom room){

        return roomService.addRoom(room);
    }
    @PostMapping("rooms")
    public String addrooms(@RequestBody List<HotelRoom> rooms)
    {

        return roomService.addRooms(rooms);
    }

    @GetMapping("rooms/{id}")
    public HotelRoom getRoomById(@PathVariable Long id){
        return roomService.getById(id);
    }
    @GetMapping("room/{id}/exist")
    public boolean getExistId(@PathVariable Long id){
        return roomService.getExixtId(id);
    }
    @GetMapping("rooms/count")
    public Long countRow(){
        return roomService.getRoomCount();
    }

    @DeleteMapping("Delete/id/{id}")
    public String removeRoomById(@PathVariable Long id){

        return roomService.removeRoomById(id);
    }
}
