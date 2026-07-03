public class ForA {
    public static void main(String[] args) {
        double[] monthlyRainfall = new double[30];
        for (int day = 0; day < 30; day++) {
            monthlyRainfall[day] = getSensorReading(); // Records daily rainfall
        }
    }

    private static double getSensorReading() {
        // Placeholder for actual sensor input
        return 0.0;
    }
}

