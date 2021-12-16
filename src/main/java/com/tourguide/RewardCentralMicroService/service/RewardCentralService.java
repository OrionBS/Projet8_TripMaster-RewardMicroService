package com.tourguide.RewardCentralMicroService.service;

import java.util.UUID;

public interface RewardCentralService {

    public int getAttractionsRewardPoints(UUID attractionId, UUID userId);
}
