package dao;

import entity.Pet;

import java.util.List;

public interface PetDao {
    List<Pet> queryPetAll();
}
