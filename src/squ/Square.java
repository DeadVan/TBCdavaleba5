package squ;

import Main.Rectangle;

public final class Square extends Rectangle {
    private int length;

    public void setLength(int length) {
        this.length = length;
    }

    public int getP() {
        return getP(length, length);
    }

    public int getArea() {
        return getArea(length,length);
    }

}

