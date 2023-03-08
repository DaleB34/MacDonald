public class Chick extends Animal
{
    private boolean multipleSounds;

    public Chick(String name, String type, String sound, int age, boolean multipleSounds)
    {
        super(name, type, sound, age);
        this.multipleSounds = multipleSounds;
    }

    public String sing()
    {
        if(multipleSounds)
        {
            if(Math.random() * 10 < 5)
            {
                return "Peep";
            }
            else
            {
                return "Cheep";
            }
        }
        else
            return sound;
    }
}
