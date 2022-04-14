package com.rocks.limestone.controllers;

import com.rocks.lemondata.entities.SoulReaper;
import com.rocks.lemondata.services.SoulReaperService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/soulreapers")
public class SoulReaperController {

    private final SoulReaperService soulReaperService;

    public SoulReaperController(SoulReaperService soulReaperService) {
        this.soulReaperService = soulReaperService;
    }

    @GetMapping
    public List<SoulReaper> getAllSoulReapers() {
        return soulReaperService.getAllSoulReapers();
    }

    @GetMapping("/{name}")
    public SoulReaper getSoulReaperByName(@PathVariable String name) {
        return soulReaperService.getSoulReaperByName(name);
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void addSoulReapers(@RequestBody SoulReaper soulReaper) {
        soulReaperService.addSoulReaper(soulReaper.getId(),soulReaper.getName(),soulReaper.getSquad());
    }

}
