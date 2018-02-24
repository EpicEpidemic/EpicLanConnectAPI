package com.epicepidemic.lanconnectapi.dao;

import javax.persistence.*;

@Entity
public class FriendList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne @JoinColumn(name="userOneId")
    private User userOneId;
    @ManyToOne @JoinColumn(name="userTwoId")
    private User userTwoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUserOneId() {
        return userOneId;
    }

    public void setUserOneId(User userOneId) {
        this.userOneId = userOneId;
    }

    public User getUserTwoId() {
        return userTwoId;
    }

    public void setUserTwoId(User userTwoId) {
        this.userTwoId = userTwoId;
    }
}
