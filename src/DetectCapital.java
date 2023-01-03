public class DetectCapital {
    public static void main(String[] args){
        String word = "fff";
        System.out.println(detectCapitalUse(word));
    }

    static boolean detectCapitalUse(String word){
        int length = word.length();

        if(length == 0 || length == 1){
            return true;
        }

        if(Character.isUpperCase(word.charAt(0))){
            boolean isFirstCapital = Character.isUpperCase(word.charAt(1));
            for(int i = 2; i < length; i++) {
                boolean isOtherCapital = Character.isUpperCase(word.charAt(i));
                if(isFirstCapital != isOtherCapital){
                    return false;
                }
            }
        }
        else{
            for(int i = 1; i < length; i++){
                if(Character.isUpperCase(word.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }
}
