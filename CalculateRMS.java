public class CalculateRMS {
    public static double calculateRMS(double[] actual, double[] predicted) {
        double sum = 0.0;
        for (int i = 0; i < actual.length; i++) {
            sum += Math.pow(actual[i] - predicted[i], 2);
        }
        return Math.sqrt(sum / actual.length);
    }

    public static void main(String[] args) {
        double[] actual = {89, 72, 94, 88, 99};
        double[] predicted = {85, 75, 90, 87, 95}; // Contoh prediksi

        double rms = calculateRMS(actual, predicted);
        System.out.println("RMS Error: " + rms);
    }
}
