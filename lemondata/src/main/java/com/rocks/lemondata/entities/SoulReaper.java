package com.rocks.lemondata.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SoulReaper {
    @Id
    private Long id;
    private String name;
    private int squad;

    public SoulReaper() {
    }
    public SoulReaper(Long id, String name, int squad) {
        this.id = id;
        this.name = name;
        this.squad = squad;
    }

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

    public int getSquad() {
        return squad;
    }

    public void setSquad(int squad) {
        this.squad = squad;
    }

    @Override
    public String toString() {
        return "SoulReaper{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", squad=" + squad +
                '}';
    }
}
