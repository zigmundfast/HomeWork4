package HomeWork4;

public class Roses extends  Plant implements smellInteface{
    public Roses(String smell, String flowering) {
        super(smell, flowering);

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getSmell() {
        return super.getSmell();
    }

    @Override
    public String getFlowering() {
        return super.getFlowering();
    }
}
