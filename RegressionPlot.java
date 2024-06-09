import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import javax.swing.*;

public class RegressionPlot {
    private static XYDataset createDataset() {
        XYSeries series = new XYSeries("Data");
        series.add(10, 89);
        series.add(20, 72);
        series.add(30, 94);
        series.add(40, 88);
        series.add(50, 99);

        XYSeries series2 = new XYSeries("Linear Regression");
        series2.add(10, 80); // Sesuaikan dengan hasil regresi
        series2.add(20, 75);
        series2.add(30, 90);
        series2.add(40, 85);
        series2.add(50, 95);

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        dataset.addSeries(series2);
        return dataset;
    }

    private static JFreeChart createChart(XYDataset dataset) {
        return ChartFactory.createScatterPlot(
                "Regression Example",
                "X-Axis",
                "Y-Axis",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
    }

    public static void main(String[] args) {
        XYDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new ChartPanel(chart));
        frame.pack();
        frame.setVisible(true);
    }
}
