import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Meal implements Energy{

    private UUID id;
    private List<Nutriment> nutriments;
    private String name;

    public Meal(List<Nutriment> nutriments, String name) {
        this.nutriments = nutriments;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void add(Nutriment n){

    }

    public void remove(Nutriment n){

    }

    public void remove(Nutriment n, double weight){

    }

    @Override
    public double getKcal() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meal meal = (Meal) o;
        return Objects.equals(id, meal.id) && Objects.equals(nutriments, meal.nutriments) && Objects.equals(name, meal.name);
    }

}
