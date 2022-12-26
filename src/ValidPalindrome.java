public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(s);
        System.out.println(result);
    }

    static boolean isPalindrome(String s){
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();   // [^A-Za-z0-9] is user in "regex" position when we don't know the input
        // or you can say character other than A-Z, a-z, 0-9 are removed/replaced
        boolean flag = true;
        int start = 0;
        int end = actual.length() - 1;
        while(start < end){
            if(actual.charAt(start) != actual.charAt(end)){
                flag = false;
                break;
            }else{
                start++;
                end--;
            }
        }
        return flag;
    }
}
