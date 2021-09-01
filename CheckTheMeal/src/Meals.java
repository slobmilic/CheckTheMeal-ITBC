
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
        return null;
    }

    public List<Meal> search(double kcal){
        return null;
    }

    @Override
    public String toString() {
        return "[" + meals.get(0).getId() + "]" + " | Name: " + meals.get(0).getName();
    }
}
