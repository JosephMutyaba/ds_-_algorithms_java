import java.util.Hashtable;

public class Hash_table {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(12,"Number 12");
        ht.put(13,"Number 13");
        ht.put(14,"Number 14");
        ht.put(15,"Number 15");

        System.out.println(ht.get(13));

        //retrieve all
        for (Integer key : ht.keySet()) {
            System.out.println("key: " + key+", value: " + ht.get(key));
        }
    }
}
