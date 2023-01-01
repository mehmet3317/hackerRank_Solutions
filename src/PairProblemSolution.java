import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairProblemSolution {

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
        List<Integer> second = new ArrayList<>();
        // player.add(5);
        player.add(5);
        player.add(7);
        player.add(9);
        player.add(13);
        player.add(11);
        player.add(6);
        player.add(6);
        player.add(3);
        player.add(3);
        int target=12;
        Set<Set<Integer>> paired = new HashSet<>();
        for(int i=0; i<player.size(); i++){
            for(int j=i+1; j<player.size()-1; j++){
                if(player.get(i)+player.get(j)==target){
                    Set<Integer> pairs = new HashSet<>();
                    pairs.add(player.get(i));
                    pairs.add(player.get(j));
                    paired.add(pairs);
                }
            }

        }
        System.out.println(paired);
        System.out.println(paired.size());
    }


}
