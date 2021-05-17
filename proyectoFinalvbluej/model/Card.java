package model;

import java.awt.*;

public class Card implements UnoCard{
    private Color color;
    private String value;
    public Card(Color color, String value){
        this.color = color;
        this.value = value;
    }
    @Override
    public String getValue() {
        return value+"";
    }

    @Override
    public Color getColor() {
        return color;
    }
}
