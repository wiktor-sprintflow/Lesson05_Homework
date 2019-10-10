package coordniates;

class Point {
    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    private boolean isInFirstQuarter() {
        return (x > 0 && y > 0);
    }

    private boolean isInSecondQuarter() {
        return (x < 0 && y > 0);
    }

    private boolean isInThirdQuarter() {
        return (x < 0 && y < 0);
    }

    private boolean isInFourthQuarter() {
        return (x > 0 && y < 0);
    }

    private boolean isOnXAxis() {
        return (x != 0 && y == 0);
    }

    private boolean isOnYAxis() {
        return (x == 0 && y != 0);
    }

    private boolean isInMiddle() {
        return (x == 0 && y == 0);
    }

    String getPointDetails() {
        return ("Punkt (" + x + "," + y +") - 1 ćwiartka (" + isInFirstQuarter() + "), 2 ćwiartka (" + isInSecondQuarter() +
                "), 3 ćwiartka (" + isInThirdQuarter() + "), 4 ćwiartka (" + isInFourthQuarter() +
                "), oś X (" + isOnXAxis() + "), oś Y (" + isOnYAxis() + "), środek układu (" + isInMiddle() + ")");
    }
}