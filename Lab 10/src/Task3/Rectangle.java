package Task3;

class Rectangle extends Shape implements Printable {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }
    public double area() {
        return height * width;
    }
    public void print() {
        System.out.println("This shape is rectangular");
    }


    }

