package class11;

import java.util.concurrent.Callable;

public class CatTester {
    public static void main(String[] args) {
        // creating a object from the Cat class
        Cat cat1= new Cat();
        cat1.name="lego";
        cat1.age=2;
        cat1.breed="van cat";
        cat1.color="grey";
        cat1.attitude=false;
        cat1.eat();

        Cat cat2=new Cat();
        cat2.name="loki";
        cat2.breed="domestic";
        cat2.color="white";
        cat2.speak();
        System.out.println(cat2.breed);
        cat2.speak();


            }
        }



