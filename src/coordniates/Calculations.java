package coordniates;

class Calculations {
    private double lineSegmentLength(LineSegment lineSegment) {
        double d = Math.sqrt(Math.pow(lineSegment.getPoint1().getX() - lineSegment.getPoint2().getX(), 2) + Math.pow(lineSegment.getPoint1().getY() - lineSegment.getPoint2().getY(), 2));
        return d;
    }

    private boolean areTriangleSidesCorrect(Point point1, Point point2, Point point3) {
        LineSegment lineSegment1 = new LineSegment(point1, point2);
        LineSegment lineSegment2 = new LineSegment(point1, point3);
        LineSegment lineSegment3 = new LineSegment(point2, point3);

        boolean areCorrect = (this.lineSegmentLength(lineSegment1) + this.lineSegmentLength(lineSegment2) > this.lineSegmentLength(lineSegment3) &&
                this.lineSegmentLength(lineSegment1) + this.lineSegmentLength(lineSegment3) > this.lineSegmentLength(lineSegment2) &&
                this.lineSegmentLength(lineSegment2) + this.lineSegmentLength(lineSegment3) > this.lineSegmentLength(lineSegment1));

        return areCorrect;
    }

    String getLineSegmentLength(LineSegment lineSegment) {
        return ("Długość odcinka między punktami: (" + lineSegment.getPoint1().getX() + "," + lineSegment.getPoint1().getY() + ") oraz (" +
                lineSegment.getPoint2().getX() + "," + lineSegment.getPoint2().getY() + ") wynosi: " + this.lineSegmentLength(lineSegment));
    }

    String getTriangleInfo(Point point1, Point point2, Point point3) {
        if (areTriangleSidesCorrect(point1, point2, point3)) {
            return ("Z punktów: (" + point1.getX() + "," + point1.getY() + "), (" + point2.getX() + "," + point2.getY() + "), (" +
                    point3.getX() + "," + point3.getY() + ") można utwożyć trójkąt.");
        } else {
            return ("Z punktów: (" + point1.getX() + "," + point1.getY() + "), (" + point2.getX() + "," + point2.getY() + "), (" +
                    point3.getX() + "," + point3.getY() + ") nie można utwożyć trójkąta.");
        }
    }
}