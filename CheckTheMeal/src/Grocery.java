import java.util.Objects;

public abstract class Grocery implements Energy {

    private String company;
    private String name;

    public Grocery(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getCompany(){
        return company;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grocery grocery = (Grocery) o;
        return Objects.equals(company, grocery.company) && Objects.equals(name, grocery.name);
    }

}
