package jd07_class_and_objects;

public class Rectangle {
      public double width;
      public double lenght;


public double rectangleArea(double width, double lenght) {
    return width * lenght;
  }

  public double rectanglePerimeter(double width, double lenght) {
      return lenght + lenght + width + width;
  }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", lenght=" + lenght +
                '}';
    }
}

/*
2. Create a custom class named Rectangle with the following attributes and actions:

      Attributes:
            width (double): used for storing the width of the rectangle.
            length (double): used for storing the length of the rectangle.

      Actions:
            calculateArea(): calculates the area of the rectangle, and returns it as a double.
            calculatePerimeter(): calculates the perimeter of the rectangle, and returns it.
            toString(): returns a string representation of the rectangle object.


      Create another class named RectangleClients, create multiple rectangle objects, and test each function of the rectangle object.
 */