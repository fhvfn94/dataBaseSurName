import DataBaseSurname.People;
import DataBaseSurname.ServiceSurname;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        List<Integer> result = new ArrayList<>();
        int c = 0;
        for (int i = 0; i < nums.size(); i++) {
            int a = nums.get(i);
            for (int j = 1; j < nums.size(); j++) {
                int b = nums.get(j);
                c = a + b;
                result.add(c);
            }
        }
        int max = result.get(0);
        for (int i = 1; i < result.size(); i++) {
            if (max < result.get(i)) {
                max = result.get(i);
            }
        }
        System.out.println(max);

        List<Integer> r = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0 && !r.contains(nums.get(i))) {
                r.add(nums.get(i));
//                System.out.println(nums.get(i));
            }
        }
//        System.out.println(r);

        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        for (int i = 0; i < strings.size(); i++) {
            String word = strings.get(i);
            Integer count = 0;
            for (int j = 0; j < strings.size(); j++) {
                if (word == strings.get(j)) {
                    count++;
                }
                if (count > 1) {
                    break;
                }

            }
            if (count == 1){
//                System.out.println("word это strings.get(i) " + strings.get(i));
            }
        }
    }


    public static List<Integer> getOddNumbers(List<Integer> list) {
        return list.stream()
                .filter(it -> it % 2 != 0)
                .collect(Collectors.toList());
    }
}