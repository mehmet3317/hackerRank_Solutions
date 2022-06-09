import java.util.*;

public class Main {

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
        player.add(5);
        player.add(5);

        player.add(25);

       // player.add(50);
        player.add(50);

        player.add(120);

        List<Integer> result = new ArrayList<>();
        result = climbingLeaderboard(ranked, player);
        System.out.println(result);
        sort(ranked,player);

    }
        public static List<Integer> sort(List<Integer> ranked, List<Integer> player){
            ArrayList<Integer> ranklist = new ArrayList<>();
            Collections.sort(ranked);
            Collections.reverse(ranked);
            int cnt=0;
            int i=0;
            int counter=1;
            for(int a = 0; a<ranked.size(); a++){
                ranklist.add(counter);
                if(a==ranked.size()-1){
                     i = -1;
                }
                else if(ranked.get(a)!=ranked.get(a+1+i) ){
                    counter++;
                }
            }
            System.out.println(ranklist+"rankedlIST");
            return ranklist;
        }
        public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
            HashSet<Integer> set = new HashSet<Integer>();
            ArrayList<Integer> output = new ArrayList<>();
            ArrayList<Integer> ranklist = new ArrayList<>();
            int i=0;
            int a=0;
            for(int b = 0; b<player.size(); b++){
                ranked.add(player.get(b));
                ranklist= (ArrayList<Integer>) sort(ranked,player);
                System.out.println(ranked);

                for(int j = 0; j<ranked.size(); j++) {
                    if(j==ranked.size()-1){
                        System.out.println("nail lenn"+(ranked.size()-1) + j);
                        i--;
                        if(ranked.get(j) == player.get(b)){
                            output.add(ranklist.get(j));
                        }
                    }
                    if(ranked.get(j) == player.get(b) && ranked.get(j)!=ranked.get(j+1+i)){
                        System.out.println(ranked.get(j));
                        System.out.println(ranked.get(j+1+i));
                        System.out.println("rank:" + ranklist.get(j));
                        output.add(ranklist.get(j));
                        System.out.println(output);
                    }
                }
                i++;
            }
            return output;

        }

    }










