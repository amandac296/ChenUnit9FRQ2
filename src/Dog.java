public class Dog extends Pet {
    private String breed;

    public Dog(String n, String breed) {
        super(n, "dog");
        this.breed = breed;
    }


    @Override
    public void printPetInfo() {
        super.printPetInfo();
        System.out.print(" of breed " + breed);
    }
}
