package Ej3;
import java.util.*;

public class Diccionario <K, V> {
    ArrayList<Par<K, V>> arrayList;

    public Diccionario() {
        arrayList = new ArrayList<>();
    }

    public void add(K key, V value) {
        arrayList.add(new Par<>(key, value));
    }

    public boolean delete(K key) {
        for (Par<K, V> pair : arrayList) {
            if (pair.getKey().equals(key)) {
                return arrayList.remove(pair);
            }
        }
        return false;
    }
    public V getValue(K key) throws Exception {
        for (Par<K, V> pair : arrayList) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        throw new Exception("ObjectNoExist");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Par<K, V> pair : arrayList) {
            sb.append(pair.getKey()).append(": ").append(pair.getValue()).append("\n");
        }
        return sb.toString();
    }
}
