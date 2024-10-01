package com.project.rideShare.rideshare.entities;

import com.project.rideShare.rideshare.entities.enums.PaymentMethod;
import com.project.rideShare.rideshare.entities.enums.RideRequestStatus;
import com.project.rideShare.rideshare.entities.enums.RideStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(columnDefinition = "Geometry(Point,4326")
    private Point pickupLocation;

    @Column(columnDefinition = "Geometry(Point,4326")
    private Point dropoffLocation;

    @CreationTimestamp
    private LocalDateTime createdTime;

    @ManyToOne(fetch = FetchType.LAZY)
    private Rider rider;

    @ManyToOne(fetch = FetchType.LAZY)
    private Driver driver;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    private RideStatus rideStatus;

    private Double fare;

    private LocalDateTime  startedAt;

    private LocalDateTime endedAt;

}
