package pl.msendyka.examples.patterns.abstractfactory;

public class RunMe {

    public static void main(String[] args) {
        FurnitureAbstractFactory factory = getFactory();
        factory.createChair().sit();
        System.out.println(factory.createCoffeeTable().legs());
        System.out.println(factory.createSofa().canSleepOn());
    }

    private static FurnitureAbstractFactory getFactory() {
        //if different implementation is returned, main program will use different family of products
        return new DefaultFurnitureFactory();
    }
}
