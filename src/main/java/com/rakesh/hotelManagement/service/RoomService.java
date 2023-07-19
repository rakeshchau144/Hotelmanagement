package com.rakesh.hotelManagement.service;

import com.rakesh.hotelManagement.model.HotelRoom;
import com.rakesh.hotelManagement.repository.IRoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {
    @Autowired
    IRoomRepo iRoomRepo;

    public Iterable<HotelRoom> getAllRoom() {
        return iRoomRepo.findAll();
    }

    public String addRoom(HotelRoom room) {
        iRoomRepo.save(room);
        return "Room Added successfully";
    }

    public HotelRoom getById(Long id) {
        Optional<HotelRoom> room= iRoomRepo.findById(id);
        return room.get();
    }

    public String addRooms(List<HotelRoom> rooms) {
        iRoomRepo.saveAll(rooms);
        return "Multiple rooms are added";
    }

    public Long getRoomCount() {
        return iRoomRepo.count();
    }

    public boolean getExixtId(Long id) {
        return iRoomRepo.existsById(id);
    }

    public String removeRoomById(Long id) {
        iRoomRepo.deleteById(id);
        return "remove id "+id;
    }

}
