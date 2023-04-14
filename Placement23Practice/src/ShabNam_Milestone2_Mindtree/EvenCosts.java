package ShabNam_Milestone2_Mindtree;

import java.util.*;
import java.util.stream.Collectors;

public class EvenCosts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> costs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int cost = sc.nextInt();
            costs.add(cost);
        }
        List<Integer> evenCosts = costs.stream().filter(cost -> cost % 2 == 0).collect(Collectors.toList());
        System.out.println(evenCosts.stream().map(Object::toString).collect(Collectors.joining(" ")));
    }
}
