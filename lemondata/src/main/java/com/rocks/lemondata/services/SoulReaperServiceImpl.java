package com.rocks.lemondata.services;

import com.rocks.lemondata.entities.SoulReaper;
import com.rocks.lemondata.repositories.SoulReaperRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class SoulReaperServiceImpl implements SoulReaperService {

    private final SoulReaperRepository repository;

    public SoulReaperServiceImpl(SoulReaperRepository repository) {
        this.repository = repository;
    }

    public void addSoulReaper(Long id, String name, int squad) {
        repository.save(new SoulReaper(id, name, squad));
    }

    public SoulReaper getSoulReaperByName(String name) {
        return repository.findByName(name);
    }

    public SoulReaper getSoulReaperById(Long id) {
        return repository.getById(id);
    }

    @Override
    public List<SoulReaper> getAllSoulReapers() {
       return repository.findAll();
    }
}
