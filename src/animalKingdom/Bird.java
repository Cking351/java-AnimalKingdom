package animalKingdom;

public class Bird extends AbstractAnimal {
    // Constructor method
    public Bird(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    @Override
    public String move() {
        return "flys";
    }

    @Override
    public String breathe() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "laid eggs";
    }
}    