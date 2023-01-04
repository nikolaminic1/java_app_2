package furniture_elements.library.elements.WardrobeDoor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mirror {
    public double width;
    public double height;
    public double thickness;
    public double price;

    public Mirror(double width, double height, double thickness, double price) {
        this.width = width;
        this.height = height;
        this.thickness = thickness;
        this.price = price;
    }
}
