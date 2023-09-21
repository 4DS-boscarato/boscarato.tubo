public class Tubo {
    private int altezza;
    private int raggio;

    public Tubo(int alt, int rag){
        altezza = alt;
        raggio = rag;
    }

    public double volume(){
        return (3.14 * (raggio^2)) * altezza;
    }
}
