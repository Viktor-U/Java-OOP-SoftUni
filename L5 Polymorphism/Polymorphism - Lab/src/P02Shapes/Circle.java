package P02Shapes;

public class Circle extends Shape{
    private final Double radius;

    public final Double getRadius() {
        return radius;
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    protected Double calculatePerimeter() {
        setPerimeter(radius * Math.PI * 2);
        return radius * Math.PI * 2 ;
    }

    @Override
    protected Double calculateArea() {
        setPerimeter(radius * Math.PI * radius);
        return radius * Math.PI * radius;
    }
}
