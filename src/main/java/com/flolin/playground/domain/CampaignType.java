package com.flolin.playground.domain;

import javax.persistence.Enumerated;

/**
 * Created by florian on 13.07.15.
 */
@SuppressWarnings("UnusedDeclaration")
public enum CampaignType {

    DESKTOP("Desktop"),

    MOBILE("Mobile"),

    NATIVE("Native"),

    POPUNDER("Popunder");

    /**
     * The readable name.
     */
    private String readableName;

    CampaignType(String aReadableName){
        this.readableName = aReadableName;
    }

    public String getReadableName() {
        return readableName;
    }

    public void setReadableName(String readableName) {
        this.readableName = readableName;
    }

    @Override
    public String toString() {
        return "CampaignType{" +
                "readableName='" + readableName + '\'' +
                '}';
    }
}
