package com.app.shapes;

public class Circle
{
    Background background;
    private double radius;

    public Circle(double _radius)
    {
        radius = _radius;
        background = new Background("green", 1.27f);
    }

    public double getRadius()
    {
        return radius;
    }

    public String getColor()
    {
        return background.colour;
    }

    void enlarge(double scale)
    {
        radius *= scale;
    }

    public void draw()
    {
        System.out.println(String.format("Drawing the circle with %f radius in colour %s", radius, background));
    }

}
