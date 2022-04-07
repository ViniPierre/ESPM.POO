package src.espm.poo.Quiz;

public class Tempo {
    int hora;
    int minuto;
    int segundo;

   public Tempo() {
         this(0, 0, 0);
    }
    public Tempo(int h) {
         this(h, 0, 0);
    }
    public Tempo(int h, int m) {
         this(h, m, 0);
    }
    public Tempo(int h, int m, int s) {
         hora = h;
         minuto = m;
         segundo = s;
    }
}