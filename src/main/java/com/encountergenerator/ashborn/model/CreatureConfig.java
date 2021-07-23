package com.encountergenerator.ashborn.model;

import com.encountergenerator.ashborn.enums.Enviroment;
import com.encountergenerator.ashborn.enums.Size;
import com.encountergenerator.ashborn.enums.Type;
import com.encountergenerator.ashborn.repositories.CreatureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreatureConfig {

    @Bean
    CommandLineRunner commandLineRunner(CreatureRepository repository)
    {
        return args -> {
            new Creature(
                    1L,
                    "algo",
                    1L,
                    200,
                    Size.TINY,
                    Type.ABERRATION,
                    Enviroment.AQUATIC,
                    "chaotic stupid"
            );
            new Creature(
                    1L,
                    "algo",
                    1L,
                    200,
                    Size.HUGE,
                    Type.ABERRATION,
                    Enviroment.AQUATIC,
                    "chaotic stupid"
            );
        };
    }
}
