public class GreatestCommonDivisorOfString {
    public static void main(String[] args) {
        String str1 = "ABABABAB";
        String str2 = "ABAB";
        System.out.println(gcdOfString(str1, str2));
        System.out.println(10 % 5);
    }

    static String gcdOfString(String str1, String str2){
        // First of all we'll check the concatenation of the two string is equal or not
        if(!(str1 + str2).equals(str2 + str1)){
            return "";
        }
        else{
            int gcdLength = gcd(str1.length(), str2.length());
            return str1.substring(0, gcdLength);
        }
    }

    private static int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, y % x);
    }
}
