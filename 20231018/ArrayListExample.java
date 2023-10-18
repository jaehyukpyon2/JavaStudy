import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();
        list.add(new Board("s1", "c1", "w1"));
        list.add(new Board("s2", "c2", "w2"));
        list.add(new Board("s3", "c3", "w3"));
        list.add(new Board("s4", "c4", "w4"));
        list.add(new Board("s5", "c5", "w5"));

        int size = list.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();

        Board board = list.get(2);
        System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            Board b = list.get(i);
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
        System.out.println("----------");

        list.remove(2);
        list.remove(2);
        
        for (Board b : list) {
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
    }
}
