package com.epicepidemic.lanconnectapi.dao;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
public class Poll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private LocalDateTime beginTime;
    private LocalDateTime endTime;
    @OneToMany(mappedBy = "pollId")
    private Set<PollOption> pollOptions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(LocalDateTime beginTime) {
        this.beginTime = beginTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Set<PollOption> getPollOptions() {
        return pollOptions;
    }

    public void setPollOptions(Set<PollOption> pollOptions) {
        this.pollOptions = pollOptions;
    }
}
