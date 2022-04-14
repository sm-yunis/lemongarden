package com.rocks.lemondata.services;

import com.rocks.lemondata.entities.SoulReaper;

import java.util.List;

public interface SoulReaperService {
    void AddSoulReaper(Long id, String name, int squad);

    SoulReaper getSoulReaperByName(String name);

    SoulReaper getSoulReaperById(Long id);

    List<SoulReaper> getAllSoulReapers();
}
