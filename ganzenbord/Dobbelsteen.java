package ganzenbord;

public class Dobbelsteen {


    public int worp;

    public int getWorp() {
        //System.out.println("aanroep en worp is nu  "+ this.worp);
        //this.worp = (int)(Math.random()*6) + 1;
        worp();
        System.out.println(this.worp + ".");
        return this.worp;
    }

    private void worp(){

     this.worp  = (int)(Math.random()*6) + 1;

    }

    }



