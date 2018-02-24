package com.epicepidemic.lanconnectapi.dao;

import javax.persistence.*;
import java.util.List;

@Entity
public class GameEdition {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Game gameId;
    @ManyToOne
    private System systemId;
    @ManyToOne
    private MultiplayerPlatform multiplayerPlatformid;
    private Boolean isCrossPlatform;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Game getGameId() {
        return gameId;
    }

    public void setGameId(Game gameId) {
        this.gameId = gameId;
    }

    public System getSystemId() {
        return systemId;
    }

    public void setSystemId(System systemId) {
        this.systemId = systemId;
    }

    public MultiplayerPlatform getMultiplayerPlatformid() {
        return multiplayerPlatformid;
    }

    public void setMultiplayerPlatformid(MultiplayerPlatform multiplayerPlatformid) {
        this.multiplayerPlatformid = multiplayerPlatformid;
    }

    public Boolean getCrossPlatform() {
        return isCrossPlatform;
    }

    public void setCrossPlatform(Boolean crossPlatform) {
        isCrossPlatform = crossPlatform;
    }
}
