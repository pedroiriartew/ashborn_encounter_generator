package com.encountergenerator.ashborn.repositories;

import com.encountergenerator.ashborn.model.Creature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//JpaRepository<T,E> T es el tipo de dato que maneja el repo y E es el tipo de dato de la clave primaria
public interface CreatureRepository extends JpaRepository<Creature, Long> {
}
