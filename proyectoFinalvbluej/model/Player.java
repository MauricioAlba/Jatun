package model;
import java.util.ArrayList;

public class Player{
    private String name;
    private ArrayList<UnoCard> cardsPlayer;
    private boolean status;
    public Player(String name,ArrayList cardsPlayer){
        this.name=name;
        this.cardsPlayer= cardsPlayer;
        status = false;
    }
    @Override
    public String toString(){
        return name;
    }
    public String getName(){
        return name;
    }
    @Override
    public boolean equals(Object o){
        boolean res = false;
        if(o instanceof Player){
            Player p = (Player)o;
            if(p.getName().equals(name)){
                res = true;
            }
        }
        return res;
    }
    public ArrayList<UnoCard> getCardsPlayer(){
        return cardsPlayer;
    }
    public void setCardsPlayer(UnoCard newCard){
        cardsPlayer.add(newCard);
    }
    public void dejarCard(UnoCard newCard){
        for(int pos = 0; pos<cardsPlayer.size();pos++){
            if(newCard.equals(cardsPlayer.get(pos))){
                cardsPlayer.remove(pos);    
            }
        }
    }
    public void setStatus(){
        status = true;
    }
    public boolean getStatus(){
        return status;
    }
}
