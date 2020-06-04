package com.kgrid.sandboxdependency.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomAnimalService {
  String[] animals = new String[] {"Dog", "Cat", "Mouse"};
  Random random = new Random();

  public String getRandomAnimal() {
    return animals[random.nextInt(animals.length)];
  }
}
