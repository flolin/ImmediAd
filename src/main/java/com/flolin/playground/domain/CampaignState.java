package com.flolin.playground.domain;

import javax.persistence.Entity;
import javax.persistence.Enumerated;

/**
 * Created by florian on 13.07.15.
 */
@SuppressWarnings("UnusedDeclaration")
public enum CampaignState {

    ONLINE("Online"),

    OFFLINE("Offline"),

    INITIATED("Initiated"),

    SUSPENDED("SUSPENDED");

    /**
     * The readable name.
     */
    private String readableName;

    CampaignState(String aReadableName){
        readableName = aReadableName;
    }

    public String getReadableName() {
        return readableName;
    }

    public void setReadableName(String readableName) {
        this.readableName = readableName;
    }

    @Override
    public String toString() {
        return "CampaignState{" +
                "readableName='" + readableName + '\'' +
                '}';
    }
}
