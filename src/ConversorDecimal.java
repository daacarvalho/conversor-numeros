import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ConversorDecimal {
    public int converteParaDecimal(String numeroRomano) {

        Map<String, Integer> equivalenteDecimal = new HashMap<>();
        equivalenteDecimal.put("I", 1);
        equivalenteDecimal.put("V", 5);
        equivalenteDecimal.put("X", 10);
        equivalenteDecimal.put("L", 50);
        equivalenteDecimal.put("C", 100);
        equivalenteDecimal.put("M", 1000);

        return equivalenteDecimal.get(numeroRomano);
    }
}
