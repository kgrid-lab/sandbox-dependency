package org.kgrid.sandboxdependency.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
public class RandomAnimalServiceTest {

  private RandomAnimalService randomAnimalService;

  @Test
  public void testReturnsAnimal() {
    randomAnimalService = new RandomAnimalService();
    String randomAnimal = randomAnimalService.getRandomAnimal();
    assertNotNull(randomAnimal);
  }
}
