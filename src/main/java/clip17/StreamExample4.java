package clip17;

import java.util.Arrays;
import java.util.List;

public class StreamExample4 {
    public static void main(String[] args) {
        List<Integer> numArr = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println("Integer::Sum");
        int result = numArr.stream()
                .reduce(0,Integer::sum);
        System.out.println(result);

        System.out.println("streamExample4::Sum");
        int result2 = numArr.stream()
                .reduce(0,StreamExample4::sum);
        System.out.println(result2);
    }

    public static int sum(int a,int b) {
        System.out.println("a = "+a+","+"b = "+b);
        return a+b;
    }

}
