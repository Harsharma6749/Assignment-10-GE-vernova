import java.util.LinkedList;

public class UC1_WordFrequency {

    public static void main(String[] args) {

        String sentence = "to be or not to be";
        String[] words = sentence.split(" ");

        LinkedList<MyMapNode<String, Integer>> list = new LinkedList<>();

        for (String word : words) {

            boolean found = false;

            for (MyMapNode<String, Integer> node : list) {
                if (node.key.equals(word)) {
                    node.value++;
                    found = true;
                    break;
                }
            }

            if (!found) {
                list.add(new MyMapNode<>(word, 1));
            }
        }

        for (MyMapNode<String, Integer> node : list) {
            System.out.println(node.key + " : " + node.value);
        }
    }
}
