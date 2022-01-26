package com.clinic.service;

import com.clinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet save(Pet pet);

    Pet findById(Long id);

    Set<Pet> findAll();
}
