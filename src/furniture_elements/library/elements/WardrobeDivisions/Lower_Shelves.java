package furniture_elements.library.elements.WardrobeDivisions;

import furniture_elements.library.elements.WardrobeElements.Shelves;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Lower_Shelves {
    private double height;
    private double width;
    private double depth;
    private int numberOfShelves;
    private List<Shelves> shelves;
    private double price;

    public double getPrice(){
        price = 0;
        for(Shelves shelf : shelves){
            price += shelf.getPrice();
        }
        return price;
    }
}
