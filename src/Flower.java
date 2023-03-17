public class Flower extends Plant
{
    private int petals;


    public Flower (String name, int petals){
        super(name);
        this.petals = petals;
    }

    public int getPetals(){
        return petals;
    }


    @Override
    public String info()
    {
        String str = super.info() + "\npetals: " + petals;
        return str;
    }


    public void losePetals(int removePetals)
    {
        petals -= removePetals;
    }
}
