This repository contains a Java class, Rectangle, designed to work with rectangles. The class provides methods to set the length and width of a rectangle, calculate its area, and calculate its perimeter. This readme provides an overview of the code and how to use it.

Table of Contents
Code Description
How to Use
Example Usage
Code Description
The Rectangle class is a simple Java class with the following attributes and methods:

Attributes
length: An integer to represent the length of the rectangle.
width: An integer to represent the width of the rectangle.
Methods
public Rectangle(): Constructor that initializes the length and width to default values of 1.

public void SetLength(int a): Method to set the length of the rectangle.

public void SetWidth(int b): Method to set the width of the rectangle.

public int getLength(): Method to get the current length of the rectangle.

public int getWidth(): Method to get the current width of the rectangle.

public void perimeter(): Method to calculate and print the perimeter of the rectangle. It checks if the length and width are within a valid range (greater than 0 and less than 20) before performing the calculation.

public void area(): Method to calculate and print the area of the rectangle. It also checks if the length and width are within a valid range before performing the calculation.

How to Use
To use the Rectangle class in your Java application, follow these steps:

Clone or download this repository to your local machine.

Include the Rectangle.java file in your Java project.

Create an instance of the Rectangle class and use its methods to set the dimensions, calculate the area, and calculate the perimeter of a rectangle.

Example Usage
Here's an example of how to use the Rectangle class in your Java application:
public class TestRectangle {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.SetLength(12);
        r1.SetWidth(7);
        r1.area();
        r1.perimeter();
    }
}
This code creates a Rectangle object, sets its length and width, and then calculates and prints the area and perimeter of the rectangle.

Please note that the provided Rectangle class includes input validation for length and width, ensuring that they are within a valid range. If the input values are not within the specified range, it will print a message asking for the correct input.
