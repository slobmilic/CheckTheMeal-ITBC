import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) {

        ArrayList<Meal> meals = new ArrayList<>();
        ArrayList<Nutriment> list1 = new ArrayList<>();
        Food cheese = new Food("Reallinks" , "Cheese  -  Swiss  Sliced" , 360.39 , 104.49 , 11.44 , 17.22 , 17.18 , 20.9);
        Food pancetta = new Food("Zoomlounge" , "Pancetta" , 717.17 , 228.97 , 13.63 , 2.25 , 11.24 , 6.01);
        Food salame = new Food("Quaxo" , "Pepperoni  Slices" , 125.41 , 853.62 , 23.24 , 22.14 , 1.7 , 4.15);
        Food mashroom = new Food("Edgewire" , "Mushroom  -  Morel  Frozen" , 624.46 , 74.39 , 20.65 , 5.76 , 5.32 , 18.65);

        list1.add(cheese); list1.add(pancetta); list1.add(salame); list1.add(mashroom);

        Meal pizza = new Meal(list1, "pizza");
        meals.add(pizza);
        pizza.add(new Food("Skyndu" , "Tuna  -  Sushi  Grade" , 146.27 , 436.82 , 0.59 , 9.55 , 5.05 , 16.63));

        Meals m1 = new Meals(meals);

        Frige frige = new Frige(list1);

        frige.add(new Food("Wikizz" , "Pork  -  Backfat" , 287.11 , 1482.25 , 0.93 , 13.06 , 10.7 , 14.3));

        System.out.println(m1.search(list1));


    }
}
