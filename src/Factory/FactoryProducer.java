package Factory;

import FactoryColor.Color;
import FactoryShape.Shape;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryType) {

        if (factoryType.equalsIgnoreCase(Shape.class.getSimpleName())) {
            return new ShapeFactory();

        } else if (factoryType.equalsIgnoreCase(Color.class.getSimpleName())) {
            return new ColorFactory();
        }

        return null;
    }
}
