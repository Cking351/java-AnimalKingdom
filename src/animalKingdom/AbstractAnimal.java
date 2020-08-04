package animalKingdom;

abstract class AbstractAnimal {
    private int maxId = 0;

    private int id;
    private String name;
    private int yearDiscovered;

    // Constructor
    public AbstractAnimal(String name, int yearDiscovered) {
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
}