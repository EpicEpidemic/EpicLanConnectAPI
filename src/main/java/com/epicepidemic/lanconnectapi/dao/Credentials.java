package com.epicepidemic.lanconnectapi.dao;

import javax.persistence.*;

@Entity
public class Credentials {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne @JoinColumn(name="userId")
    private
    User userId;
    @ManyToOne @JoinColumn(name="providerId")
    private
    Provider providerId;
    private String token;

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

    public Provider getProviderId() {
        return providerId;
    }

    public void setProviderId(Provider providerId) {
        this.providerId = providerId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

