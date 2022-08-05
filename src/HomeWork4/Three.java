package HomeWork4;

public abstract class Three {
    public String cone;

    public String smell;

    public Three(String cone, String smell) {
        this.cone = cone;
        this.smell = smell;
    }

    public Three() {
    }

    public String getCone() {
        return cone;
    }

    public void setCone(String cone) {
        this.cone = cone;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    @Override
    public String toString() {
        return "Three{" +
                "cone='" + cone + '\'' +
                ", smell='" + smell + '\'' +
                '}';
    }
}
