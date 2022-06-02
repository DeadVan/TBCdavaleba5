package figure;

public class Figure {
    public Figure(){

    }
    public int getP(){
        return 20;
    }
    public int getArea() {
        return 25;
    }
    public final static void misalmeba() {  // final მივანიჭე რომ გადაფარვა არ შეიძლებოდეს
        System.out.println("gamarjoba");
    }
    public Figure(String x){
        System.out.println("Hello " + x);
    }


}
