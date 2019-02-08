package ganzenbord;

public class Speler{

    private String name;

    public Speler(String name) {
        this.name = name;
        System.out.println(name + " is aangemaakt.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
