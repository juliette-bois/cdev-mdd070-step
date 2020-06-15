package list_linkedlist;

public interface MaList {
    int size();
    void add(String valeur);
    void add(int position, String valeur);
    String get(int position);
}
