package Animal;

public class Cat {
    int vozrast = 10;
    String poroda;
    String name;

    void say(){
        System.out.println("May!");
    }


    @Override
    public String toString() {
        return "Cat[Name: = " + name + ",poroda: = " + poroda + ",  vozrast" + vozrast + "]";
    }
}
