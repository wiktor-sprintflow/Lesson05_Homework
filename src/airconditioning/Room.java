package airconditioning;

class Room {
    private double area;
    private double currentTemp;
    private boolean hasWorkingAirCondition;
    private final double temperatureLimit = 15.5;
    private double airConditionPower;

    Room(double area, double currentTemp, boolean hasWorkingAirCondition, double airConditionPower) {
        this(currentTemp, hasWorkingAirCondition);
        this.area = area;
        this.airConditionPower = airConditionPower;
    }

    Room(double currentTemp, boolean hasWorkingAirCondition) {
        this.currentTemp = currentTemp;
        this.hasWorkingAirCondition = hasWorkingAirCondition;
    }

    private boolean decreaseTemp() {
        if (hasWorkingAirCondition && currentTemp > temperatureLimit) {
            if (airConditionPower > 0 && area > 0) {
                double coolingFactor = airConditionPower / area;
                if (coolingFactor >= 100) {
                    currentTemp--;
                } else if (coolingFactor >= 50 && coolingFactor < 100) {
                    currentTemp -= 0.5;
                } else {
                    currentTemp -= 0.2;
                }

            } else {
                currentTemp--;
            }
            if (currentTemp < temperatureLimit) {
                currentTemp = temperatureLimit;
            }
            return true;
        } else {
            return false;
        }
    }

    String decreaseTempAndGetDetails() {
        return ("Aktualna temperatura to: " + currentTemp + " \u2103. Udało się o obniżyć temperaturę: (" + decreaseTemp() + "). Aktualna temperatura to: " + currentTemp + " \u2103.");
    }
}
