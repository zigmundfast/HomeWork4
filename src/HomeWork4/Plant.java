package HomeWork4;

public abstract class Plant {
    private String smell;

    private String flowering;

    public Plant(String smell, String flowering) {
        this.smell = smell;
        this.flowering = flowering;
    }

    public Plant() {
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public String getFlowering() {
        return flowering;
    }

    public void setFlowering(String flowering) {
        this.flowering = flowering;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "smell='" + smell + '\'' +
                ", flowering='" + flowering + '\'' +
                '}';
    }

}
