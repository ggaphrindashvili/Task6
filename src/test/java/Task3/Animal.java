package Task3;

class Animal {
    protected String species;

    public Animal(String species) {
        this.species = species;
    }
}

class Mammal extends Animal {
    protected String diet;

    public Mammal(String species, String diet) {
        super(species);
        this.diet = diet;
    }
}

class Dog extends Mammal {
    private String breed;

    public Dog(String species, String diet, String breed) {
        super(species, diet);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" + "species='" + species + "', diet='" + diet + "', breed='" + breed + "'}";
    }

    public static void main(String[] args) {
        Dog dog = new Dog("ცუგრუმელა", "კომპეტენტო", "German shephard");
        System.out.println(dog);
    }
}
