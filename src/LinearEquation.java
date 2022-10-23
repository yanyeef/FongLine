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
        return roundedToHundredth(d);
    }

    public double yIntercept() {
        double m = slope();
        double yInt = y1 - (m*x1);
        double yInt2 = y2 - (m*x2) ;
//        if (yInt2 == yInt){
//            return roundedToHundredth(yInt);
//        }
            return roundedToHundredth(yInt);
    }

    public double slope(){
        double y = y2 - y1;
        double x = x2 - x1;
        double s = y/x;
        return s;
    }

    public String equation() {
        int yNew;
        int xNew;
        String sl;
        int y = y2 - y1;
        int x = x2 - x1;
        if (x < 0 && y <0) {
            yNew = Math.abs(y);
            xNew = Math.abs(x);
            sl = yNew + "/" + xNew;
        } else if ( x < 0 ) {
            yNew = y - 2*y;
            xNew = Math.abs(x);
            sl = yNew + "/" + xNew;
        }  else if(y % x == 0) {
            sl = y/x + "";
        }else {
            yNew = y;
            xNew= x;
            sl = yNew + "/" + xNew;
        }

        if(yIntercept() <0) {
            return "y = " + sl + "x -" + Math.abs(yIntercept()) ;
        }

        return "y = " + sl + "x +" + yIntercept() + "" ;


    }

    public double roundedToHundredth(double num) {
        double x = (double)Math.round(num*100)/100;
        return x;
    }
    public String lineInfo() {
        return "The two points are (" + x1 +", " + y1+")" + " and (" + x2+", " + y2+")" +
                "\nThe equation of the line between these points is:" + equation()
                + "\nThe slope of the line is: " + slope()
                + "\nThe y-intercept of the line is:" + yIntercept()
                + "\n The distance between the two points is:" + distance();
    }




}
