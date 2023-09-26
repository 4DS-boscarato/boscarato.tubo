public class Tubo {
    private int altezza;
    private int raggio;

    public Tubo(int alt, int rag){
        altezza = alt;
        raggio = rag;
    }

    public double volume(){
        return (3.14 * (raggio*raggio)) * altezza;
    }

    public double superficeTot(){
        return ((3.14 * (raggio*raggio)) * 2) + ((2 * 3.14 * raggio) * altezza);
    }
}
