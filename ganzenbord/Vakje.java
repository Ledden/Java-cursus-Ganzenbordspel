package ganzenbord;

public class Vakje  {

    private int      vakje;
    private String[] vakjes =
            {"START" //0
                    , "1 GEWOON VAKJE"
                    , "2 GEWOON VAKJE"
                    , "3 GEWOON VAKJE"
                    , "4 GEWOON VAKJE"
                    , "5 GEWOON VAKJE"
                    , "6 BRUG: Je staat op een brug: Ga verder naar 12."
                    , "7 GEWOON VAKJE"
                    , "8 GEWOON VAKJE"
                    , "9 GEWOON VAKJE"
                    , "10 GEWOON VAKJE"
                    , "11 GEWOON VAKJE"
                    , "12 GEWOON VAKJE"
                    , "13 GEWOON VAKJE"
                    , "14 GEWOON VAKJE"
                    , "15 GEWOON VAKJE"
                    , "16 GEWOON VAKJE"
                    , "17 GEWOON VAKJE"
                    , "18 GEWOON VAKJE"
                    , "19 HERBERG: Je zit in de herberg, neem je gemak en sla een beurt over."
                    , "20 GEWOON VAKJE"
                    , "21 GEWOON VAKJE"
                    , "22 GEWOON VAKJE"
                    , "23 GEWOON VAKJE"
                    , "24 GEWOON VAKJE"
                    , "25 GEWOON VAKJE"
                    , "26 GEWOON VAKJE"
                    , "27 GEWOON VAKJE"
                    , "28 GEWOON VAKJE"
                    , "29 GEWOON VAKJE"
                    , "30 GEWOON VAKJE"
                    , "31 PUT: Je bent in een put gevallen. Wacht tot een andere speler je eruit haalt."
                    , "32 GEWOON VAKJE"
                    , "33 GEWOON VAKJE"
                    , "34 GEWOON VAKJE"
                    , "35 GEWOON VAKJE"
                    , "36 GEWOON VAKJE"
                    , "37 GEWOON VAKJE"
                    , "38 GEWOON VAKJE"
                    , "39 GEWOON VAKJE"
                    , "40 GEWOON VAKJE"
                    , "41 GEWOON VAKJE"
                    , "42 DOOLHOF: Je bent verdwaald in een doolhof, ga terug naar 39."
                    , "43 GEWOON VAKJE"
                    , "44 GEWOON VAKJE"
                    , "45 GEWOON VAKJE"
                    , "46 GEWOON VAKJE"
                    , "47 GEWOON VAKJE"
                    , "48 GEWOON VAKJE"
                    , "49 GEWOON VAKJE"
                    , "50 GEWOON VAKJE"
                    , "51 GEWOON VAKJE"
                    , "52 GEVANGENIS: Je zit in de gevangenis, sla 3 beurten over."
                    , "53 GEWOON VAKJE"
                    , "54 GEWOON VAKJE"
                    , "55 GEWOON VAKJE"
                    , "56 GEWOON VAKJE"
                    , "57 GEWOON VAKJE"
                    , "58 DOOD: Helaas, vlak voor het einde gesneuveld. Ga terug naar Start."
                    , "59 GEWOON VAKJE"
                    , "60 GEWOON VAKJE"
                    , "61 GEWOON VAKJE"
                    , "62 GEWOON VAKJE"
                    , "63 FINISH: Hoera je hebt de finish gehaald!"
                    , "1 te ver!"
                    , "2 te ver!"
                    , "3 te ver!"
                    , "4 te ver!"
                    , "5 te ver!"
                    , "En dit kan helemaal niet!"
            };

    public Vakje(int vakje) {
        System.out.println("*** "+this.vakjes[vakje]+ " ***");
        this.vakje = vakje;
    }

    public int getVakje() {
        return vakje;
    }

    public void setVakje(int vakje) {
        this.vakje = vakje;
    }

    public String[] getVakjes() {
        return vakjes;
    }

    public void setVakjes(String[] vakjes) {
        this.vakjes = vakjes;
    }



}
