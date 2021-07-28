package controllers;

import enums.Environment;
import enums.Size;
import enums.Type;
import model.Creature;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import services.CreatureService;
import org.springframework.beans.factory.annotation.Autowired;


@Controller
@RequestMapping("/creatures")
public class CreatureController {

    private final CreatureService creatureService;

    @Autowired
    public CreatureController(CreatureService creatureService) {
        this.creatureService = creatureService;
    }

    @GetMapping
    public String getCreature()
    {
        return "index";
    }

    @GetMapping("/all")
    public String showAllCreatures(Model model) {
        model.addAttribute("creatures", creatureService.getCreatures());
        return "creatures";
    }

    @PostMapping
    public void addNewCreature(@RequestBody Creature creature)
    {
        creatureService.addNewCreature(creature);
    }

    @PostMapping(path = "/{creatureId}/delete")
    public void deleteCreature(@PathVariable("creatureId") Long id)
    {
        creatureService.deleteCreature(id);
    }

    @PostMapping(path = "/{creatureId}/update")
    public void updateCreature(@PathVariable("creatureId") Long id,
                               @RequestParam(required = false) String name,
                               @RequestParam(required = false)  String challengeRating,
                               @RequestParam(required = false) Integer experience,
                               @RequestParam(required = false)  Size size,
                               @RequestParam(required = false)  Type type,
                               @RequestParam(required = false)  Environment environment,
                               @RequestParam(required = false)  String alignment)
    {
        creatureService.updateCreature(id, name, challengeRating, experience, size, type, environment, alignment);
    }
}
