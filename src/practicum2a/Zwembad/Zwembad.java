package practicum2a.Zwembad;

public class Zwembad {
    private double lengte;
    private double breedte;
    private double diepte;

    public Zwembad(double bred, double leng, double dept){
        breedte = bred;
        lengte = leng;
        diepte = dept;
    }
    public Zwembad(){};

    public double getLengte(){return lengte;}
    public double getBreedte(){return breedte;}
    public double getDiepte(){return diepte;}

    public void setLengte(double leng){lengte = leng;}
    public void setBreedte(double bred){breedte = bred;}
    public void setDiepte(double dept){diepte = dept;}

    public double inhoud(){
        double inh = getLengte() * getBreedte() * getDiepte();
        return inh;}

    public String toString(){
        String zin = "Dit zwembad is " + getBreedte() + " meter breed, " + getLengte() + " meter lang, " + "en " + getDiepte() + " meter diep.";
        return zin;
    }





}

