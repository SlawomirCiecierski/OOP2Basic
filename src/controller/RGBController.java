package controller;

import model.RGB;

public class RGBController {
    public RGB setRGB(int r, int b, int g) {
        RGB color = new RGB(r, g, b);
        return color;
    }

    public RGB mixColor(RGB c1, RGB c2) {
        RGB cMixed = new RGB(c1.getR() + c2.getR() / 2, c1.getG() + c2.getG() / 2, c1.getB() + c2.getB() / 2);

        return cMixed;
    }

    public RGB clearColor(RGB c){
        c.setB(0);
        c.setG(0);
        c.setR(0);
        return c;
    }
}
