import java.util.HashMap;

public class Exercise21 {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("Akram Afif", "Qatar");                  map.put("Moisés Caicedo", "Ecuador");
        map.put("Sadio Mané", "Senegal");                map.put("Virgil van Dijk", "Países Bajos");
        map.put("Harry Kane", "Inglaterra");             map.put("Sardar Azmoun", "Irán");
        map.put("Christian Pulisic", "Estados Unidos");  map.put("Gareth Bale", "Gales");
        map.put("Lionel Messi", "Argentina");            map.put("Salem Al-Dawsari", "Arabia Saudita");
        map.put("Hirving Lozano", "México");             map.put("Robert Lewandowski", "Polonia");
        map.put("Kylian Mbappé", "Francia");             map.put("Mathew Ryan", "Australia");
        map.put("Christian Eriksen", "Dinamarca");       map.put("Wahbi Khazri", "Túnez");
        map.put("Pedri", "España");                      map.put("Keylor Navas", "Costa Rica");
        map.put("Joshua Kimmich", "Alemania");           map.put("Daichi Kamada", "Japón");
        map.put("Kevin De Bruyne", "Bélgica");           map.put("Alphonso Davies", "Canadá");
        map.put("Achraf Hakimi", "Marruecos");           map.put("Luka Modric", "Croacia");
        map.put("Neymar", "Brasil");                     map.put("Filip Kostic", "Serbia");
        map.put("Yann Sommer", "Suiza");                 map.put("Cristiano Ronaldo", "Portugal");
        map.put("André Onana", "Camerún");               map.put("Iñaki Williams", "Ghana");
        map.put("Federico Valverde", "Uruguay");         map.put("Son Heung-min", "Corea del Sur");


        map.forEach((k, v) -> {
            System.out.println("Player: " + k + " " + "country: " + v);
        });

    }

}
