public class DetectCapital {
    public static void main(String[] args){
        String word = "fff";
        System.out.println(detectCapitalUse(word));
    }

    static boolean detectCapitalUse(String word){
        // intitializing the flag as so that flag++ when there is any lowercase come
        int flag = 0;
        int length = word.length();
        if(length == 1){
            return true;
        }

        for(int i = 0; i < word.length(); i++){
            if(!Character.isUpperCase(word.charAt(i))){
                flag++;
            }
        }
        if(flag == 0 || flag == word.length() - 1){
            return true;
        }
        else if(flag == 1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }
        else{
            return false;
        }
    }
}
