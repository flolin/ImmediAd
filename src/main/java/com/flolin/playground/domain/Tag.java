package com.flolin.playground.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by florian on 13.07.15.
 */
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    // Publisher
    @ManyToOne
    private Partner partner;

    @OneToMany
    private List<Campaign> suitableCampaigns;
}
