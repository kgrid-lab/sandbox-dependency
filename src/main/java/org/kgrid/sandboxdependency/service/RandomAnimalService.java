package org.kgrid.sampledependency.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomAnimalService {
  private String[] animals = new String[] {"Dog", "Cat", "Mouse"};
  private Random random = new Random();

  public String getRandomAnimal() {
    return animals[random.nextInt(animals.length)];
  }
}
