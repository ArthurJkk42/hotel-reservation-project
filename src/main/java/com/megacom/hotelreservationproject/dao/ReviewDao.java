package com.megacom.hotelreservationproject.dao;

import com.megacom.hotelreservationproject.models.entity.Hotel;
import com.megacom.hotelreservationproject.models.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewDao extends JpaRepository<Review, Long> {

    @Query(value = "select a from tb_review where a.hotel_id = 1?", nativeQuery = true)
    List<Review> findAllByActiveTrueAndHotel(Hotel hotel);
}
