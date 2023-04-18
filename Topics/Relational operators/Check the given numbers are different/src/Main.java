import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(first);
        list.add(second);
        list.add(third);

        Set<Integer> set = new HashSet<>(list);

        //System.out.println(first != second && first != third && second != third);
        System.out.println(set.size() == list.size());
    }
}