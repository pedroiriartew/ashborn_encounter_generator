package services;

import enums.Enviroment;
import enums.Size;
import enums.Type;
import model.Creature;
import repositories.CreatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

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

    public void addNewCreature(Creature creature) {
        Optional<Creature> creatureById = creatureRepository.findById(creature.getId());

        if (creatureById.isPresent())
        {
            throw new IllegalStateException("Creature already in the database");
        }

        creatureRepository.save(creature);
    }

    public void deleteCreature(Long id) {
        boolean exists = creatureRepository.existsById(id);
        if (!exists)
            throw new IllegalStateException("Creture with id: " + id +" does not exists");
        else
            creatureRepository.deleteById(id);
    }

    @Transactional
    public void updateCreature(Long id, String name, Long challengeRating, Integer experience, Size size, Type type, Enviroment enviroment, String alignment) {
        Creature creature = creatureRepository.findById(id).orElseThrow(()-> new IllegalStateException("There is no Creature with "+ id + "as ID"));

        creature.setName(name);
        creature.setChallengeRating(challengeRating);
        creature.setExperience(experience);
        creature.setSize(size);
        creature.setType(type);
        creature.setEnviroment(enviroment);
        creature.setAlignment(alignment);

    }
}
