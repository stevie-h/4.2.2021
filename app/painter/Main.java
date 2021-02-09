package com.app.painter;

// HW https://github.com/qa191120/04.02.2021/blob/main/hw.txt

import com.app.shapes.Circle;
import com.app.shapes.ShapesEnlarger;

public class Main
{

    public static void main(String[] args)
    {
        Circle circ1 = new Circle(4.5);
        circ1.draw();
        ShapesEnlarger.enlargeCircle(circ1);
        circ1.draw();
    }
}
