package P02PointInRectangle;

public class Rectangle {

    private final Point bottomLeft;
    private final Point topRight;

    public Rectangle(Point bottomLeft1, Point topRight1) {
        this.bottomLeft = bottomLeft1;
        this.topRight = topRight1;
    }

    public boolean contains(Point point){
        return point.getX() <= topRight.getX() && point.getX() >= bottomLeft.getX()
                && point.getY() <= topRight.getY() && point.getY() >= bottomLeft.getY();
    }
}
