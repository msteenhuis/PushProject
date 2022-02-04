import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>();

        numList.add(3);

        numList.add(0, 6);

        numList.add(numList.size(), 7);

        numList.add(2, 8);

        numList.set(1, 9);

        numList.add(1,2);

        numList.add(1, numList.size());

        numList.remove(5);

        numList.add(numList.size(), 0);

        System.out.println(numList);
    }
}
