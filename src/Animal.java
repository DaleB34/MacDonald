public class Animal
{
    public String name;
    public String type;
    public String sound;
    public int age;

    public Animal(String name, String type, String sound, int age)
    {
        this.name = name;
        this.type = type;
        this.sound = sound;
        this.age = age;
    }

    public String sing()
    {
        return sound;
    }
}
