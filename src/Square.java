public class Square {
    private final Double length;

    public Square(Double length) {
        this.length = length;
    }


    public Double countArea() {
        return Math.pow(length, 2);
    }

    public Double countPerimeter() {
        return length*4;
    }
}
