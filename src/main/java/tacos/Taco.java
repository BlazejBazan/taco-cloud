package tacos;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class Taco {

    @NotNull
    @Size(min = 5, message = "Nazwa musi składąć się z przynajmniej pięciu znaków.")
    private String name;

    @Size(min = 1, message = "Musisz wybrać przynajmniej jeden skłądnik.")
    private List<String> ingredients;
}
