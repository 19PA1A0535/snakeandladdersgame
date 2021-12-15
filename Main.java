import java.util.*;
class Main{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int end=sc.nextInt();
        sc.nextLine();
        System.out.println("enter no of snakes");
        HashMap<Integer,Integer> a =new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String [] s1=sc.nextLine().split(" ");
            a.put(Integer.parseInt(s1[0]),Integer.parseInt(s1[1]));
        }
        System.out.println("enter no of ladders");
        HashMap<Integer,Integer> a1 =new HashMap<>();
        int n1 = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n1;i++){
            String [] s2=sc.nextLine().split(" ");
            a1.put(Integer.parseInt(s2[0]),Integer.parseInt(s2[1]));
        }
        System.out.println("enter no of players");
        Queue<Player> playerChance = new LinkedList<>();
        int psize=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<psize;i++){
            String name = sc.nextLine();
            Player p2=new Player(0,name);
            playerChance.add(p2);
        }
        Dice dice=new Dice();
        Board b = new Board(1,end,dice,a,a1,players);
        b.game();
        }
}
