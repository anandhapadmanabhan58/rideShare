package com.anandhu.rideShare.strategies.impl;

import com.anandhu.rideShare.dto.RideRequestDto;
import com.anandhu.rideShare.entities.Driver;
import com.anandhu.rideShare.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy
{
    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
