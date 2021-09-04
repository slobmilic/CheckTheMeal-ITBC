import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Meal> meals = new ArrayList<>();
        ArrayList<Nutriment> list1 = new ArrayList<>();
        ArrayList<Nutriment> list2 = new ArrayList<>();
        ArrayList<Nutriment> list3 = new ArrayList<>();


        Food cheese = new Food("Reallinks" , "Cheese  -  Swiss  Sliced" , 360.39 , 104.49 , 11.44 , 17.22 , 17.18 , 20.9);
        Food pancetta = new Food("Zoomlounge" , "Pancetta" , 717.17 , 228.97 , 13.63 , 2.25 , 11.24 , 6.01);
        Food salame = new Food("Quaxo" , "Pepperoni  Slices" , 125.41 , 853.62 , 23.24 , 22.14 , 1.7 , 4.15);
        Food mashroom = new Food("Edgewire" , "Mushroom  -  Morel  Frozen" , 624.46 , 74.39 , 20.65 , 5.76 , 5.32 , 18.65);

        Food tuna = new Food("Skyndu" , "Tuna  -  Sushi  Grade" , 146.27 , 436.82 , 0.59 , 9.55 , 5.05 , 16.63);
        list1.add(cheese); list1.add(pancetta); list1.add(salame);

        Meal pizza = new Meal(list1, "pizza");
        meals.add(pizza);

        list2.add(tuna); list2.add(cheese); list2.add(pancetta); list2.add(salame);


        Meal pizza1 = new Meal(list2, "pizza1");

        meals.add(pizza1);
        Meals m1 = new Meals(meals);

        list3.add(mashroom);

        Meal pizza2 = new Meal(list3, "pizza2");
        m1.add(pizza2);
        m1.add(pizza);
        m1.add(pizza);
        //m1.remove(pizza);

//        System.out.println(m1.search("pizza"));
//        System.out.println(m1.search(5423));
//        System.out.println(m1.search(list2));

        Frige frige = new Frige();

        frige.add(new Food("Wikizz" , "Pork  -  Backfat" , 287.11 , 1482.25 , 0.93 , 13.06 , 10.7 , 14.3));
        frige.add(tuna);
        frige.add(mashroom);
        frige.add(pancetta);
        frige.add(cheese);
        frige.add(salame);

        System.out.println(m1);
//        System.out.println(frige.getNutriments().get(4).totalNutrientTable());
//        System.out.println(m1.search(frige.getNutriments()));
//        System.out.println(pizza.getNutriments());


//        System.out.println(frige.getNutriments());

        frige.remove(cheese,100);

//        System.out.println(frige.getNutriments().get(4).totalNutrientTable());





    }
}
