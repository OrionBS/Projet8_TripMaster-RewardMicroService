package com.tourguide.RewardCentralMicroService;

import com.tourguide.RewardCentralMicroService.restController.RewardCentralRestController;
import com.tourguide.RewardCentralMicroService.service.impl.RewardCentralServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.UUID;

@ExtendWith(MockitoExtension.class)
public class RewardCentralRestControllerUnitTest {

    @InjectMocks
    RewardCentralRestController rewardCentralRestController;

    @Mock
    RewardCentralServiceImpl rewardCentralService;

    @Test
    public void testGetAttractionRewardPoints() {
        //GIVEN
        UUID attractionId = UUID.randomUUID();
        UUID userId = UUID.randomUUID();
        Mockito.when(rewardCentralService.getAttractionsRewardPoints(attractionId,userId)).thenReturn(100);

        //WHEN
        int pointsReceived = rewardCentralRestController.getAttractionRewardPoints(attractionId,userId);

        //THEN
        Mockito.verify(rewardCentralService,Mockito.times(1)).getAttractionsRewardPoints(attractionId,userId);
        Assertions.assertEquals(100,pointsReceived);
    }


}
