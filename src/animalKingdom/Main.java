package animalKingdom;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static List<AbstractAnimal> filteredList = new ArrayList<>();
    public static void filterAnimal(List<AbstractAnimal> animals, CheckAnimal tester) {
        for (AbstractAnimal v : animals) {
            if (tester.test(v)) {
                System.out.println(v.getName());
            }
        }
    }

    public static void workWithAnimals() {
        System.out.println("Let's see if it works..\n");



        // MAMMAL LIST
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        // BIRDS LIST
        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        // FISH LIST
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        // ARRAYLIST    
        ArrayList<AbstractAnimal> animalSort = new ArrayList<AbstractAnimal>();

        // MAMMAL ADDLIST
        animalSort.add(panda);
        animalSort.add(zebra);
        animalSort.add(koala);
        animalSort.add(sloth);
        animalSort.add(armadillo);
        animalSort.add(raccoon);
        animalSort.add(bigfoot);

        // BIRDS ADDLIST
        animalSort.add(pigeon);
        animalSort.add(peacock);
        animalSort.add(toucan);
        animalSort.add(parrot);
        animalSort.add(swan);

        // FISH ADDLIST
        animalSort.add(salmon);
        animalSort.add(catfish);
        animalSort.add(perch);

        // *** List all the animals in descending order by year named ***
        System.out.println("\n*** List all the animals in descending order by year named ***");
        animalSort.sort((v1, v2) -> v2.getYearDiscovered() - v1.getYearDiscovered());
        for (AbstractAnimal animal : animalSort) {
            System.out.println("Name: " + animal.getName() + "'s Id: " + animal.getId() + " named in: " + animal.getYearDiscovered());
        }

        // *** List all the animals alphabetically ***
        System.out.println("\n*** List all the animals alphabetically ***");
        animalSort.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        for (AbstractAnimal animal : animalSort) {
            System.out.println("Name: " + animal.getName() + "s Id: " + animal.getId() + " named in: " + animal.getYearDiscovered());
        }

        // *** List all the animals order by how they move ***
        System.out.println("\n*** List all the animals order by how they move ***");
        animalSort.sort((v1, v2) -> v1.move().compareToIgnoreCase(v2.move()));
        for (AbstractAnimal animal : animalSort) {
            System.out.println("Name: " + animal.getName() + "s Id: " + animal.getId() + " named in: " + animal.getYearDiscovered());
        }

        // *** List only those animals the breath with lungs ***
        System.out.println("\n*** List only those animals the breath with lungs ***");
        filterAnimal(animalSort, v -> v.breathe() == "lungs");
        System.out.println();

        // *** List only those animals that breath with lungs and were named in 1758 ***
        System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");
        filterAnimal(animalSort, v -> v.reproduce() == "laid eggs" && v.breathe() == "lungs");
        System.out.println();

        // *** List alphabetically only those animals that were named in 1758 ***
        System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");
        animalSort.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        for (AbstractAnimal animal : animalSort) {
            if (animal.yearDiscovered == 1758) {
                System.out.println("Name: " + animal.getName() + "s Id: " + animal.getId() + " named in: " + animal.getYearDiscovered());
            }
        }

        // *** Lets try the Strech Goal ***
        System.out.println("\n*** Stretch Goal ***");
        System.out.println("\n*** For the list of animals, list alphabetically those animals that are mammals ***");
        filterAnimal(animalSort, v -> ((v instanceof Mammal)));
        filteredList.forEach(v -> System.out.println(v.getName() + " " + v.reproduce() + " " + v.move() + " " + v.breathe() + " " + v.yearDiscovered));

        
    }
    public static void main(String[] args) {
        workWithAnimals();
    }
}