package com.rakesh.hotelManagement.repository;

import com.rakesh.hotelManagement.model.HotelRoom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoomRepo extends CrudRepository<HotelRoom,Long> {
}
