import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), x;
        List<Integer> myList = new ArrayList<>();
        for(int i = 0 ; i < n ; ++i) {
            x = in.nextInt();
            myList.addBack(x);
        }
        myList.removeBack();
        myList.removeBack();
        for(int i = 0 ; i < myList.size() ; ++i){
            System.out.println(myList.get(i));
        }
    }
}