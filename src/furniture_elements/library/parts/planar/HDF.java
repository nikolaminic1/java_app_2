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
public class HDF {
    private double width;
    private double height;
    private double thickness;
    private double price;
    private UniverMaterialInstance material;
    private String nameOfBoard;
    private String description;
    private Image qrCode;

    private double getArea() {
        double area;
        area = (width * height) / 1000000;
        return area;
    }

    public double getTotalPrice() {
        return getArea() * material.getMaterialPrice();
    }
}