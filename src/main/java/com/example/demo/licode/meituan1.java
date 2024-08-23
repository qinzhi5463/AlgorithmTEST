package com.example.demo.licode;
import java.util.*;


public class meituan1 {

    public static void main(String[] args) {
        //接受输入，所记密码个数、正确的密码、已经记得的密码
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String ans = scanner.next();

        Map<Integer, Set<String>> pos = new HashMap<>();


        for (int i = 0; i < n; i++) {
            String p = scanner.next();
            pos.computeIfAbsent(p.length(), k -> new HashSet<>()).add(p);
        }
        //让密码按照长度排序
        List<Map.Entry<Integer, Set<String>>> sortedPos = new ArrayList<>(pos.entrySet());
        sortedPos.sort(Map.Entry.comparingByKey());

        //计算最少和最多尝试次数
        int step = 0;
        int MIN = -1, MAX = -1;
        for (Map.Entry<Integer, Set<String>> entry : sortedPos) {
            Set<String> v = entry.getValue();
            if (v.contains(ans)) {
                MIN = step + 1;
                MAX = step + v.size();
            } else {
                step += v.size();
            }
        }

        System.out.println(MIN + " " + MAX);

        scanner.close();
    }
}
