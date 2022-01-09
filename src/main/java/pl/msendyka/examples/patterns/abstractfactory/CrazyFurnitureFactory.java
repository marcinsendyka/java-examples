package pl.msendyka.examples.patterns.abstractfactory;

public class CrazyFurnitureFactory implements FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return () -> System.out.println("WOW");
    }

    @Override
    public Sofa createSofa() {
        return () -> true;
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return () -> 999;
    }
}
