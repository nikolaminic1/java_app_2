package furniture_elements.library.elements.WardrobeDivisions;

public class DivisionFactory {

    public static _Divisions createDivision(String type){
        switch (type){
            case "lower_shelves":
                return new Lower_Shelves();
            default:
                return null;
        }
    }

}
