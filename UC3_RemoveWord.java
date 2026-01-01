import java.util.LinkedList;

public class UC3_RemoveWord {

    static int size = 10;
    static LinkedList<MyMapNode<String, Integer>>[] table =
            new LinkedList[size];

    static int getindex(String word) {
        return Math.abs(word.hashCode()) % size;
    }

    public static void main(String[] args) {

        String para = "paranoids are not paranoid because they are paranoid "
                + "but because they keep putting themselves deliberately "
                + "into paranoid avoidable situations";

        String[] words = para.split(" ");

        for (String word : words) {

            int index = getindex(word);

            if (table[index] == null) {
                table[index] = new LinkedList<>();
            }

            boolean found = false;

            for (MyMapNode<String, Integer> node : table[index]) {
                if (node.key.equals(word)) {
                    node.value++;
                    found = true;
                    break;
                }
            }

            if (!found) {
                table[index].add(new MyMapNode<>(word, 1));
            }
        }

        // remove "avoidable"
        int removeindex = getindex("avoidable");
        if (table[removeindex] != null) {
            table[removeindex].removeIf(node -> node.key.equals("avoidable"));
        }

        for (int i = 0; i < size; i++) {
            if (table[i] != null) {
                for (MyMapNode<String, Integer> node : table[i]) {
                    System.out.println(node.key + " : " + node.value);
                }
            }
        }
    }
}
