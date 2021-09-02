import java.util.List;

public class Frige {

    private List<Nutriment>nutriments;

    public void add(Nutriment n){
        for (Nutriment p : nutriments){
            if (p.equals(n)){
                p.setWeight(p.getWeight() + n.getWeight());
            } else {
                nutriments.add(n);
            }
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
