public class TestCircle {
    private final Double radius;

    public TestCircle(Double radius) {
        this.radius = radius;
    }

    public Double countArea() {
        return Math.PI * Math.pow(radius,2);
    }

    public Double countPerimeter() {
        return Math.PI*2*radius;
    }
}
