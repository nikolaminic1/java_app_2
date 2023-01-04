package furniture_elements.library.materials.edgebanding;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
@AllArgsConstructor
public class EdgebandMaterial {
    private double edgebandMaterialPrice;

    @Enumerated(EnumType.STRING)
    private EdgebandMaterialName edgebandMaterialName;

    public EdgebandMaterial() {
        this.edgebandMaterialPrice = 100;
        this.edgebandMaterialName = EdgebandMaterialName.WHITE_ABS_2mm;
    }

    public EdgebandMaterialName getEdgebandMaterialName() {
        return EdgebandMaterialName.WHITE_ABS_2mm;
    }

    public double getEdgebandMaterialPrice() {
        return edgebandMaterialPrice;
    }

    public void setEdgebandMaterialName(EdgebandMaterialName edgebandMaterialName) {
        this.edgebandMaterialName = edgebandMaterialName;
    }
}
