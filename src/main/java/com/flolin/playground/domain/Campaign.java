package com.flolin.playground.domain;

import javax.persistence.*;
import javax.persistence.metamodel.Type;
import java.util.Date;

/**
 * Created by florian on 13.07.15.
 */
@Entity
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int campaignId;

    @Column
    private String campaignName;

    @Column
    private String campaignDesc;

    @Enumerated(EnumType.ORDINAL)
    private CampaignState state;

    @Enumerated(EnumType.ORDINAL)
    private CampaignType type;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

    @Column
    private Double budget;

    @Column
    private Double budgetSpent;

    public Campaign(String campaignName, String campaignDesc, CampaignState state, CampaignType type, Date creationDate,
                    Date endDate, Double budget, Double budgetSpent) {
        this.campaignName = campaignName;
        this.campaignDesc = campaignDesc;
        this.state = state;
        this.type = type;
        this.creationDate = creationDate;
        this.endDate = endDate;
        this.budget = budget;
        this.budgetSpent = budgetSpent;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getCampaignDesc() {
        return campaignDesc;
    }

    public void setCampaignDesc(String campaignDesc) {
        this.campaignDesc = campaignDesc;
    }

    public CampaignState getState() {
        return state;
    }

    public void setState(CampaignState state) {
        this.state = state;
    }

    public CampaignType getType() {
        return type;
    }

    public void setType(CampaignType type) {
        this.type = type;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public Double getBudgetSpent() {
        return budgetSpent;
    }

    public void setBudgetSpent(Double budgetSpent) {
        this.budgetSpent = budgetSpent;
    }

    @Override
    public String toString() {
        return "Campaign{" +
                "campaignId=" + campaignId +
                ", campaignName='" + campaignName + '\'' +
                ", campaignDesc='" + campaignDesc + '\'' +
                ", state=" + state +
                ", type=" + type +
                ", creationDate=" + creationDate +
                ", endDate=" + endDate +
                ", budget=" + budget +
                ", budgetSpent=" + budgetSpent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Campaign campaign = (Campaign) o;

        if (campaignId != campaign.campaignId) return false;
        if (!campaignName.equals(campaign.campaignName)) return false;
        if (!creationDate.equals(campaign.creationDate)) return false;
        if (state != campaign.state) return false;
        if (type != campaign.type) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = campaignId;
        result = 31 * result + campaignName.hashCode();
        result = 31 * result + state.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + creationDate.hashCode();
        return result;
    }
}
