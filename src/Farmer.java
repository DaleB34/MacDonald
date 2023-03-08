public class Farmer
{
    private String name;
    private Animal[] animals;
    private int count = 0;

    public Farmer(String name, int numAnimals)
    {
        this.name = name;
        animals =new Animal[numAnimals];
    }

    public void addAnimal(Animal a)
    {
        animals[count] = a;
        count++;
    }

    public String sing()
    {
        String output = "";
        for(int i = 0; i < count; i ++)
        {
             output  = "\nOld MacDonald had a farm, \nEe i ee i oh"
                     + "\nAnd on his farm he had a " + animals[i] + "\nEe i ee i oh"
                     + "\nWith a " + animals[i].sing() + "-" + animals[i].sing() + "here"
                     + "\nAnd a " + animals[i].sing() + "-" + animals[i].sing() + "there"
                     + "\nHere a " + animals[i].sing()  + ", There a " + animals[i].sing()
                     + "\nEverywhere a " + animals[i].sing() + "-" + animals[i].sing();

        }


        return output;
    }
}
