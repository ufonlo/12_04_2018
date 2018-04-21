package Animal;

public class Main {

   static Cat cat = new Cat();
   static People people = new People();
    public static void main(String[] args) {

        cat.name = "jej";
        cat.poroda = "pers";
        cat.vozrast = 10;

        people.name = "Hennadii";
        people.lastName = "Bohovuk";
        people.age = 31;
people.cat = cat;


        System.out.println(people);
        cat.say();
        people.cat.say();

    }
}
