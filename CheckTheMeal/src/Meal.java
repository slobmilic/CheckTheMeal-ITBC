
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Meal implements Energy{

    private UUID id;
    private List<Nutriment> nutriments;
    private String name;

    public Meal(List<Nutriment> nutriments, String name) {
        id = UUID.randomUUID();
        this.nutriments = nutriments;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Nutriment> getNutriments() {
        return nutriments;
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

    @Override
    public double getKcal() {
        double sub = 0;
        for (Nutriment p : nutriments){
            sub += p.getTotalKcal();
        }
        return sub;
    }

    public double getProteins(){
        double sub = 0;
        for (Nutriment p : nutriments){
            sub += p.getTotalProteins();
        }
        return sub;
    }

    public double getCarbohydrates(){
        double sub = 0;
        for (Nutriment p : nutriments){
            sub += p.getTotalCarbohydrates();
        }
        return sub;
    }

    public double getFats(){
        double sub = 0;
        for (Nutriment p : nutriments){
            sub += p.getTotalFats();
        }
        return sub;
    }

    public double getFiber(){
        double sub = 0;
        for (Nutriment p : nutriments){
            sub += p.getTotalFiber();
        }
        return sub;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meal meal = (Meal) o;
        return Objects.equals(id, meal.id);
    }

}
