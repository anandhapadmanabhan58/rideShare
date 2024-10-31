package com.anandhu.rideShare.services.impl;

import com.anandhu.rideShare.dto.RideDto;
import com.anandhu.rideShare.dto.RideRequestDto;
import com.anandhu.rideShare.dto.RiderDto;
import com.anandhu.rideShare.services.RiderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideServiceImpl implements RiderService {
    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto rateRider(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RideDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}
