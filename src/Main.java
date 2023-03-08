public class Main {
    public static void main(String[] args)
    {
        Chick poop = new Chick("poop", "Chicken", "Peep", 1, true);

        Farmer john = new Farmer("John", 1);
        john.addAnimal(poop);
        System.out.println(john.sing());
    }
}