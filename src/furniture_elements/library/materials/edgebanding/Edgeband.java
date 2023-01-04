package furniture_elements.library.materials.edgebanding;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Edgeband {
    private double thickness;
    private EdgebandMaterial edgebandMaterial;
    private double price;
    private boolean isEdgebanded;

    public Edgeband(boolean isEdgebanded) {
        this.isEdgebanded = isEdgebanded;
        this.thickness = 2;
        this.edgebandMaterial = new EdgebandMaterial();
        this.price = this.edgebandMaterial.getEdgebandMaterialPrice();
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public EdgebandMaterial getEdgebandMaterial() {
        return edgebandMaterial;
    }

    public void setEdgebandMaterial(EdgebandMaterial edgebandMaterial) {
        this.edgebandMaterial = edgebandMaterial;
    }

    public void setIsEdgebanded(boolean edgebanded) {
        this.isEdgebanded = edgebanded;
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
