package P02Shapes;

public class Rectangle extends Shape{
    private final Double height;
    private final Double width;

    public final Double getHeight() {
        return height;
    }

    public final Double getWidth() {
        return width;
    }

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    protected Double calculatePerimeter() {
        setPerimeter((height + width) * 2 );
        return (height + width) * 2;
    }

    @Override
    protected Double calculateArea() {
        setArea(height * width);
        return height * width;
    }
}
