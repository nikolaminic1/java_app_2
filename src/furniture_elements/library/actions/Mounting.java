package furniture_elements.library.actions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
public class Mounting {
    private double price;

    public Mounting(double price) {
        this.price = price;
    }
}
