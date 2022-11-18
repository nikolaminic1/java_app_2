package furniture_elements.library.parts.planar;

public class Hole {
    private double xPosition;
    private double yPosition;
    private double depth;
    private double diameter;
    private double priceOfDrilling;
    private String description;
    private String typeOfHole;

    public Hole(double depth, double diameter) {
        this.depth = depth;
        this.diameter = diameter;
    }

    public double getxPosition() {
        return xPosition;
    }

    public void setxPosition(double xPosition) {
        this.xPosition = xPosition;
    }

    public double getyPosition() {
        return yPosition;
    }

    public void setyPosition(double yPosition) {
        this.yPosition = yPosition;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setPriceOfDrilling(double priceOfDrilling) {
        this.priceOfDrilling = priceOfDrilling;
    }

    double getPriceOfDrilling() {
        return priceOfDrilling;
    }
}
