package coordniates;

class LineSegment {
    private Point point1;
    private Point point2;

    LineSegment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    Point getPoint1() {
        return point1;
    }

    Point getPoint2() {
        return point2;
    }

    private double length() {
        double d = Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2));
        return d;
    }

    String getLineSegmentLength(){
        return ("Długość odcinka między punktami: (" + point1.getX() + "," + point1.getY() +") oraz (" + point2.getX() + "," + point2.getY() + ") wynosi: " + length());
    }
}