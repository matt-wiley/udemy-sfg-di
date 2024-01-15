package com.springframework.pets;

public class PetServiceFactory {

  public PetService getPetService(String petType) {
    return switch (petType) {
      case "cat" -> new CatPetService();
      case "dog" -> new DogPetService();
      default -> new DogPetService();
    };
  }

}
