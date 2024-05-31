public class MiniCharacter {
    public static void main(String[] args) {
        char c =  getMiniCharacter("kel");
        System.out.println(c);

    }

    public static char getMiniCharacter(String str){
        return getMiniCharacter(str,str.charAt(0));

    }

    private static char getMiniCharacter(String str,char minChar ){
        if(str.isEmpty() ){
            return minChar ;
        }
        if( str.charAt(0) < minChar  ){
            minChar = str.charAt(0);
        }
        return getMiniCharacter(str.substring(1), minChar);

    }
}
