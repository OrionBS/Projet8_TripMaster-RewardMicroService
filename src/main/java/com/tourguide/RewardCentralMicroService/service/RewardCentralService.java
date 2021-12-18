package com.tourguide.RewardCentralMicroService.service;

import java.util.UUID;

public interface RewardCentralService {

    /**
     * Récupère le nombre de point gagnés en fonction des params.
     * @param attractionId l'id de l'attraction.
     * @param userId l'id de l'utilisateur.
     * @return la valeur de point gagnés.
     */
    public int getAttractionsRewardPoints(UUID attractionId, UUID userId);
}
