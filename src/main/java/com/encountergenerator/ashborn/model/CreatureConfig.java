package com.encountergenerator.ashborn.model;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.encountergenerator.ashborn.services.CreatureService;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

//@Configuration
public class CreatureConfig {

//    @Bean
//    CommandLineRunner commandLineRunner(CreatureService creatureService)
//    {
//        return args -> {
//            //leo el JSON
//            ObjectMapper mapper = new ObjectMapper();
//            TypeReference<List<Creature>> typeReference = new TypeReference<List<Creature>>(){};
//            InputStream inputStream = TypeReference.class.getResourceAsStream("/json/creatures.json");
//
//            try {
//                List<Creature> creatures = mapper.readValue(inputStream, typeReference);
//                creatureService.saveCreatures(creatures);
//                System.out.println("Creatures saved");
//            }
//            catch(IOException e)
//            {
//                System.out.println("Creatures can not be saved: " + e.getMessage());
//            }
//        };
//    }
}