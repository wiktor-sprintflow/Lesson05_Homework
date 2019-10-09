package ukladwspolrzednych;

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

        System.out.println("Długość odcinka 1 to: " + lineSegment1.length());
        System.out.println("Długość odcinka 2 to: " + lineSegment2.length());
        System.out.println("Długość odcinka 3 to: " + lineSegment3.length());
        System.out.println();

        Calculations calculations = new Calculations();
        System.out.println("Długość odcinka 1 to: " + calculations.lineSegmentLength(lineSegment1));
        System.out.println("Długość odcinka 2 to: " + calculations.lineSegmentLength(lineSegment2));
        System.out.println("Długość odcinka 3 to: " + calculations.lineSegmentLength(lineSegment3));
        System.out.println();

        System.out.println(calculations.getTriangleInfo(point1, point2, point3));

    }
}