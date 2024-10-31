package com.anandhu.rideShare.services.impl;

import com.anandhu.rideShare.services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceOSRMImpl implements DistanceService {
    @Override
    public double calculateDistance(Point src, Point dst) {
        return 0;
    }
}
