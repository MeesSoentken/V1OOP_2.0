package practicum2b.Voetbalclub;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String nm){naam = nm;}

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;}

    public int aantalPunten(){return aantalGewonnen * 3 + aantalGelijk * 1;}

    public int aantalGespeeld(){
        int s = aantalGewonnen + aantalGelijk + aantalVerloren;
        return s;}

    public String toString(){
        String s = naam + " " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();
        return s;
    }
}

