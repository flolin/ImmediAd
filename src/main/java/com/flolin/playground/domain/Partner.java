package com.flolin.playground.domain;

import javax.persistence.*;

/**
 * Created by florian on 13.07.15.
 */
@Entity
public class Partner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Enumerated(EnumType.ORDINAL)
    private Partner partnerType;
}
