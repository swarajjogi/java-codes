import java.util.*;

public class Elevenoct {
    public static void main(String[] args) {
        LinkedHashMap<String, ArrayList<Double>> map = new LinkedHashMap<>();

        map.put("s1->s2", new ArrayList<>(Arrays.asList(7.0, 8.0)));
        map.put("s2->s3", new ArrayList<>(Arrays.asList(1.0, 2.0)));
        map.put("s3->s4", new ArrayList<>(Arrays.asList(5.0, 9.0)));
        map.put("s4->s5", new ArrayList<>(Arrays.asList(12.0, 11.0)));
        map.put("s5->s6", new ArrayList<>(Arrays.asList(4.0, 5.0)));

        // experience point of each state from start state s1 ArrayList<Double>
        // experience =new ArrayList<>(Arrays.asList(0.7,0.51,0.6,0.71,0.8));

        double total_reward = 0.0;
        int index = 0;

        for (String i : map.keySet()) {
            ArrayList<Double> list = map.get(i);
            // getting max reward of multiple path double max=Collections.max(list);

            double sum = 0;
            for (int x = 0; x < list.size(); x++) {
                sum += list.get(x);
            }
            // getting probability of maximum reward double prob=max/sum;

            if (experience.get(index) >= prob) {
                total_reward += max;

                System.out.printf("For %s reward accepted with max experience over probability of %.3f\n", i, prob);
                System.out.println("reward Accepted=" + max + "\n");
            }

            index++;
        }
        System.out.println("......After the implementation	");
        System.out.println("Total reward earn for best experience = " + total_reward);

    }
}
