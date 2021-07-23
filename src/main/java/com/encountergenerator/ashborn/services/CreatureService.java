package com.encountergenerator.ashborn.services;

import com.encountergenerator.ashborn.enums.Enviroment;
import com.encountergenerator.ashborn.enums.Size;
import com.encountergenerator.ashborn.enums.Type;
import com.encountergenerator.ashborn.model.Creature;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreatureService {

    public List<Creature> getCreature()
    {
        return List.of(new Creature(
                1L,
                "algo",
                1L,
                200,
                Size.HUGE,
                Type.ABERRATION,
                Enviroment.AQUATIC,
                "chaotic stupid"
        ));
    }
}
