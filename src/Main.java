/*
import animal.Animal;
import animalEntity.Cheetah;
import animalEntity.Eagle;
import animalEntity.Giraffe;
import animalEntity.Parrot;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Animal> animalsList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Animal cheetah = new Cheetah(new String("cheetah " + i + 5), i+2, 2000);
            animalsList.add(cheetah);
        }

        for (int i = 0; i < 3; i++) {
            Animal eagle = new Eagle(new String("eagle " + i), i + 4, 3000);
            animalsList.add(eagle);
        }

        for (int i = 0; i < 3; i++) {
            Animal giraffe = new Giraffe(new String("giraffe " + i + 10), i + 16, 10);
            animalsList.add(giraffe);
        }

        for (int i = 0; i < 3; i++) {
            Animal parrot = new Parrot(new String("parrot " + i), i, 200);
            animalsList.add(parrot);
        }

        for (int i = 0; i < animalsList.size(); i++) {
            animalsList.get(i).show(i);
            if ((i + 1) % 3 == 0)
                System.out.println();
        }

        System.out.println("\n\n\n");

        Cheetah cheetah = new Cheetah("Cheetah", 5, 100);
        Giraffe giraffe = new Giraffe("Giraffe", 10, 30);
        cheetah.hunt(giraffe);

    }

}*/


import animal.Animal;
import animalEntity.Cheetah;
import animalEntity.Eagle;
import animalEntity.Giraffe;
import animalEntity.Parrot;
import animalNature.Hunter;
import animalNature.Prey;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        List<Animal> animalsList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            animalsList.add(new Cheetah("Cheetah " + i, random.nextInt(15) + 1, random.nextInt(80) + 20));
            animalsList.add(new Eagle("Eagle " + i, random.nextInt(15) + 1, random.nextInt(100) + 10));
            animalsList.add(new Giraffe("Giraffe " + i, random.nextInt(15) + 1, random.nextInt(60) + 10));
            animalsList.add(new Parrot("Parrot " + i, random.nextInt(15) + 1, random.nextInt(50) + 10));
        }

        for (int i = 0; i < animalsList.size(); i++) {
            animalsList.get(i).show(i);
            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }

        for (int i = 0; i < 5; i++) {
            Animal hunter = animalsList.get(random.nextInt(animalsList.size()));
            Animal prey = animalsList.get(random.nextInt(animalsList.size()));

            if (hunter instanceof Hunter && prey instanceof Prey && hunter != prey) {
                ((Hunter) hunter).hunt((Prey) prey);
            }
        }
        
    }
}