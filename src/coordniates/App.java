package coordniates;

public class App {
    public static void main(String[] args) {
        Point point1 = new Point(-1, 2);
        Point point2 = new Point(5, -2);
        Point point3 = new Point(-1, -2);

        System.out.println(point1.getPointDetails());
        System.out.println(point2.getPointDetails());
        System.out.println(point3.getPointDetails());
        System.out.println();

        LineSegment lineSegment1 = new LineSegment(point1, point2);
        LineSegment lineSegment2 = new LineSegment(point2, point3);
        LineSegment lineSegment3 = new LineSegment(point1, point3);

        System.out.println(lineSegment1.getLineSegmentLength());
        System.out.println(lineSegment2.getLineSegmentLength());
        System.out.println(lineSegment3.getLineSegmentLength());
        System.out.println();

        Calculations calculations = new Calculations();
        System.out.println(calculations.getLineSegmentLength(lineSegment1));
        System.out.println(calculations.getLineSegmentLength(lineSegment2));
        System.out.println(calculations.getLineSegmentLength(lineSegment3));

        System.out.println();

        System.out.println(calculations.getTriangleInfo(point1, point2, point3));

    }
}