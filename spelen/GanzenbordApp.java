package spelen;

import ganzenbord.Spel;
import ganzenbord.Speler;
import ganzenbord.Dobbelsteen;
import ganzenbord.Vakje;

public class GanzenbordApp {

    public static void main(String[] args) {


        Spel mijnSpel         = new Spel(3);
        int  aantSp           = mijnSpel.getAantalSpelers();
        String  [] spelers    = new String[mijnSpel.getAantalSpelers()];
        String  [] pionnen    = new String[mijnSpel.getAantalSpelers()];
        int     [] positie    = new int[mijnSpel.getAantalSpelers()];
        int     [] aantBeurtW = new int[mijnSpel.getAantalSpelers()];
        boolean [] wachtAnder = new boolean[mijnSpel.getAantalSpelers()];
        boolean magGooien     = false;
        int     [] ranking   = new int[mijnSpel.getAantalSpelers()];
        int        rankpos   = 0;
        int        maxRondes = 150;
        int        aantActieveSpelers = mijnSpel.getAantalSpelers();
        boolean    stopSpel = false;


        String naam;
       //maak spelers en geeft ze een kleur pion
        for(int i = 0; i< mijnSpel.getAantalSpelers(); i++) {
            naam = "Speler "+(i+1);
            Speler sp = new Speler(naam);
            spelers[i] = naam;
            pionnen[i] = mijnSpel.getPionnen()[i];
            positie[i] = 0;
            aantBeurtW[i] = 0;
            wachtAnder[i] = false;
            System.out.println("Speelt met "+ mijnSpel.getPionnen()[i]+".");
        }

//Loop door de spelrondes
int ronde = 0;
do{ronde = ronde + 1;
        System.out.println("<----- RONDE "+ronde+" ----->");

        //Loop door de spelers
        for(int i=0; i < mijnSpel.getAantalSpelers()  ; i++) {

            if((wachtAnder[i]==true)&& aantActieveSpelers==1){stopSpel=true; break;} // stoppen als er nog 1 speler staat die 'bevrijd' moet worden. Lijkt dubbel, maar er kon al een speler op 31 staan

            System.out.print("Mag "+spelers[i]+" met pion " + pionnen[i]+" " +  " gooien? "+positie[i] +" "+aantBeurtW[i]+" "+wachtAnder[i]+" ");
            magGooien = evalueerGooi(positie[i], aantBeurtW[i], wachtAnder[i]);

            if (aantBeurtW[i] >0){
                aantBeurtW[i] =  aantBeurtW[i]-1 ;
                System.out.println("aantal beurten wachten is nu geworden " + aantBeurtW[i]);
            }

            if (magGooien){
                 System.out.print(spelers[i]+" met pion " + pionnen[i]+" " +  " gooit ");
                 Dobbelsteen  mijnDobbelsteen = new Dobbelsteen();
                 int worp = mijnDobbelsteen.getWorp();
                 positie[i] = positie[i] + worp;
                 System.out.print("en gaat naar: ");
                 Vakje nwvak = new Vakje(positie[i]);

/*              ------------------------------------------
                 -- Wat zijn de gevolgen van de worp ?  --
                -----------------------------------------                     */
                switch (positie[i]){
                    case 6 : positie[i]=12;
                        break;
                    case 19: aantBeurtW[i]=1;
                        break;
                    case 31: wachtAnder[i]=true;
                         if(aantActieveSpelers == 1){stopSpel = true;};

                        //Andere spelers op 31 mogen nu weer verder
                        for(int i2=0; i2<mijnSpel.getAantalSpelers(); i2++){
                           System.out.println(i2 + "Staan er nog andere spelers op 31?");
                              if(i2!=i && wachtAnder[i2]){
                                 System.out.println(wachtAnder[i2] + "wordt false");
                                 wachtAnder[i2] = false;
                           }
                        }
                        break;
                    case 42: positie[i]=39;
                        break;
                    case 52: aantBeurtW[i]=3;
                        break;
                    case 58: positie[i]=0;
                        break;
                    case 63: // Er is een Winnaar
                      if(rankpos ==0) {
                          System.out.println("Gefeliciteerd, je bent als eerste gefinished en hebt het spel gewonnen!");
                          //Kijk even of alle overige speler(s) wachten om 'bevrijd' te worden; zo ja beëndig spel
                          int tel = 0;
                          for(int i3=0; i3<mijnSpel.getAantalSpelers(); i3++){
                             System.out.println(i3+" "+ wachtAnder[i3]);
                              if(wachtAnder[i3]==true){tel =+ 1;}
                           }
                           System.out.println("aantal wachten = "+tel+" rankpos "+rankpos);
                           if(tel + rankpos +1 == mijnSpel.getAantalSpelers()){
                                System.out.println("==> Einde spel: overige speler(s) kunnen niet meer de finish halen.");
                           }
                      }
                      ranking[rankpos] = i ;
                      rankpos += 1;
                      aantActieveSpelers -= 1;
                        break;
                    case 64: positie[i] = 63 - (positie[i] - 63) ;
                        break;
                    case 65: positie[i] = 63 - (positie[i] - 63) ;
                        break;
                    case 66: positie[i] = 63 - (positie[i]  - 63) ;
                        break;
                    case 67: positie[i] = 63 - (positie[i] - 63) ;
                        break;
                    case 68: positie[i] = 63 - (positie[i] - 63) ;
                        break;
                    default:
                        break;
                  }
            }//if magGooien

 } //loop spelers
//System.out.println("ronde = " + ronde + " en maxRondes = "+maxRondes+ " en rankpos = "+ rankpos);

//if(ronde>maxRondes)
    if (stopSpel){System.out.println("Spel kan niet verder uitgespeeld.");break;}

}
while(rankpos< mijnSpel.getAantalSpelers()&&ronde<maxRondes);

System.out.println("===== EN DE WINNAAR IS .......  "+ spelers[ranking[0]]);

for(int i = 0;i<ranking.length; i++){
    System.out.println((i+1)+". "+ spelers[ranking[i]]);
}

}

    private static boolean evalueerGooi(int pos, int brtWachten, boolean wachtOpSpeler) {
        if (pos==63|brtWachten>0|wachtOpSpeler) {
            System.out.println("Deze speler mag niet (meer) gooien.");
            return false;
        }else { System.out.println("Ja");return true;}
    }


}




