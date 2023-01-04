package furniture_elements.library.materials.wooden_materials;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UniverMaterialInstance {

    private UniverName materialName;
    private double materialPrice;

    public UniverMaterialInstance() {
        this.materialPrice = 1000;
        materialName = UniverName.WHITE_101;
    }

    public UniverName getMaterialName() {
        return UniverName.WHITE_101;
    }

    public void setMaterialName() {
        this.materialName = UniverName.WHITE_101;
    }

    public double getMaterialPrice() {
        return materialPrice;
    }

    public void setMaterialPrice(double materialPrice) {
        this.materialPrice = materialPrice;
    }

    public UniverMaterialInstance(UniverName materialName, double materialPrice) {
        this.materialName = materialName;
        this.materialPrice = materialPrice;
    }
}
