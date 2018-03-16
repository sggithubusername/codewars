public class Order {
    public static String order(String words) {
        if (words == "") return "";
        String[] wordArray = words.split(" ");
        int length = wordArray.length;
        String[] result = new String[length];
        for (int i = 0; i<length; i++){
            int j = 1;
            while ((j<10)&&(!wordArray[i].contains(Integer.toString(j)))) j++;
            result[j-1] = wordArray[i];
        }
        return String.join(" ",result);
    }
}