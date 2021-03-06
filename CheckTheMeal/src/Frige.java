import java.util.ArrayList;
import java.util.List;

public class Frige {

    private List<Nutriment>nutriments;

    public Frige(List<Nutriment> nutriments) {
        this.nutriments = nutriments;
    }

    public Frige() {
        nutriments = new ArrayList<>();
    }

    public Nutriment getNutriment(String s){
        for (Nutriment n : nutriments){
            if (n.getName().equals(s))
                return n;
        }
        return null;
    }

    public void add(Nutriment n){
        boolean isFound = false;
        for (Nutriment p : nutriments){
            if (p.equals(n)){
                p.setWeight(p.getWeight() + n.getWeight());
                isFound = true;
                break;
            }
        }
        if (!isFound){
            nutriments.add(n);
        }
    }

    public void remove(Nutriment n){
        nutriments.remove(n);
    }

    public void remove(Nutriment n, double weight){
        for (Nutriment p : nutriments){
            if (p.equals(n)){
                p.setWeight(p.getWeight() - weight);
            }
        }
    }

    public List<Nutriment> getNutriments() {
        return nutriments;
    }
}
