class Board{
    private int  starting;
    private int end;
    private Dice dice;
    private HashMap<Integer,Integer> snakePosition;
    private HashMap<Integer,Integer> ladderPosition;
    private Queue<Player> playerChance;
    public Board(int starting,int end,Dice dice,HashMap<Integer,Integer> snakePosition,HashMap<Integer,Integer> ladderPosition,Queue<Player> playerChance){
        this.starting=starting;
        this.end=end;
        this.dice=dice;
        this.snakePosition=snakePosition;
        this.ladderPosition=ladderPosition;
        this.playerChance=playerChance;
    }
    public void game(){
        int i=0;
        while(i==0){
            Player p1 = playerChance.poll();
            int oldPosition =p1.getplayerPosition();
            int newPosition=oldPosition+dice.rollDice();
            if(newPosition==endpoint){
                System.out.println(p1.getplayName()+" "+ "Won the match");
                break;
            }
            else if(snakePosition.containsKey(newPosition)){
                newPosition = newPosition-snakePosition.get(newPosition);
                System.out.println(p1.getplayName()+" "+oldPosition+" "+newPosition);
                p1.setplayerPosition(newPosition);
            }
            else if (ladderPosition.containsKey(newPosition)){
                newPosition=newPosition+ladderPosition.get(newPosition);
                System.out.println(p1.getplayName()+" "+oldPosition+" "+newPosition);
                p1.setplayerPosition(newPosition);
            }
            else if (newPosition>endpoint){
                System.out.println(p1.getplayName()+"try again");                
            }
            else{
                System.out.println(p1.getplayName()+" "+oldPosition+" "+newPosition);
                p1.setplayerPosition(newPosition);
            }
            players.add(p1);
   
           
        }
    }
}
