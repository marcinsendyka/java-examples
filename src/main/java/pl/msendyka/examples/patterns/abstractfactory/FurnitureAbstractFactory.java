package pl.msendyka.examples.patterns.abstractfactory;

public interface FurnitureAbstractFactory {

    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
