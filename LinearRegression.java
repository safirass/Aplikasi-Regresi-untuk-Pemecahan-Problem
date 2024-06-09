
public class LinearRegression {
    public static void main(String[] args) {
        double[] x = {10, 20, 30, 40, 50};
        double[] y = {89, 72, 94, 88, 99};

        int n = x.length;
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;

        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumX2 += x[i] * x[i];
        }

        double slope = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        double intercept = (sumY - slope * sumX) / n;

        System.out.println("Slope: " + slope);
        System.out.println("Intercept: " + intercept);

        // Predict a value
        double predictX = 60;
        double predictY = slope * predictX + intercept;
        System.out.println("Predicted value at x=60: " + predictY);
    }
}
