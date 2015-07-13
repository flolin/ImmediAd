package com.flolin.playground.dao;

import com.flolin.playground.domain.Campaign;
import com.flolin.playground.domain.CampaignState;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by florian on 13.07.15.
 */
@RepositoryRestResource
public interface CampaignRepository extends CrudRepository<Campaign, Integer>{

    List<Campaign> findByCampaignName(@Param("campaignName") final String campaignName);

    List<Campaign> findByCampaignState(@Param("campaignState") final CampaignState campaignState);
}
