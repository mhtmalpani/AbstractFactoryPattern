package Factory;

import FactoryColor.*;
import FactoryShape.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String colorType) {

        if (colorType == null) {
            return null;
        }

        if (colorType.equalsIgnoreCase(Red.class.getSimpleName())) {
            return new Red();

        } else if (colorType.equalsIgnoreCase(Green.class.getSimpleName())) {
            return new Green();

        } else if (colorType.equalsIgnoreCase(Blue.class.getSimpleName())) {
            return new Blue();
        }

        return null;
    }
}
