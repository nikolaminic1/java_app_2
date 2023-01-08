package project;

import furniture_elements.library.actions.Carrying;
import furniture_elements.library.actions.Mounting;
import furniture_elements.library.actions.Transport;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    private Mounting mounting;
    private Transport transport;
    private Carrying carrying;
}
