public abstract class Nutriment extends Grocery {

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
        this.weight = weight;
        this.kcal = kcal;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.fiber = fiber;
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
        return 0.0;
    }

    public Double getTotalFats(){
        return 0.0;
    }

    public Double getTotalFiber(){
        return 0.0;
    }

    public Double getTotalCarbohydrates(){
        return 0.0;
    }

    public Double getTotalKcal(){
        return 0.0;
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
                + "Fiber: " + fiber + "%";
    }

    public String totalNutrientTable(){
        return null;
    }


}
