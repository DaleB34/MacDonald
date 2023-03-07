public class Chick extends Animal
{
    private boolean multipleSounds;

    public Chick(String name, String type, String sound, int age, boolean multipleSounds)
    {
        super(name, type, sound, age);
        this.multipleSounds = multipleSounds;
    }
}
