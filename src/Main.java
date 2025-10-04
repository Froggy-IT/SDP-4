abstract class BobaTea {
    protected Flavor flavor;
    public BobaTea(Flavor flavor) {
        this.flavor = flavor;
    }
    public abstract void serve();
}
class MilkTea extends BobaTea {
    public MilkTea(Flavor flavor) {
        super(flavor);
    }
    @Override
    public void serve() {
        System.out.println("Serving Milk Tea with " + flavor.addFlavor());
    }
}
class FruitTea extends BobaTea {
    public FruitTea(Flavor flavor) {
        super(flavor);
    }
    @Override
    public void serve() {
        System.out.println("Serving Fruit Tea with " + flavor.addFlavor());
    }
}
interface Flavor {
    String addFlavor();
}
class TaroFlavor implements Flavor {
    @Override
    public String addFlavor() {
        return "Taro flavor";
    }
}
class MangoFlavor implements Flavor {
    @Override
    public String addFlavor() {
        return "Mango flavor";
    }
}
class MatchaFlavor implements Flavor {
    @Override
    public String addFlavor() {
        return "Matcha flavor";
    }
}
public class Main {
    public static void main(String[] args) {
        BobaTea taroMilkTea = new MilkTea(new TaroFlavor());
        taroMilkTea.serve();
        BobaTea mangoFruitTea = new FruitTea(new MangoFlavor());
        mangoFruitTea.serve();
        BobaTea matchaMilkTea = new MilkTea(new MatchaFlavor());
        matchaMilkTea.serve();
    }
}
