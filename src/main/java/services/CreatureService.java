package services;

import model.Creature;
import repositories.CreatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreatureService {

    private final CreatureRepository creatureRepository;

    @Autowired
    public CreatureService(CreatureRepository creatureRepository) {
        this.creatureRepository = creatureRepository;
    }

    public List<Creature> getCreature()
    {
        return creatureRepository.findAll();
    }
}
