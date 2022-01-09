package pl.msendyka.examples.patterns.abstractfactory;

public class DefaultFurnitureFactory implements FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return () -> System.out.println("Sit");
    }

    @Override
    public Sofa createSofa() {
        return () -> false;
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return () -> 4;
    }
}
