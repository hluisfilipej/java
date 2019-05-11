import java.util.*;

public class EuroMilhoes {

    static final int QTDNUMEROS=5;
    static final int QTDESTRELAS=2;

    public static void main(String[] args) {

        int numEstrela;
        int numNumero;
        Set setN = new TreeSet();
        Set setE = new TreeSet();

            while (setN.size() != QTDNUMEROS) {
                numNumero = ((int) (1 + Math.random() * 50));
                setN.add(numNumero);
            }
            while(setE.size()!=QTDESTRELAS) {
                numEstrela = (int) (1 + Math.random() * 11);
                setE.add(numEstrela);
            }
                System.out.println("Números" + setN);
                System.out.println("Estrelas" + setE);
    }
}
