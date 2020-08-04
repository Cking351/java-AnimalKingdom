package animalKingdom;

public class Fish extends AbstractAnimal {

    // Constructor method
    public Fish(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    
    @Override
    public String move() {
        return "swims";
    }

    @Override
    public String breathe() {
        return "gills";
    }

    @Override
    public String reproduce() {
        return "laid eggs";
    }
}