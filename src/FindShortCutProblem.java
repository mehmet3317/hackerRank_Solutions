import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindShortCutProblem {

    public static void main(String[] args) {

        List<String> player = new ArrayList<>();
        player.add("ballendmill");
        player.add("keywaycutter");
        player.add("slotdrill");
        player.add("facemill");

        String key = "slotdrill";
        System.out.println(player);
        int startIndex = 0;
        int result=0;
        int result1=0;
        int result2=0;

        for(int i=0; i<player.size(); i++){
            if(player.get(i)==key){
                result1=player.size()-startIndex-i;
                result2=startIndex-i;
            }
        }
        if(result1<0){
            result1 = result1*-1;
        }
        if(result2<0){
            result2 = result2*-1;
        }
        if(result1<=result2){
            result = result1;
        }
        else if(result2<result1){
            result = result2;
        }
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println(result);
    }
}
