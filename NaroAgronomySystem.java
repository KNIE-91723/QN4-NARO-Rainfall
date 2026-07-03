import java.util.Random;

public class NaroAgronomySystem {

    public static void main(String[] args) {
        double[] rainfallData = new double[30];
        Random random = new Random();

        
        for (int i = 0; i < rainfallData.length; i++) {
          
            rainfallData[i] = random.nextDouble() * 60.0;
        }

        // (ii) Compute total and average monthly rainfall
        double totalRainfall = 0;
        int wetDaysCount = 0;

        for (double dailyReading : rainfallData) {
            totalRainfall += dailyReading;
            
            // (iii) Count "wet days" (rainfall greater than 30 mm)
            if (dailyReading > 30.0) {
                wetDaysCount++;
            }
        }
        
        double averageRainfall = totalRainfall / rainfallData.length;

      
        System.out.println(" NARO NAMULONGE AGRONOMY REPORT");
        System.out.printf("Total Monthly Rainfall:   %.2f mm\n", totalRainfall);
        System.out.printf("Average Daily Rainfall: %.2f mm\n", averageRainfall);
        System.out.println("Number of 'Wet Days':     " + wetDaysCount + " days");
        System.out.print("Seasonal Classification:  ");

      
        if (totalRainfall <= 300.0) {
            System.out.println("Dry (Warning: Watch out for dry spells!)");
        } else if (totalRainfall < 600.0) {
            System.out.println("Normal (Optimal conditions for maize cultivation)");
        } else {
            System.out.println("Flood-risk (Danger: High risk of farm field flooding!)");
        }
        System.out.println(" ");
    }
}