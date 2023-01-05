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
public abstract class Lower_Shelves extends _Divisions {
    private int numberOfShelves;
    private List<Shelves> shelves;


//    public int getPrice(){
//        for(Shelves shelf : shelves){
//            price += shelf.getPrice();
//        }
//        return price;
}
