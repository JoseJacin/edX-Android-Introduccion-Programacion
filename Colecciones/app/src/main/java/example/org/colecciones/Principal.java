package example.org.colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by JoseJacin on 18/6/16.
 */
public class Principal {
    public static void main(String[] main) {
        List<Complejo> lista = new ArrayList<Complejo>();
        lista.add( new Complejo(1.0, 5.0) );
        lista.add( new Complejo(2.0, 4.2) );
        lista.add(1, new Complejo(3.0, 0.0) );lista.remove(0);
        for(Complejo c: lista) {
            System.out.println(c);
        }
    }
}
