package com.encountergenerator.ashborn.model;

import com.encountergenerator.ashborn.enums.Enviroment;
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
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private Long challengeRating;
    private Integer experience;
    private Size size;
    private Type type;
    private Enviroment enviroment;
    private String alignment;

}
