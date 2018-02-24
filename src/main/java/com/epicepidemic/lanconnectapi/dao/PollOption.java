package com.epicepidemic.lanconnectapi.dao;

import javax.persistence.*;

@Entity
public class PollOption {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @ManyToOne @JoinColumn(name="pollId")
    private Poll pollId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Poll getPollId() {
        return pollId;
    }

    public void setPollId(Poll pollId) {
        this.pollId = pollId;
    }
}
