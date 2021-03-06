package com.megacom.hotelreservationproject.service;

import com.megacom.hotelreservationproject.models.dto.PhotoDto;
import com.megacom.hotelreservationproject.models.entity.Hotel;

import java.util.List;

public interface PhotoService {



    PhotoDto save(PhotoDto photoDto);

    PhotoDto findById(Long id);

    String findMainPhoto(Hotel hotel);

    List<PhotoDto> findAllPhotosByHotel(Hotel hotel);

    List<PhotoDto> uploadPhotos(List<PhotoDto> photoDto);
}
