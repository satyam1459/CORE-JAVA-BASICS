import java.util.*;

public class highestFreqCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        HashMap<Character,Integer> hm=new HashMap<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(hm.containsKey(ch)){
                int of=hm.get(ch);          //Old frequency
                int nf=of+1;                //New Frequency
                hm.put(ch,nf);
            }
            else{
                hm.put(ch,1);
            }
        }

        char mfc=str.charAt(0);
        for(Character key : hm.keySet()){
            if(hm.get(key) > hm.get(mfc))
                mfc=key;
        }
        System.out.println("Max freq character :"+mfc);

        System.out.println("Max freq character frequency :"+hm.get(mfc));
    }
}
