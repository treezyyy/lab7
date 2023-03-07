public class Calculate {
    double x, a, b;

    Calculate(double x, double a, double b){
        this.x = x;
        this.a = a;
        this.b = b;
    }

    Calculate(double[] array) {
        this.x = array[0]; // вытаскивание из массива элементов введёнов по очереди
        this.a = array[1];
        this.b = array[2];
    }

    double factorial(double n) {
        if (n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }
    public double calculate1() {
        return 3 * this.x +  5;
    }
    public double calculate2() {
        if(a-b!=0)
            return (a + b) / (a - b);
        else
            return -1;
    }
    public double calculate3() {
        if(b!=0) {
            double temp = (a * x) / b;
            if(temp%1==0)
                return factorial(temp);
            else
                return -1;
        }
        else
            return -1;
    }
}
