import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        sistema_Interfaces_Generic();
    }

    public static void sistema_Interfaces_Generic() {
        Produtos<RacaCachorro> hotel = new Hotel<>();

        hotel.addHospedes(new Yorkshire("Tito"));
        hotel.addHospedes(new ViraLata("Caramelo"));
        hotel.addHospedes(new Yorkshire("Caco"));

        Collections.sort(hotel.getHospedes());

        hotel.imprimirListaHospedes();
    }
}
