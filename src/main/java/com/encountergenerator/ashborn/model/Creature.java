package com.encountergenerator.ashborn.model;

import com.encountergenerator.ashborn.enums.Environment;
import com.encountergenerator.ashborn.enums.Size;
import com.encountergenerator.ashborn.enums.Type;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Creature {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String challengeRating;
    private Integer experience;
    private Size size;
    private Type type;
    private Environment environment;
    private String alignment;

}
