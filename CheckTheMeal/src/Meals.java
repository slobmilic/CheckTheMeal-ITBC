
import java.util.ArrayList;
import java.util.List;

public class Meals {

    private List<Meal> meals;

    public Meals(List<Meal> meals) {
        this.meals = meals;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public boolean add(Meal m){
        if (!meals.contains(m))
            meals.add(m);
        return true;
    }

    public void remove(Meal m){
            meals.remove(m);
    }

    public Meal searchMeal(String s){
        Meal n = new Meal();
        for (Meal m : meals){
            if (m.getName().equals(s))
                n = m;
            break;
        }
        return n;
    }

    public List<Meal> search(String s){
        List<Meal> tmp = new ArrayList<>();
        for (Meal p : meals){
            if (p.getName().contains(s))
                tmp.add(p);
        }
        return tmp;
    }

    public List<Meal> search(List<Nutriment> nutriment){
        List<Meal> tmp = new ArrayList<>();
        for (Meal p : meals){
            if (nutriment.containsAll(p.getNutriments())) {
                tmp.add(p);
            }
        }

        return tmp;
    }

    public List<Meal> search(double kcal){
        List<Meal> tmp = new ArrayList<>();
        for (Meal p : meals){
            if (p.getKcal() < kcal){
                tmp.add(p);
            }
        }
        return tmp;
    }

    @Override
    public String toString() {
       StringBuilder x = new StringBuilder();

       for (Meal p : meals){
            x.append("[").append(p.getId()).append("]").append(" | Name: ").append(p.getName()).append("\n");
        }

        return x.toString();
       // return "[" + meals.get(0).getId() + "]" + " | Name: " + meals.get(0).getName();
    }
}
