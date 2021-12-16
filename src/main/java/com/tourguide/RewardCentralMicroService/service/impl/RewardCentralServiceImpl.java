package com.tourguide.RewardCentralMicroService.service.impl;

import com.tourguide.RewardCentralMicroService.service.RewardCentralService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import rewardCentral.RewardCentral;

import java.util.UUID;

@Service
public class RewardCentralServiceImpl implements RewardCentralService {

    private Logger logger = LoggerFactory.getLogger(RewardCentralServiceImpl.class);
    private final RewardCentral rewardCentral;

    public RewardCentralServiceImpl(RewardCentral rewardCentral) {
        logger.info("Call");
        this.rewardCentral = rewardCentral;
    }

    @Override
    public int getAttractionsRewardPoints(UUID attractionId, UUID userId) {
        logger.info("Call");
        return rewardCentral.getAttractionRewardPoints(attractionId,userId);
    }
}
