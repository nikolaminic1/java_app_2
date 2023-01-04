package furniture_elements.library.parts.planar;

import furniture_elements.library.materials.edgebanding.Edgeband;
import furniture_elements.library.materials.wooden_materials.UniverMaterialInstance;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

    public PlainBoardInstance(boolean top, boolean bottom, boolean left, boolean right) {
        this.holes = new Hole[0];
        material = new UniverMaterialInstance();
        edge1 = new Edgeband(top);
        edge2 = new Edgeband(bottom);
        edge3 = new Edgeband(left);
        edge4 = new Edgeband(right);
    }
}
