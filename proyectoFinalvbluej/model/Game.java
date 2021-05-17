package model;

import java.awt.*;
import java.util.ArrayList;

public class Game implements UnoGame {
    private static final Color[] COLORS={Color.BLUE,Color.RED,Color.YELLOW,Color.GREEN};
    private static final String[] VALUE={"0","1","2","3","4","5","6","7","8","9","R","C","+2"};
    private ArrayList<UnoCard> cards;
    private ArrayList<Player> listPlayers;
    private Player currentPlayer;
    private UnoCard currentCard;
    private int direction;
    public Game(){
        cards= new ArrayList<>();
        listPlayers= new ArrayList<>();
        armarMaso();
        agregarPlayer();
        direction = 1;
    }

    private void armarMaso(){
        int numCard=4;
        int aux=0;
        for(int pos = 0; pos<96; pos++){
            if(aux!=11){
                numCard--;
                int numCol = 0;
                cards.add(new Card(COLORS[numCol],VALUE[aux]));
                numCol++;
                if(numCol==4){
                    numCol=0;
                }
                if(numCard==0){
                    aux++;
                    numCard=8;
                    if(aux==11){
                        numCard=4;
                    }
                }
            }else{
                numCard--;
                cards.add(new Card(Color.BLACK,VALUE[aux]));
                if(numCard==0){
                    aux++;
                    numCard=8;
                }
            }
        }
        shuffle();
        setCurrentCard();
    }

    private void setCurrentCard(){
        currentCard = cards.get(cards.size()-1);
        cards.remove(cards.size()-1);
    }

    public void agregarPlayer(){
        listPlayers.add(new Player("Jugador1", getArrayListPlayer()));
        listPlayers.add(new Player("Jugador2", getArrayListPlayer()));
        listPlayers.add(new Player("Jugador3", getArrayListPlayer()));
        listPlayers.add(new Player("Jugador4", getArrayListPlayer()));
        setcurrentPlayer();
    }

    private void setcurrentPlayer(){
        currentPlayer = listPlayers.get(0);
    }

    private ArrayList<UnoCard> getArrayListPlayer(){
        ArrayList<UnoCard> aux= new ArrayList<>();
        for(int pos = 1; pos<=5; pos++){
            aux.add(cards.get(cards.size()-pos));
            cards.remove(cards.size()-pos);
        }
        return aux;
    }

    @Override
    public Player whoWin() {
        Player res = null;
        for(int posPlayer = 0; posPlayer<listPlayers.size();posPlayer++){
            Player playerAct = listPlayers.get(posPlayer);
            ArrayList<UnoCard> aux = getCardsCurrentPlayer();
            int numCartas = aux.size();
            if(numCartas==0){
                res = playerAct;
            }
        }
        return res;
    }

    @Override
    public ArrayList<UnoCard> getCardsCurrentPlayer() {
        Player actual = getCurrentTurn();
        ArrayList<UnoCard> cardsPlayerAct = actual.getCardsPlayer();
        return cardsPlayerAct;
    }

    @Override
    public ArrayList<Player> getPlayers() {
        return listPlayers;
    }

    @Override
    public UnoCard getCurrentCard() {
        return currentCard;
    }

    @Override
    public Player getCurrentTurn() {
        return currentPlayer;
    }

    @Override
    public boolean dropCard(UnoCard card) {
        Color cardColRec = card.getColor();
        String cardValRec = card.getValue();
        Color cardColCurrent = currentCard.getColor();
        String cardValCurrent = currentCard.getValue();
        boolean res = false;
        if(cardColRec.equals(cardColCurrent)||cardValRec.equals(cardValCurrent)||cardValRec.equals("C")){
            int rd = (int)(Math.random()*(cards.size()-1)+1);
            cards.add(rd, currentCard);
            currentCard = card;
            res = true;
            currentPlayer.dejarCard(card);
            if(cardValRec.equals("C")){
                if(direction==1){
                    direction = 0;
                }else{

                    direction =1;
                }
            }
        }
        return res;
    }

    @Override
    public void loadCard() {
        currentPlayer.setCardsPlayer(cards.get(cards.size()-1));
        cards.remove(cards.size()-1);
        currentPlayer.setStatus();
    }

    @Override
    public boolean nextTurn() {
        boolean res = currentPlayer.getStatus();
        return res;
    }

    @Override
    public int sizeDeck() {
        return cards.size();
    }

    /*
     * 0 -> Izquierda
     * 1 -> Derecha
     */
    @Override
    public int getDirection() {
        return direction;
    }

    @Override
    public void shuffle() {
        for(int pos = 0; pos<cards.size(); pos++){
            int rd = (int)(Math.random()*(cards.size()-1)+1);
            UnoCard cardAct = cards.get(pos);
            UnoCard cardRandom = cards.get(rd);
            cards.remove(pos);
            cards.add(pos,cardRandom);
            cards.remove(rd);
            cards.add(rd, cardAct);
        }
    }
}
