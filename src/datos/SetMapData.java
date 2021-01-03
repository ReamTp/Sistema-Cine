package datos;

import java.util.Map;
import java.util.Set;

public class SetMapData {
    public final ObtenerListaDatos old = new ObtenerListaDatos();
    public final Map<String, Integer> lisTDoc = old.tipoDoc();
    public final Map<String, Integer> lisTUser = old.tipoUser();
    public final Map<String, Integer> lisCateg = old.categoria();
    public final Map<String, Integer> lisMovie = old.peliculas();
    public final Map<String, Integer> lisHour = old.horario();
    public final Map<String, Integer> lisRoom = old.sala();
    public final Map<String, Integer> lisFood = old.comidas();
    public final Map<String, Integer> lisDrink = old.bebidas();
    public final Map<String, Integer> lisMPago = old.metodosPago();
    public final Set<String> keysTDoc = lisTDoc.keySet();
    public final Set<String> keysTUser = lisTUser.keySet();
    public final Set<String> keysCateg = lisCateg.keySet();
    public final Set<String> keysMovie = lisMovie.keySet();
    public final Set<String> keysHour = lisHour.keySet();
    public final Set<String> keysRoom = lisRoom.keySet();
    public final Set<String> keysFood = lisFood.keySet();
    public final Set<String> keysDrink = lisDrink.keySet();
    public final Set<String> keysMPago = lisMPago.keySet();
    
    public int ValueTDoc(String key){
        int valor = (int) lisTDoc.get(key);
        return valor;
    }
    
    public int ValueTUser(String key){
        int valor = (int) lisTUser.get(key);
        return valor;
    }
    
    public int ValueCateg(String key){
        int valor = (int) lisCateg.get(key);
        return valor;
    }
    
    public int ValueTMovie(String key){
        int valor = (int) lisMovie.get(key);
        return valor;
    }
    
    public int ValueHour(String key){
        int valor = (int) lisHour.get(key);
        return valor;
    }
    
    public int ValueRoom(String key){
        int valor = (int) lisRoom.get(key);
        return valor;
    }
    
    public int ValueFood(String key){
        int valor = (int) lisFood.get(key);
        return valor;
    }
    
    public int ValueDrink(String key){
        int valor = (int) lisDrink.get(key);
        return valor;
    }
    
    public int ValueMPago(String key){
        int valor = (int) lisMPago.get(key);
        return valor;
    }
}
