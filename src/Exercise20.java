import java.util.HashMap;

public class Exercise20 {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("El Salvador", "San Salvador");
        map.put("Unite State", "Washington D. C.");
        map.put("Guatemala", "Ciudad de Guatemala");
        map.put("Suiza", "Berna");
        map.put("España", "Madrid");

        // TODO
        map.forEach((k, v) -> {
            System.out.println("Country: " + k + " capital: " + v);
        });
    }

}
