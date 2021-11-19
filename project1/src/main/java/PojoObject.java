import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PojoObject {

    String objName;

    public static void main(String[] args) {
        PojoObject object = new PojoObject("name");
    }
}
