import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ConversorRomano {
    public String converteParaRomano(int numeroDecimal) {

        Map<Integer,String> equivalenteRomano = new HashMap<>();
        equivalenteRomano.put(1,"I");
        equivalenteRomano.put(5,"V");
        equivalenteRomano.put(10,"X");
        equivalenteRomano.put(50,"L");
        equivalenteRomano.put(100,"C");
        equivalenteRomano.put(1000,"M");

        return equivalenteRomano.get(numeroDecimal);
    }
}
