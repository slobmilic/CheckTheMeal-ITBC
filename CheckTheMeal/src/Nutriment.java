import java.text.DecimalFormat;

public abstract class Nutriment extends Grocery {
    private static DecimalFormat df = new DecimalFormat("0.00");

    private Double weight;
    private Double kcal;
    private Double proteins;
    private Double carbohydrates;
    private Double fats;
    private Double fiber;

    public Nutriment(String company, String name, Double weight, Double kcal, Double proteins, Double carbohydrates, Double fats, Double fiber) {
        super(name, company);
        this.weight = weight;
        this.kcal = kcal;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.fiber = fiber;
    }

    public void setAll(Double weight, Double kcal, Double proteins, Double carbohydrates, Double fats, Double fiber) {

        if (weight != null)
        this.weight = weight;
        if (kcal != null)
        this.kcal = kcal;
        if (proteins != null)
        this.proteins = proteins;
        if (carbohydrates != null)
        this.carbohydrates = carbohydrates;
        if (fats != null)
        this.fats = fats;
        if (fiber != null)
        this.fiber = fiber;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getProteins() {
        return proteins;
    }

    public Double getCarbohydrates() {
        return carbohydrates;
    }

    public Double getFats() {
        return fats;
    }

    public Double getFiber() {
        return fiber;
    }

    @Override
    public double getKcal() {
        return kcal;
    }

    public Double getTotalProteins(){
        return Double.valueOf(df.format(weight / 100 * proteins));
    }

    public Double getTotalFats(){
        return Double.valueOf(df.format(weight / 100 * fats));
    }

    public Double getTotalFiber(){
        return Double.valueOf(df.format(weight / 100 * fiber));
    }

    public Double getTotalCarbohydrates(){
        return Double.valueOf(df.format(weight / 100 * carbohydrates));
    }

    public Double getTotalKcal(){
        return Double.valueOf(df.format(weight / 100.00 * kcal));
    }

    @Override
    public String toString() {
        return "Company: " + super.getCompany() + "\n"
                + "Name: " + super.getName() + "\n"
                + "Weight : 100g\n"
                + "Kcal: " + kcal + "\n"
                + "Proteins: " + proteins + "%" + "\n"
                + "Carbohydrates: " + carbohydrates + "%" + "\n"
                + "Fats: " + fats + "%" + "\n"
                + "Fiber: " + fiber + "%" + "\n";
    }

    public String totalNutrientTable(){
        return "Company: " + super.getCompany() + "\n"
                + "Name: " + super.getName() + "\n"
                + "Weight : " + weight + "\n"
                + "Kcal: " + getTotalKcal() + "\n"
                + "Proteins: " + getTotalProteins() + "\n"
                + "Carbohydrates: " + getTotalCarbohydrates() + "\n"
                + "Fats: " + getTotalFats() + "\n"
                + "Fiber: " + getTotalFiber();
    }


}
