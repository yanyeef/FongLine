public class LinearEquation {

    //instance variable
    private int x1;
    private int y1;
    private int x2;
    private int y2;


    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double distance() {
        double twoXs = x2 - x1;
        double sqaX = Math.pow(twoXs, 2);
        double twoYs = y2 - y1;
        double sqaY = Math.pow(twoYs, 2);
        double sumBoth = sqaX + sqaY;
        double d = Math.sqrt(sumBoth);
        return d;
    }

    public double yIntercept() {


    }

    public double slope(){

    }

    public String equation() {

    }

    public double roundedToHundredth() {

    }
    public String lineInfo() {

    }
}
