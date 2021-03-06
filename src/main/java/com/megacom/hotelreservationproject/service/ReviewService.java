package com.megacom.hotelreservationproject.service;

import com.megacom.hotelreservationproject.models.dto.HotelDto;
import com.megacom.hotelreservationproject.models.dto.ReviewDto;

import java.text.ParseException;
import java.util.List;

public interface ReviewService {

    ReviewDto save(ReviewDto reviewDto) throws ParseException;

    ReviewDto findById(Long id);

    ReviewDto delete(ReviewDto reviewDto);

    List<ReviewDto>findAllByHotelAndActive(HotelDto hotelDto);

    ReviewDto reviewAndRate(Long hotelId, ReviewDto reviewDto) throws ParseException; // required

    ReviewDto editReview(ReviewDto reviewDto) throws ParseException;

    List<ReviewDto> findByGuestId(Long id);

    List<ReviewDto> findByHotelId(Long id);

    List<ReviewDto> findByReviewResponseId(Long id);
}
