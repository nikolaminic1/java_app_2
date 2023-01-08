package furniture_elements.library.materials.edgebanding;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Edgeband {
    private int thickness;
    private EdgebandMaterial edgebandMaterial;
    private double price;
    private boolean isEdgebanded = false;

    public Edgeband() {
        this.isEdgebanded = false;
        this.thickness = 2;
        this.edgebandMaterial = new EdgebandMaterial();
        this.price = this.edgebandMaterial.getEdgebandMaterialPrice();
    }

    public Edgeband(boolean isEdgebanded) {
        this.isEdgebanded = isEdgebanded;
        this.thickness = 2;
        this.edgebandMaterial = new EdgebandMaterial();
        this.price = this.edgebandMaterial.getEdgebandMaterialPrice();
    }

    public boolean isEdgebanded() {
        return isEdgebanded;
    }

    public double getPrice() {
        if(isEdgebanded){
            return price;
        }
        return 0;
    }
}
