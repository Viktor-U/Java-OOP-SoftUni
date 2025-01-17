package P02Shapes;

public abstract class Shape {

    private Double perimeter;
    private Double area;

    protected abstract Double calculatePerimeter();
    protected abstract Double calculateArea();

    public Double getPerimeter() {
        return perimeter;
    }

    public Double getArea() {
        return area;
    }

    protected void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    protected void setArea(Double area) {
        this.area = area;
    }
}
