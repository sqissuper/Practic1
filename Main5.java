package main;

import java.util.*;

public class Main5 {
    //找到法官
//    public static int findJudge(int N, int[][] trust) {
//        if(N == 1) {
//            return 1;
//        }
//        int[] vote = new int[N + 1];
//        for (int i = 0; i < trust.length; i++) {
//            vote[trust[i][1]]++;
//            vote[trust[i][0]]--;
//        }
//        int judge = -1;
//        for (int i = 0; i <= N; i++) {
//            if (vote[i] == N - 1) {
//                judge = i;
//                break;
//            }
//        }
//        return judge;
//    }

    //杨辉三角
//    public static List<List<Integer>> generate(int n){
//        List<Integer> list = new ArrayList();
//        list.add(1);
//        List<List<Integer>> row = new ArrayList();
//        row.add(list);
//        for (int i = 1; i < n; i++) {
//            List<Integer> col = new ArrayList();
//            col.add(1);
//            for (int j = 1; j < i; j++) {
//                List<Integer> ret = row.get(i - 1);
//                int num = ret.get(j - 1) + ret.get(j);
//                col.add(num);
//            }
//            col.add(1);
//            row.add(col);
//        }
//        return row;
//
//    }
//
//    //杨辉三角
//    public static int[][] triangle(int n){
//        int[][] arr = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            arr[i][0] = arr[i][i] = 1;
//            for (int j = 1; j < i; j++) {
//                arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
//            }
//        }
//        return arr;
//    }
////    //打印
//    public static void print(int arr[][]){
//        int len = arr.length;
//        for (int i = 0; i < len; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static List<Character> func(String str1,String str2){
//        List<Character> ret = new ArrayList<>();
//
//        for (int i = 0; i < str1.length(); i++) {
//            char ch = str1.charAt(i);
//            if(!str2.contains(ch+"")){
//                ret.add(str1.charAt(i));
//            }
//        }
//        return ret;
//    }

    //二维网格逆置
//    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
//        int m = grid.length;
//        int n = grid[0].length;
//        int p = m*n;
//        int[] num = new int[p];
//        int x = 0;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                num[x++] = grid[i][j];
//            }
//        }
//        k %= p;
//        while(k != 0) {
//            int ret = num[p - 1];
//            for (int i = p - 1; i > 0; i--) {
//                num[i] = num[i - 1];
//            }
//            num[0] = ret;
//            k--;
//        }
//        x = 0;
//        List<List<Integer>> lists = new ArrayList<>();
//        for (int i = 0; i < m; i++) {
//            List<Integer> col = new ArrayList<>();
//            for (int j = 0; j < n; j++) {
//                col.add(num[x++]);
//            }
//            lists.add(col);
//        }
//        return lists;
//
//    }

    // 将数组分成和相等的三个部分
//    public static boolean canThreePartsEqualSum(int[] arr) {
//        int sum = 0;
//        for (int x:arr) {
//            sum += x;
//        }
//        if(sum % 3 != 0) return false;
//        sum /= 3;
//        int ret = 0,count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            ret += arr[i];
//            if(ret == sum) {
//                count++;
//                ret = 0;
//                if(count > 2) {
//                    return true;
//                }
//            }
//        }
//        return false;
//
//    }

    //栈问题字符串
//    public static boolean backspaceCompare(String S, String T) {
//        Stack<Character> s = new Stack<>();
//        Stack<Character> t = new Stack<>();
//        for (int i = 0; i < S.length(); i++) {
//            if(S.charAt(i) != '#') {
//                s.push(S.charAt(i));
//            }
//            if(S.charAt(i) == '#' && !s.empty()) {
//                s.pop();
//            }
//        }
//        for (int i = 0; i < T.length(); i++) {
//            if(T.charAt(i) != '#') {
//                t.push(T.charAt(i));
//            }
//            if(T.charAt(i) == '#' && !t.empty()) {
//                t.pop();
//            }
//        }
//        return s.equals(t);
//    }

    //栈的压入弹出
//    public static boolean IsPopOrder(int [] pushA,int [] popA) {
//        if(pushA.length == 0 || popA.length == 0) return false;
//        Stack<Integer> s = new Stack<>();
//        int index = 0;
//        for (int i = 0; i < pushA.length; i++) {
//            s.push(pushA[i]);
//            while (!s.empty() && s.peek() == popA[index]) {
//                s.pop();
//                index++;
//            }
//        }
//        return s.empty();
//    }

    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.offer(1);
//        queue.offer(2);
//        queue.offer(3);
//        System.out.println(queue);
//        System.out.println(queue.element());
//        System.out.println(queue.peek());
//        queue.remove();
//        System.out.println(queue);

//        int[] pushA = {1,2,3,4,5};
//        int[] popA = {4,3,5,1,2};
//        System.out.println(IsPopOrder(pushA,popA));
//        String S = "ab#c";
//        String T = "ad#c";
//        System.out.println(backspaceCompare(S,T));

//        int[] arr = {0,2,1,-6,6,7,9,-1,2,0,1};
//        System.out.println(canThreePartsEqualSum(arr));
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < str.length(); i++) {
//            char tmp = str.charAt(i);
//            if(!sb.toString().contains(tmp+"")) {
//                sb.append(tmp);
//            }
//        }
//        String s = sb.toString();
//        System.out.println(s);

//        int n = 6;
//        int[][] arr = triangle(n);
//        print(arr);


//        List<List<Integer>> ret = generate(5);
//        System.out.println(ret);
//        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//        int k = 2;
//        List<List<Integer>> ret = shiftGrid(arr,k);
//        System.out.println(ret);
//        int[][] ret = shiftGrid(arr,2);
//        System.out.println(Arrays.deepToString(ret));

//        int[][] trust = {{1,3},{2,3}};
//        int n = 3;
//        System.out.println(findJudge(n, trust));
    }
}
