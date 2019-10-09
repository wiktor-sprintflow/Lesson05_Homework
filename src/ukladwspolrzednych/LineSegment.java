package ukladwspolrzednych;

class LineSegment {
    Point point1;
    Point point2;

    LineSegment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    double length() {
        double d = Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2));
        return d;
    }
}