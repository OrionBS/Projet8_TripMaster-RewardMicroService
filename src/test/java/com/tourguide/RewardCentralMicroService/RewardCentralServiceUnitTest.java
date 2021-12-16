package com.tourguide.RewardCentralMicroService;

import com.tourguide.RewardCentralMicroService.service.impl.RewardCentralServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import rewardCentral.RewardCentral;

import java.util.UUID;

@ExtendWith(MockitoExtension.class)
public class RewardCentralServiceUnitTest {

    @InjectMocks
    private RewardCentralServiceImpl rewardCentralService;

    @Mock
    RewardCentral rewardCentral;

    @Test
    public void testGetAttractionsRewardPoints() {
        //GIVEN
        UUID attractionId = UUID.randomUUID();
        UUID userId = UUID.randomUUID();
        Mockito.when(rewardCentral.getAttractionRewardPoints(attractionId,userId)).thenReturn(100);
        //WHEN
        int pointsReceived = rewardCentralService.getAttractionsRewardPoints(attractionId,userId);

        //THEN
        Mockito.verify(rewardCentral,Mockito.times(1)).getAttractionRewardPoints(attractionId,userId);
        Assertions.assertEquals(100,pointsReceived);

    }

}
