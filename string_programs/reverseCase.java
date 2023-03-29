package string_programs;

class reverseCase{
    public static void main(String[] ar){
        String s="nO TO cRACKERS";
        String reverse="";
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i)))
                reverse=reverse+Character.toLowerCase(s.charAt(i));
            else 
                reverse=reverse+Character.toUpperCase(s.charAt(i));
        }
        System.out.println(reverse);
        
    }
}