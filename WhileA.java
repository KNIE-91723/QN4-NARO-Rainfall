public class WhileA {
    // Iterates exactly 30 times
    public static void main(String[] args) {
        double[] monthlyRainfall = new double[30];
        int day = 0;
        while (day < 30) {
            monthlyRainfall[day] = getSensorReading(); // Records daily rainfall
            day++;
        }
    }

    private static double getSensorReading() {
        // Placeholder for actual sensor input
        return 0.0;
    }
}

