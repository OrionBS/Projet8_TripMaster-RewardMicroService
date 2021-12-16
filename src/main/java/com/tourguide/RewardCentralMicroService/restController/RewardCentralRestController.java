package com.tourguide.RewardCentralMicroService.restController;

import com.tourguide.RewardCentralMicroService.service.RewardCentralService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class RewardCentralRestController {

    private final RewardCentralService rewardCentralService;

    public RewardCentralRestController(RewardCentralService rewardCentralService) {
        this.rewardCentralService = rewardCentralService;
    }

    @GetMapping(path = "/getAttractionRewardPoints")
    public int getAttractionRewardPoints(@RequestParam UUID attractionId, @RequestParam UUID userId) {
        return rewardCentralService.getAttractionsRewardPoints(attractionId, userId);
    }
}
