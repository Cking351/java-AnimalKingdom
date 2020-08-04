package animalKingdom;

abstract class AbstractAnimal {
    protected static int maxId = 0;

    protected int id;
    protected String name;
    protected int yearDiscovered;

    // Constructor
    public AbstractAnimal(String name, int yearDiscovered) {
        maxId++;
        id = maxId;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYearDiscovered() {
        return yearDiscovered;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearDiscovered(int yearDiscovered) {
        this.yearDiscovered = yearDiscovered;
    }

    
    public abstract String move();
    public abstract String breathe();
    public abstract String reproduce();
    
    
    @Override
    public String toString() {
        return name + " " + reproduce() + " " + move() + " " + breathe() +  " " + yearDiscovered;
    }
}