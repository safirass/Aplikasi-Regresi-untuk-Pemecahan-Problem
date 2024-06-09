public class ExponentialRegression {
    public static void main(String[] args) {
        double[] x = {10, 20, 30, 40, 50};
        double[] y = {89, 72, 94, 88, 99};

        int n = x.length;
        double sumX = 0, sumLogY = 0, sumXLogY = 0, sumX2 = 0;

        for (int i = 0; i < n; i++) {
            double logY = Math.log(y[i]);
            sumX += x[i];
            sumLogY += logY;
            sumXLogY += x[i] * logY;
            sumX2 += x[i] * x[i];
        }

        double slope = (n * sumXLogY - sumX * sumLogY) / (n * sumX2 - sumX * sumX);
        double intercept = (sumLogY - slope * sumX) / n;

        System.out.println("Slope: " + slope);
        System.out.println("Intercept: " + intercept);

        // Predict a value
        double predictX = 60;
        double logY = intercept + slope * predictX;
        double predictY = Math.exp(logY);
        System.out.println("Predicted value at x=60: " + predictY);
    }
}
