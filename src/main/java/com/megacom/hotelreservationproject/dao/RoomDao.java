package com.megacom.hotelreservationproject.dao;

import com.megacom.hotelreservationproject.models.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomDao extends JpaRepository<Room, Long> {
}
