package com.epicepidemic.lanconnectapi.dao;

import javax.persistence.*;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToOne @JoinColumn(name="studioId")
    private Studio studioId;
    @ManyToOne @JoinColumn(name="esrbRatingId")
    private EsrbRating esrbRatingId;
    private Integer metaCriticScore;
    private Integer maxMpTeamSize;
    private Integer maxCoopTeamSize;
    private String pictureUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Studio getStudioId() {
        return studioId;
    }

    public void setStudioId(Studio studioId) {
        this.studioId = studioId;
    }

    public EsrbRating getEsrbRatingId() {
        return esrbRatingId;
    }

    public void setEsrbRatingId(EsrbRating esrbRatingId) {
        this.esrbRatingId = esrbRatingId;
    }

    public Integer getMetaCriticScore() {
        return metaCriticScore;
    }

    public void setMetaCriticScore(Integer metaCriticScore) {
        this.metaCriticScore = metaCriticScore;
    }

    public Integer getMaxMpTeamSize() {
        return maxMpTeamSize;
    }

    public void setMaxMpTeamSize(Integer maxMpTeamSize) {
        this.maxMpTeamSize = maxMpTeamSize;
    }

    public Integer getMaxCoopTeamSize() {
        return maxCoopTeamSize;
    }

    public void setMaxCoopTeamSize(Integer maxCoopTeamSize) {
        this.maxCoopTeamSize = maxCoopTeamSize;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}
