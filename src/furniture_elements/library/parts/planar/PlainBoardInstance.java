package furniture_elements.library.parts.planar;

import furniture_elements.library.materials.edgebanding.Edgeband;
import furniture_elements.library.materials.wooden_materials.UniverMaterialInstance;

public class PlainBoardInstance {
    private double width;
    private double length;
    private double thickness;
    private double price;
    private UniverMaterialInstance material;
    private Edgeband edge1;
    private Edgeband edge2;
    private Edgeband edge3;
    private Edgeband edge4;
    private Hole[] holes;
    private String nameOfBoard;
    private String description;

//    public Hole[] getHoles() {
//        return holes;
//    }
//
//    public void setHoles(Hole[] holes) {
//        this.holes = holes;
//    }

    public void setPrice(double price) {
    }

    public Edgeband getEdge1() {
        return edge1;
    }

    public Edgeband getEdge2() {
        return edge2;
    }

    public Edgeband getEdge3() {
        return edge3;
    }

    public Edgeband getEdge4() {
        return edge4;
    }

    public void setEdge1(Edgeband edge1) {
        this.edge1 = edge1;
    }

    public void setEdge2(Edgeband edge2) {
        this.edge2 = edge2;
    }

    public void setEdge3(Edgeband edge3) {
        this.edge3 = edge3;
    }

    public void setEdge4(Edgeband edge4) {
        this.edge4 = edge4;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width/1000;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length/1000;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public UniverMaterialInstance getMaterial() {
        return material;
    }

    public void setMaterial(UniverMaterialInstance material) {
        this.material = material;
    }

    private double getArea() {
        double area;
        area = width * length;
        return area;
    }

    private double getPriceBoard() {
        return getArea() * material.getMaterialPrice();
    }

    private double getEdgebandPrice() {
        double edge1Price = width * edge1.getPrice();
        double edge2Price = length * edge2.getPrice();
        double edge3Price = width * edge3.getPrice();
        double edge4Price = length * edge4.getPrice();

        return edge1Price + edge2Price + edge3Price + edge4Price;
    }

    private double getHolePrice() {
        double totalHolePrice = 0;
        for (Hole hole : holes) {
            totalHolePrice = totalHolePrice + hole.getPriceOfDrilling();
        }
        return totalHolePrice;
    }

    public double getTotalPrice() {
        return getPriceBoard()
                + getEdgebandPrice()
                + getHolePrice();
    }

    public PlainBoardInstance() {
        this.holes = new Hole[0];
        material = new UniverMaterialInstance();
        edge1 = new Edgeband(true);
        edge2 = new Edgeband(true);
        edge3 = new Edgeband(true);
        edge4 = new Edgeband(true);
    }
}
