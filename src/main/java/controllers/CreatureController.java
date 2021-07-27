package controllers;

import enums.Enviroment;
import enums.Size;
import enums.Type;
import model.Creature;
import org.springframework.web.bind.annotation.*;
import services.CreatureService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping
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

    @PostMapping
    public void addNewCreature(@RequestBody Creature creature)
    {
        creatureService.addNewCreature(creature);
    }

    @DeleteMapping(path = "{creatureId}")
    public void deleteCreature(@PathVariable("creatureId") Long id)
    {
        creatureService.deleteCreature(id);
    }

    @PutMapping(path = "{creatureId}")
    public void updateCreature(@PathVariable("creatureId") Long id,
                               @RequestParam(required = false) String name,
                               @RequestParam(required = false)  Long challengeRating,
                               @RequestParam(required = false) Integer experience,
                               @RequestParam(required = false)  Size size,
                               @RequestParam(required = false)  Type type,
                               @RequestParam(required = false)  Enviroment enviroment,
                               @RequestParam(required = false)  String alignment)
    {
        creatureService.updateCreature(id, name, challengeRating, experience, size, type, enviroment, alignment);
    }
}
