package furniture_elements.library.materials.edgebanding;

public class Edgeband {
    private double thickness;
    private EdgebandMaterial edgebandMaterial;
    private double price;
    private boolean isEdgebanded;

    public Edgeband(double thickness, EdgebandMaterial edgebandMaterial) {
        this.thickness = thickness;
        this.edgebandMaterial = edgebandMaterial;
    }

    public Edgeband() {

    }

    public double getThickness() {
        return thickness;
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

    public void setEdgebanded(boolean edgebanded) {
        isEdgebanded = edgebanded;
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
