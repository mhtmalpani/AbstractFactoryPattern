package Factory;

import FactoryColor.Color;
import FactoryShape.*;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {

        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase(Circle.class.getSimpleName())) {
            return new Circle();

        } else if (shapeType.equalsIgnoreCase(Rectangle.class.getSimpleName())) {
            return new Rectangle();

        } else if (shapeType.equalsIgnoreCase(Square.class.getSimpleName())) {
            return new Square();
        }

        return null;
    }

    @Override
    public Color getColor(String colorType) {
        return null;
    }
}
