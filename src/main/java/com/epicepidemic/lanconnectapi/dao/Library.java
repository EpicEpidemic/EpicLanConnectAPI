package com.epicepidemic.lanconnectapi.dao;

import javax.persistence.*;

@Entity
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne @JoinColumn(name="userId")
    private User userId;
    @ManyToOne @JoinColumn(name="gameEditionId")
    private GameEdition gameEditionId;
    private Integer userScore;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public GameEdition getGameEditionId() {
        return gameEditionId;
    }

    public void setGameEditionId(GameEdition gameEditionId) {
        this.gameEditionId = gameEditionId;
    }

    public Integer getUserScore() {
        return userScore;
    }

    public void setUserScore(Integer userScore) {
        this.userScore = userScore;
    }
}
