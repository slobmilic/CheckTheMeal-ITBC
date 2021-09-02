import java.util.ArrayList;
import java.util.List;

public class Frige {

    private List<Nutriment>nutriments;

    public Frige(List<Nutriment> nutriments) {
        this.nutriments = nutriments;
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
        for (Nutriment p : nutriments){
            nutriments.remove(n);
        }
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
