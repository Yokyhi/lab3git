//8. y=x^2 + cos(x) * ln(2x)
public class Function {

    private static int x;

    public Function(int x){
        this.x = x;
    }

    public static double func(){
        //8. y=x^2 + cos(x) * ln(2x)
        double y;
        y = x * x + Math.cos(x) * Math.log(2 * x);
        return y;
    }

    public static double getX() {
        return x;
    }
}