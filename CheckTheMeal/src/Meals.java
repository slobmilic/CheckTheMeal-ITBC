import java.util.List;

public class Meals {

    List<Meal>meals;

    public List<Meal> getMeals() {
        return meals;
    }

    public boolean add(Meal m){
        return false;
    }

    public void remove(Meal m){

    }

    public List<Meal> search(String s){
        return null;
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
