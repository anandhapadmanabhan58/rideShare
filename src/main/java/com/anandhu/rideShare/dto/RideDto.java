package com.anandhu.rideShare.dto;

import com.anandhu.rideShare.entities.Rider;
import com.anandhu.rideShare.entities.enums.PaymentMethod;
import com.anandhu.rideShare.entities.enums.RideStatus;
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
public class RideDto {

    private Long id;


    private Point pickupLocation;

    private Point dropOffLocation;


    private LocalDateTime createdTime;


    private RiderDto rider;


    private PaymentMethod paymentMethod;


    private RideStatus rideStatus;

    private Double fare;

    private LocalDateTime startedAt;

    private LocalDateTime endedAt;


}
