package Main;

import figure.Figure;

public class Main {
    public static void main(String[] args) {
        Figure obj = new Figure("TBC");

        System.out.println(obj.getArea()); //არარსებული მნიშვნელობების ბეჭდვა
        System.out.println(obj.getP());    //არარსებული მნიშვნელობების ბეჭდვა
        Rectangle obj2 = new Rectangle(12,10);
        System.out.println(obj2.getArea());

        System.out.println(obj2 instanceof Figure);
        System.out.println(obj2 instanceof Rectangle);

        System.out.println(obj instanceof Figure);
        System.out.println(obj instanceof Rectangle);
        Rectangle obj3 = new Rectangle();
        System.out.println(obj3.getArea(5,3));   //გადატვირთვა
        System.out.println(obj3.getP(10,7));



    }
}
