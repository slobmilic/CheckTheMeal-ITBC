
import java.util.ArrayList;
import java.util.List;

public class Meals {

    private List<Meal> meals;

    public List<Meal> getMeals() {
        return meals;
    }

    public boolean add(Meal m){
        for (Meal p : meals){
            if (p.equals(m)){
                meals.add(m);
                return true;
            }
        }
        return false;
    }

    public void remove(Meal m){
        for (Meal p : meals){
            meals.remove(m);
        }
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
            for (Nutriment n : nutriment){
                if (p.getNutriments().contains(n)){
                    tmp.add(p);
                }
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
        for (Meal p : meals){
            return "[" + p.getId() + "]" + " | Name: " + p.getName() + "\n";
        }
        return null;
       // return "[" + meals.get(0).getId() + "]" + " | Name: " + meals.get(0).getName();
    }
}
