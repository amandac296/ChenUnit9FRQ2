



public class Rose extends Flower
{
    private String color;


    public Rose (String name, int petals, String color)
    {
        super(name, petals);
        this.color = color;
    }


    public String getColor()
    {
        return color;
    }


    @Override
    public String info()
    {
        String str = super.info() + "\nColor: " + color;
        return str;
    }
}




