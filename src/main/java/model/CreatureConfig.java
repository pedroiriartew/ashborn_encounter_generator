package model;

import enums.Enviroment;
import enums.Size;
import enums.Type;
import repositories.CreatureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CreatureConfig {

    @Bean
    CommandLineRunner commandLineRunner(CreatureRepository repository)
    {
        return args -> {
            Creature bicho1 = new Creature(
                    1L,
                    "algo",
                    1L,
                    200,
                    Size.TINY,
                    Type.ABERRATION,
                    Enviroment.AQUATIC,
                    "chaotic stupid"
            );
            Creature bicho2 = new Creature(
                    2L,
                    "algo distinto",
                    2L,
                    400,
                    Size.TINY,
                    Type.UNDEAD,
                    Enviroment.GRASSLAND,
                    "chaotic piola"
            );
            repository.saveAll(List.of(bicho1, bicho2));
        };
    }
}

//            new Creature(
//                    1L,
//                    "algo",
//                    1L,
//                    200,
//                    Size.TINY,
//                    Type.ABERRATION,
//                    Enviroment.AQUATIC,
//                    "chaotic stupid"
//                    );
