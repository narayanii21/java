public class newcode {
    public static void main(String[] args) {
    String str ="hello";
    String newStr ="";
    
    for(int i=0; i<str.length();i++){
        char c =str.charAt(i);
        if (newStr.indexof(c)==-1){
            newStr+=c;
        }
    }
    }
    System.out.println("String after removing duplicates:"  + newStr);
}
