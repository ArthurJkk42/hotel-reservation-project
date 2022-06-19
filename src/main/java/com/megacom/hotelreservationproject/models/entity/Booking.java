package com.megacom.hotelreservationproject.models.entity;

import com.megacom.hotelreservationproject.models.enums.EBookingStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "tb_booking")
public class Booking {

    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;
    @OneToOne
    @JoinColumn(name = "room_id")
    private Room room;
    private Date checkInDate;
    private Date checkOutDate;
    @ManyToOne
    @JoinColumn(name = "guest_id")
    private User user;
    private String comment;
    @Enumerated(value = EnumType.STRING)
    private EBookingStatus status;
    private double sum;
}
