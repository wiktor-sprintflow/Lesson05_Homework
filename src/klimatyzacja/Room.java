package klimatyzacja;

class Room {
    private double area;
    private double currentTemp;
    private boolean hasAirCondition;
    private final double temperatureLimit = 15.5;
    private double airConditionPower;

    Room(double area, double currentTemp, boolean hasAirCondition) {
        this.area = area;
        this.currentTemp = currentTemp;
        this.hasAirCondition = hasAirCondition;
    }

    Room(double area, double currentTemp, boolean hasAirCondition, double airConditionPower) {
        this(area, currentTemp, hasAirCondition);
        this.airConditionPower = airConditionPower;
    }

    private boolean decreaseTemp() {
        if (hasAirCondition && airConditionPower > 0 && currentTemp > temperatureLimit) {
            double coolingFactor = airConditionPower / area;
            if (coolingFactor >= 100) {
                currentTemp--;
            } else if (coolingFactor >= 50 && coolingFactor < 100) {
                currentTemp -= 0.5;
            } else {
                currentTemp -= 0.2;
            }
            if (currentTemp < temperatureLimit) {
                currentTemp = temperatureLimit;
            }
            return true;
        } else {
            return false;
        }
    }

    String decreaseTempAndGetDetails(){
        return ("Aktualna temperatura to: " + currentTemp + " \u2103. Udało się o obniżyć temperaturę: (" + decreaseTemp() + "). Aktualna temperatura to: " + currentTemp + " \u2103.");
    }
}
