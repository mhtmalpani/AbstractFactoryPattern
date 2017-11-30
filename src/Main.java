import Factory.AbstractFactory;
import Factory.FactoryProducer;
import FactoryColor.Color;
import FactoryShape.Shape;

public class Main {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");

        if (shapeFactory != null) {
            Shape circle = shapeFactory.getShape("Circle");

            circle.draw();

            Shape rectangle = shapeFactory.getShape("Rectangle");

            rectangle.draw();

            Shape square = shapeFactory.getShape("Square");

            square.draw();
        }


        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");

        if (colorFactory != null) {

            Color red = colorFactory.getColor("Red");

            red.paint();

            Color green = colorFactory.getColor("Green");

            green.paint();

            Color blue = colorFactory.getColor("Blue");

            blue.paint();
        }
    }
}
