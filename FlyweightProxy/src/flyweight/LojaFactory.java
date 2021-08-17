package flyweight;

import java.util.HashMap;
import java.util.Map;

public class LojaFactory {
    private static Map<String, Loja> lojas = new HashMap<>();

    public static Loja getLoja(String nome, String bairro) {
        Loja loja = lojas.get(nome);
        if (loja == null) {
            loja = new Loja(nome, bairro);
            lojas.put(nome, loja);
        }
        return loja;
    }

    public static int getTotalLojas() {
        return lojas.size();
    }

}




