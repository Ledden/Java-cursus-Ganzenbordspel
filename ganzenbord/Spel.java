package ganzenbord;

public class Spel {

    private int      aantalSpelers;
    private String[] pionnen = {"Rood", "Geel", "Blauw", "Groen", "Zwart", "Wit"};

    public Spel(int aantalSpelers) {
        this.aantalSpelers = aantalSpelers;
    }

    public int getAantalSpelers() {
        return aantalSpelers;
    }

    public void setAantalSpelers(int aantalSpelers) {
        this.aantalSpelers = aantalSpelers;
    }

     public String[] getPionnen() {
        return pionnen;
    }

    public void setPionnen(String[] pionnen) {
        this.pionnen = pionnen;
    }
}

/*public class Ganzenbord extends Bordspel {

    public static HashMap<Integer, String> betVakken = new HashMap<Integer, String>();


        betVakken.put(6,  "Je staat op een brug: Ga verder naar 12.");
        betVakken.put(19, "Je zit in de herberg, neem je gemak en sla een beurt over.");
        betVakken.put(31, "Je bent in een put gevallen. Wacht tot een andere speler je eruit haalt.");
        betVakken.put(42, "Je bent verdwaalt in een doolhof, ga terug naar 39.");
        betVakken.put(52, "Je zit in de gevangenis, la 3 beurten over.");
        betVakken.put(58, "Helaas, vlak voor het einde gesneuveld. Ga terug naar Start.");
        betVakken.put(63, "Einde");

}
}*/




