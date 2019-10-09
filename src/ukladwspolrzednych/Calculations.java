package ukladwspolrzednych;

class Calculations {
    double lineSegmentLength(LineSegment lineSegment) {
        double d = Math.sqrt(Math.pow(lineSegment.point1.getX() - lineSegment.point2.getX(), 2) + Math.pow(lineSegment.point1.getY() - lineSegment.point2.getY(), 2));
        return d;
    }

    private boolean areTriangleSidesCorrect(Point point1, Point point2, Point point3) {
        LineSegment lineSegment1 = new LineSegment(point1, point2);
        LineSegment lineSegment2 = new LineSegment(point1, point3);
        LineSegment lineSegment3 = new LineSegment(point2, point3);

        boolean areCorrect = (lineSegment1.length() + lineSegment2.length() > lineSegment3.length() &&
                lineSegment1.length() + lineSegment3.length() > lineSegment2.length() &&
                lineSegment2.length() + lineSegment3.length() > lineSegment1.length());

        return areCorrect;
    }

    String getTriangleInfo(Point point1, Point point2, Point point3) {
        if (areTriangleSidesCorrect(point1, point2, point3)) {
            return ("Z punktów: (" + point1.getX() + "," + point1.getY() + "), (" + point2.getX() + "," + point2.getY() + "), (" + point3.getX() + "," + point3.getY() + ") można utwożyć trójkąt.");
        } else {
            return ("Z punktów: (" + point1.getX() + "," + point1.getY() + "), (" + point2.getX() + "," + point2.getY() + "), (" + point3.getX() + "," + point3.getY() + ") nie można utwożyć trójkąta.");
        }
    }
}