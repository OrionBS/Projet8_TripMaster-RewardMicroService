package com.tourguide.RewardCentralMicroService.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rewardCentral.RewardCentral;

import java.util.Locale;

@Configuration
public class RewardCentralMicroServiceModule {

    @Bean
    public RewardCentral getRewardCentral() {
        Locale.setDefault(Locale.ENGLISH);
        return new RewardCentral();
    }
}
