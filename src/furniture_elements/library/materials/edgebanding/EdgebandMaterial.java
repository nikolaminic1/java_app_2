package furniture_elements.library.materials.edgebanding;

public class EdgebandMaterial {
    private EdgebandMaterialName edgebandMaterialName;
    private double edgebandMaterialPrice;

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
