import java.util.*;


public class SolutionReverseList {
    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 0));
        List<List<Integer>> operations = new ArrayList<>();
        operations.add(Arrays.asList(0, 9));
        operations.add(Arrays.asList(4, 5));
        operations.add(Arrays.asList(3, 6));
        operations.add(Arrays.asList(2, 7));
        operations.add(Arrays.asList(1, 8));
        operations.add(Arrays.asList(0, 9));
        for (int i=0;i<operations.size();i++){
            List<Integer> newList = new ArrayList<>(listA.subList(operations.get(i).get(0),operations.get(i).get(1)+1));
            Collections.reverse(newList);
            if(newList.size()==listA.size()){
                System.out.println(newList);
                listA.clear();
                listA.addAll(newList);
            }
            else {
                List<Integer> left = new ArrayList<>(listA.subList(0, operations.get(i).get(0)));
                List<Integer> right = new ArrayList<>(listA.subList(operations.get(i).get(1)+1, listA.size()));
                listA.clear();
                listA.addAll(left);
                listA.addAll(newList);
                listA.addAll(right);
                System.out.println(listA);
            }
        }
    }
}

//        Collections.sort(arr);
//        int answer = 0;
//        int i = 0, j = i+1;
//        for(i = 0; i < arr.size()-1; i++){
//            while(j<arr.size()){
//                int fir = arr.get(i);
//                int sec = arr.get(j);
//                if(sec + fir == k){
//                    answer++;
//                }else if(sec + fir > k){
//                    break;
//                }
//                j++;
//            }
//        }
//        return answer;



//        int toplam = 0;
//        int min=0;
//        int tplm = 0;
//        String sYarim;
//        String sagYarim;
//        Set<Character> list=new HashSet<>();
//        for (int i = w.length()-1; i >= 1; i--) {
//            for (int y = w.length() - 2; y >= 1; y--) {
//                if(Character.compare(w.charAt(y),w.charAt(i))>0){
//                    sYarim=w.substring(0,y);
//                    sYarim+=w.charAt(w.length()-1);
//                }
//                else {
//                    char cHar[]=w.toCharArray();
//                    Arrays.sort(cHar);
//                    char mm;
//                    for (int x=0; x< cHar.length;x++){
//                        if(cHar[x]>w.charAt(0)){
//                            mm=cHar[x];
//                            break;
//                        }
//                    }
//                    cHar.
//                }
//            }
//
//        }
//        String son=
//        }




