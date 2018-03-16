import java.util.ArrayList;
import java.util.List;

public class SumDigPower {

    public static List<Long> sumDigPow(long a, long b) {
        // your code
        List <Long> li = new ArrayList<Long>();
        if (a > b) return li;
        for (long i = a; i<=b; i++){
            int digitNumber = 0;
            long tmp = i;
            long sum = 0;

            while (tmp>0) {
                digitNumber++;
                tmp = tmp / 10;
            }
            tmp = i;
            while (digitNumber>0){
           // for (int j = digitNumber; j>0; j--){
                sum += Math.pow(tmp % 10, digitNumber);
                digitNumber--;
                tmp = tmp / 10;
            }

            if (i==sum) li.add(i);
        }
        return li;
    }
}