package com.rocks.limestone.controllers;

import com.rocks.lemondata.entities.SoulReaper;
import com.rocks.lemondata.services.SoulReaperService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
