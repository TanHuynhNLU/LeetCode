package medium;

public class GenerateRandomPointInACircle478 {
    private double x_center;
    private double y_center;
    private double radius;

    public GenerateRandomPointInACircle478(double radius, double x_center, double y_center) {
        this.radius = radius;
        this.x_center = x_center;
        this.y_center = y_center;
    }

    public double[] randPoint() {
        while (true) {
            double x = Math.random() * 2 * this.radius - this.radius;
            double y = Math.random() * 2 * this.radius - this.radius;
            if (x * x + y * y <= this.radius * this.radius) {
                return new double[]{x_center + x, y_center + y};
            }

        }
    }

    //Best Solution
//    public double[] randPoint() {
//        double theta =  2 * PI * Math.random();
//        double length = Math.sqrt(Math.random())* radius;
//        double []res = new double[2];
//        double x = x_center + length*Math.cos(theta);
//        double y = y_center + length*Math.sin(theta);
//        res[0]=x;
//        res[1]=y;
//        return res;
//    }
}
