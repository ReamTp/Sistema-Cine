package datos;

import java.util.Map;
import java.util.Set;

public class SetMapData {

    public final ObtenerListaDatos old = new ObtenerListaDatos();
    public Map<String, Integer> lisTDoc , lisTUser, lisCateg, lisMovie, lisHour, lisRoom, lisFood, lisDrink, lisMPago;
    public Set<String> keysTDoc, keysTUser, keysCateg, keysMovie, keysHour, keysRoom, keysFood, keysDrink, keysMPago;

    public SetMapData() {
        lisTDoc = old.tipoDoc();
        lisTUser = old.tipoUser();
        lisCateg = old.categoria();
        lisMovie = old.peliculas();
        lisHour = old.horario();
        lisRoom = old.sala();
        lisFood = old.comidas();
        lisDrink = old.bebidas();
        lisMPago = old.metodosPago();
        keysTDoc = lisTDoc.keySet();
        keysTUser = lisTUser.keySet();
        keysCateg = lisCateg.keySet();
        keysMovie = lisMovie.keySet();
        keysHour = lisHour.keySet();
        keysRoom = lisRoom.keySet();
        keysFood = lisFood.keySet();
        keysDrink = lisDrink.keySet();
        keysMPago = lisMPago.keySet();
    }

    public int ValueTDoc(String key) {
        int valor = (int) lisTDoc.get(key);
        return valor;
    }

    public int ValueTUser(String key) {
        int valor = (int) lisTUser.get(key);
        return valor;
    }

    public int ValueCateg(String key) {
        int valor = (int) lisCateg.get(key);
        return valor;
    }

    public int ValueTMovie(String key) {
        int valor = (int) lisMovie.get(key);
        return valor;
    }

    public int ValueHour(String key) {
        int valor = (int) lisHour.get(key);
        return valor;
    }

    public int ValueRoom(String key) {
        int valor = (int) lisRoom.get(key);
        return valor;
    }

    public int ValueFood(String key) {
        int valor = (int) lisFood.get(key);
        return valor;
    }

    public int ValueDrink(String key) {
        int valor = (int) lisDrink.get(key);
        return valor;
    }

    public int ValueMPago(String key) {
        int valor = (int) lisMPago.get(key);
        return valor;
    }
}
