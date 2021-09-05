
import java.util.ArrayList;

import java.util.Scanner;


public class MainTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Meal> meals = new ArrayList<>();

        Food cheese = new Food("Reallinks", "Cheese  -  Swiss  Sliced", 360.39, 104.49, 11.44, 17.22, 17.18, 20.9);
        Food pancetta = new Food("Zoomlounge", "Pancetta", 717.17, 228.97, 13.63, 2.25, 11.24, 6.01);
        Food pepperoni = new Food("Quaxo", "Pepperoni  Slices", 125.41, 853.62, 23.24, 22.14, 1.7, 4.15);
        Food mushroom = new Food("Edgewire", "Mushroom  -  Morel  Frozen", 624.46, 74.39, 20.65, 5.76, 5.32, 18.65);
        Food tuna = new Food("Skyndu", "Tuna  -  Sushi  Grade", 146.27, 436.82, 0.59, 9.55, 5.05, 16.63);

        Meals m1 = new Meals(meals);

        Frige frige = new Frige();


        while (true) {
            System.out.println("| CHECK THE MEAL |\n\nChoose one option:");
            System.out.println(" 1. Admin\n 2. User\n 0. Exit");
            int broj = sc.nextInt();

            switch (broj) {
                case 1:
                    ArrayList<Nutriment> tmp = new ArrayList<>();
                    while (broj != 0) {
                        System.out.println("Welcome Admin!\n Note: Back to main menu to make new Meal!");
                        System.out.println("Choose option:\n 1. Add Nutriment\n 2. Add Meal\n 3. Remove meal\n 4. Remove nutriment from meal\n 0. Back");

                        broj = sc.nextInt();

                        switch (broj) {
                            case 1:
                                System.out.println("""
                                        Get nutriment from list to add in meal:\s
                                         1. Cheese  -  Swiss  Sliced
                                         2. Pancetta
                                         3. Pepperoni  Slices
                                         4. Mushroom  -  Morel  Frozen
                                         5. Tuna  -  Sushi  Grade
                                         6. Make new
                                         9. finish""");
                                while (broj != 9) {
                                    broj = sc.nextInt();
                                    switch (broj) {
                                        case 1:
                                            tmp.add(cheese);
                                            break;
                                        case 2:
                                            tmp.add(pancetta);
                                            break;
                                        case 3:
                                            tmp.add(pepperoni);
                                            break;
                                        case 4:
                                            tmp.add(mushroom);
                                            break;
                                        case 5:
                                            tmp.add(tuna);
                                            break;
                                        case 6:
                                            System.out.println("Enter new nutriment in order: Company, Name, Weight, Kcal, Proteins, Carbohydrates, Fats, Fiber:");
                                            String company = sc.next();
                                            String name = sc.next();
                                            Double weight = sc.nextDouble();
                                            Double kcal = sc.nextDouble();
                                            Double proteins = sc.nextDouble();
                                            Double carbohydrates = sc.nextDouble();
                                            Double fats = sc.nextDouble();
                                            Double fiber = sc.nextDouble();
                                            tmp.add(new Food(company, name, weight, kcal, proteins, carbohydrates, fats, fiber));

                                        case 9:
                                            break;
                                    }
                                }
                                break;

                            case 2:
                                System.out.println("Enter name of meal:");
                                String s = sc.next();
                                Meal x = new Meal(tmp, s);
                                m1.add(x);
                                break;
                            case 3:
                                System.out.println("Enter name of meal to remove:");
                                String mea = sc.next();
                                m1.remove(m1.searchMeal(mea));
                                break;

                            case 4:
                                System.out.println("Enter meal that you want to remove nutriment");
                                String str = sc.next();
                                System.out.println("Enter nutriment to be removed");
                                String nut = sc.next();
                                m1.searchMeal(str).remove(m1.searchMeal(str).getMealNutriment(nut));
                                System.out.println(m1.searchMeal(str).getNutriments());
                                break;
                            case 0:
                                break;
                        }
                    }
                    break;
                case 2:
                    while (broj != 0) {
                        System.out.println("Welcome User!");
                        System.out.println("""
                                Choose option:
                                 1. Add Nutriment
                                 2. Remove nutriment
                                 3. Remove weight of nutriments
                                 4. List of meals
                                 5. Search the meal by name
                                 6. Search the meal that hes less KCAL then entered
                                 7. Search list of meals with available nutriments
                                 8. Get nutrition tables
                                 0. for back""");
                        broj = sc.nextInt();
                        switch (broj) {
                            case 1:
                                System.out.println("""
                                        Get nutriment from list to add to your frige:\s
                                         1. Cheese  -  Swiss  Sliced
                                         2. Pancetta
                                         3. Pepperoni  Slices
                                         4. Mushroom  -  Morel  Frozen
                                         5. Tuna  -  Sushi  Grade
                                         6. Make new
                                         9. finish""");
                                while (broj != 9) {
                                    broj = sc.nextInt();
                                    switch (broj) {
                                        case 1:
                                            frige.add(cheese);
                                            break;
                                        case 2:
                                            frige.add(pancetta);
                                            break;
                                        case 3:
                                            frige.add(pepperoni);
                                            break;
                                        case 4:
                                            frige.add(mushroom);
                                            break;
                                        case 5:
                                            frige.add(tuna);
                                            break;
                                        case 6:
                                            System.out.println("Enter new nutriment in order: Company, Name, Weight, Kcal, Proteins, Carbohydrates, Fats, Fiber:");
                                            String company = sc.next();
                                            String name = sc.next();
                                            Double weight = sc.nextDouble();
                                            Double kcal = sc.nextDouble();
                                            Double proteins = sc.nextDouble();
                                            Double carbohydrates = sc.nextDouble();
                                            Double fats = sc.nextDouble();
                                            Double fiber = sc.nextDouble();
                                            frige.add(new Food(company, name, weight, kcal, proteins, carbohydrates, fats, fiber));
                                            broj = 0;
                                            break;
                                        case 9:
                                            break;
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Enter name of nutriment to be removed:");
                                String s = sc.next();
                                frige.remove(frige.getNutriment(s));
                                break;
                            case 3:
                                System.out.println("Enter name and amount of nutriment to decrese weight:");
                                String c = sc.next();
                                double d = sc.nextDouble();
                                frige.remove(frige.getNutriment(c), d);
                                break;
                            case 4:
                                System.out.println(m1 + "\n");
                                break;
                            case 5:
                                System.out.println("Enter name of meal:");
                                String m = sc.next();
                                ArrayList<String> availableMeals1 = new ArrayList<>();
                                for (Meal p : m1.search(m)) {
                                    availableMeals1.add(p.getName());
                                }
                                System.out.println(availableMeals1 + "\n");
                                break;
                            case 6:
                                System.out.println("Enter number of KCAL");
                                double kcalLimit = sc.nextDouble();
                                ArrayList<String> availableMeals2 = new ArrayList<>();
                                for (Meal p : m1.search(kcalLimit)) {
                                    availableMeals2.add(p.getName());
                                }
                                System.out.println(availableMeals2 + "\n");
                                break;
                            case 7:
                                ArrayList<String> availableMeals = new ArrayList<>();
                                for (Meal p : m1.search(frige.getNutriments())) {
                                    availableMeals.add(p.getName());
                                }
                                System.out.println(availableMeals + "\n");
                                break;
                            case 8:
                                while (broj != 9) {
                                    System.out.println("""
                                            1. Get nutrition table in % for nutriment
                                            2. Get total nutrition table for nutriment
                                            3. Get total nutrition table for meal
                                            9. back""".indent(1));
                                    broj = sc.nextInt();
                                    switch (broj) {
                                        case 1:
                                            System.out.println("Enter name of nutriment");
                                            String nut = sc.next();
                                            System.out.println(frige.getNutriment(nut) + "\n");
                                            break;
                                        case 2:
                                            System.out.println("Enter name of nutriment");
                                            String nut1 = sc.next();
                                            System.out.println(frige.getNutriment(nut1).totalNutrientTable());
                                            break;
                                        case 3:
                                            System.out.println("Enter name of meal");
                                            String mea = sc.next();
                                            System.out.println(m1.searchMeal(mea).totalMealNutrientTable());
                                            break;
                                        case 9:
                                            break;
                                    }
                                }
                            case 0:
                                break;
                        }
                    }
                    break;
                case 0:
                    return;
            }
        }
    }
}
