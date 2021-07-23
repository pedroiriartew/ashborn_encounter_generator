package com.encountergenerator.ashborn.controllers;

import com.encountergenerator.ashborn.model.Creature;
import com.encountergenerator.ashborn.services.CreatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping
public class CreatureController {

    private final CreatureService creatureService;

    @Autowired
    public CreatureController(CreatureService creatureService) {
        this.creatureService = creatureService;
    }

    @GetMapping
    public List<Creature> getCreature()
    {
        return creatureService.getCreature();
    }
}
