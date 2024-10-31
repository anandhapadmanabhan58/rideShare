package com.anandhu.rideShare.dto;

import com.anandhu.rideShare.entities.Rider;
import com.anandhu.rideShare.entities.enums.PaymentMethod;
import com.anandhu.rideShare.entities.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Point pickupLocation;

    private Point dropOffLocation;


    private LocalDateTime requestedTime;


    private RideDto rider;


    private PaymentMethod paymentMethod;


    private RideRequestStatus rideRequestStatus;

}
