
import java.text.DecimalFormat;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Meal implements Energy{

    private static DecimalFormat df = new DecimalFormat("0.00");

    private UUID id;
    private List<Nutriment> nutriments;
    private String name;

    public Meal(List<Nutriment> nutriments, String name) {
        id = UUID.randomUUID();
        this.nutriments = nutriments;
        this.name = name;
    }

    public Meal() {
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
    public Nutriment getMealNutriment(String s){
        for (Nutriment n : nutriments){
            if (n.getName().equals(s))
                return n;
        }
        return null;
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

    @Override
    public double getKcal() {
        double sub = 0;
        for (Nutriment p : nutriments){
            sub += p.getTotalKcal();
        }
        return Double.parseDouble(df.format(sub));
    }

    public double getProteins(){
        double sub = 0;
        for (Nutriment p : nutriments){
            sub += p.getTotalProteins();
        }
        return Double.parseDouble(df.format(sub));
    }

    public double getCarbohydrates(){
        double sub = 0;
        for (Nutriment p : nutriments){
            sub += p.getTotalCarbohydrates();
        }
        return Double.parseDouble(df.format(sub));
    }

    public double getFats(){
        double sub = 0;
        for (Nutriment p : nutriments){
            sub += p.getTotalFats();
        }
        return Double.parseDouble(df.format(sub));
    }

    public double getFiber(){
        double sub = 0;
        for (Nutriment p : nutriments){
            sub += p.getTotalFiber();
        }
        return Double.parseDouble(df.format(sub));
    }

    public String totalMealNutrientTable(){
        return "Name: " + name + "\n"
                + "Kcal: " + getKcal() + "\n"
                + "Proteins: " + getProteins() + "\n"
                + "Carbohydrates: " + getCarbohydrates() + "\n"
                + "Fats: " + getFats() + "\n"
                + "Fiber: " + getFiber();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meal meal = (Meal) o;
        return Objects.equals(id, meal.id);
    }

}
