package Main;

import figure.Figure;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public int getP(){         // შვილობილ კლასსში მოვახდინე გადაფარვა მშობლის
        return (length+width)*2;
    }
    public int getArea() {               // შვილობილ კლასსში მოვახდინე გადაფარვა მშობლის
        return length*width;
    }
    public Rectangle(){
        this(3,4);
    }
    protected int getP(int length, int width){     //მოვახდინე გადატვირთვა
        return (length+width)*2;

    }
    protected int getArea(int length, int width) {               //მოვახდინე გადატვირთვა
        return length * width;
    }
}