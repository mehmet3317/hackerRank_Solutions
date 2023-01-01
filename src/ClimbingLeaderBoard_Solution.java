import java.util.*;

public class ClimbingLeaderBoard_Solution {

    public static void main(String[] args) {
        List<Integer> ranked = new ArrayList<>();
        ranked.add(100);
        ranked.add(100);
        ranked.add(50);
        ranked.add(40);
        ranked.add(40);
        ranked.add(20);
        ranked.add(10);

        List<Integer> player = new ArrayList<>();
        // player.add(5);
        player.add(5);
        player.add(25);
        player.add(50);
        player.add(120);
        climbingLeaderboard(ranked,player);
    }
    public static void climbingLeaderboard(List < Integer > ranked, List < Integer > player) {
        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(ranked);
        ranked.clear();
        ranked.addAll(set);
        ArrayList<Integer> outputList = new ArrayList<>();

         outer:   for(int a=0; a<player.size(); a++){
        inner: for( int k = ranked.size()-1; k>0; k--){
                 if(player.get(a) < ranked.get(k)) {
                     outputList.add(k+2);
                     break inner;
                }
                 else if(player.get(a) > ranked.get(k)){
                    if(k==1){
                        outputList.add(k);
                        break outer;
                    }
                     continue;
                 }
                 else if(player.get(a) == ranked.get(k)){
                     outputList.add(k+1);
                     break inner;                 }
            }
        }

        System.out.println(set);
        System.out.println(outputList);


//        ArrayList<Integer> outputList = new ArrayList<>();
//        TreeSet<Integer> setList = new TreeSet<Integer>(ranked);
//        int position;
//        for(int i=0; i<player.size(); i++){
//            setList.add(player.get(i));
//            position = setList.headSet(player.get(i)).size();
//            int pos2= setList.size()-position;
//            outputList.add(pos2);
//        }
//        System.out.println(outputList);
//    }
    }
}




