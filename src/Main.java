import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(5, 6, 7, 35, 56, 405, 55, 46, 78 ,645));
//        Предложение состоит из нескольких слов, разделенных пробелами. Например: "One two three раз два три one1 two2 123".
//        Найти количество слов, содержащих только символы латинского алфавита.

        List<String> wo = List.of("a");
//        Проверить, содержит ли ваша строка подстроку “Java”.
        String qwert = "upload//qf/q2/text.txt";
        boolean java = qwert.contains("Java");
        System.out.println(java);

        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.size(); i++) {
            int count = 0;
            char[] a = nums.get(i).toString().toCharArray();
            for (int j = 0; j < a.length; j++) {
                if (a[j] == '5') {
                    count++;
                }
            }
            numbers.put(nums.get(i), count);
        }
        System.out.println(numbers);

        List<Integer> result = new ArrayList<>();
        int c = 0;
        int max = 0;
        for (int i = 0; i < nums.size(); i++) {
            String a = nums.get(i).toString();
            Integer res = 0;
            for (int j = 0; j < a.length(); j++) {
                String b = String.valueOf(a.charAt(j));
                Integer r = Integer.parseInt(b);
                res += r;
            }
            if (max < res) {
                max = res;
            }
        }
        System.out.println(max);

        String w = "upload/qg/qf/q2/text.txt";
        String upload = w.substring(w.lastIndexOf("/") + 1, w.indexOf("."));
        System.out.println(upload);
        String txt = w.substring(w.indexOf(".") + 1);
        System.out.println(txt);
        String path = w.substring(0, w.lastIndexOf("/") + 1);
        System.out.println(path);







/*        List<Integer> r = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0 && !r.contains(nums.get(i))) {
                r.add(nums.get(i));
//                System.out.println(nums.get(i));
            }
        }*/
//        System.out.println(r);

       /* List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
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
        }*/
    }


    public static List<Integer> getOddNumbers(List<Integer> list) {
        return list.stream()
                .filter(it -> it % 2 != 0)
                .collect(Collectors.toList());
    }
}