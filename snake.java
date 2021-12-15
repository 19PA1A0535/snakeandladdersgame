class Player{
    private int playerPosition;
    private String playerName;
    public Player(int playerPosition,String playerName){
        this.playerPosition=playerPosition;
        this.playerName=playerName;
    }
    public int getplayerPosition(){
        return playerPosition;
    }
    public String getplayName(){
        return playerName;
    }
    public void setplayerPosition(int value){
        playerPosition=value;
    }
}
