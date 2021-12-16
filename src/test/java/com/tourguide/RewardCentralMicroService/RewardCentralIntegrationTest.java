package com.tourguide.RewardCentralMicroService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class RewardCentralIntegrationTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testGetAttractionRewardPoints() throws Exception {
        //GIVEN
        UUID attractionId = UUID.randomUUID();
        UUID userId = UUID.randomUUID();
        //WHEN
        mockMvc.perform(get("/getAttractionRewardPoints")
                        .param("attractionId", attractionId.toString())
                        .param("userId", userId.toString()))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        //THEN


    }
}
