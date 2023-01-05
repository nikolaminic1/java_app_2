package furniture_elements.library.parts.planar;

import furniture_elements.library.materials.edgebanding.Edgeband;
import furniture_elements.library.materials.wooden_materials.UniverMaterialInstance;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;

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
    private Edgeband width1;
    private Edgeband length1;
    private Edgeband width2;
    private Edgeband length2;
    private Hole[] holes;
    private String nameOfBoard;
    private String description;
    private Image qrCode;

    private double getArea() {
        double area;
        area = (width * length) / 1000000;
        return area;
    }

    private double getPriceBoard() {
        return getArea() * material.getMaterialPrice();
    }

    private double getEdgebandPrice() {
        double width1Price = width * width1.getPrice();
        double length1Price = length * length1.getPrice();
        double width2Price = width * width2.getPrice();
        double length2Price = length * length2.getPrice();
        return (width1Price + length1Price + width2Price + length2Price) / 1000;
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

    public PlainBoardInstance(boolean width1_param, boolean length1_param, boolean width2_param, boolean length2_param) {
        this.holes = new Hole[0];
        material = new UniverMaterialInstance();
        width1 = new Edgeband(width1_param);
        length1 = new Edgeband(length1_param);
        width2 = new Edgeband(width2_param);
        length2 = new Edgeband(length2_param);
    }
}
