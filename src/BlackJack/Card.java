package BlackJack;

public class Card {
    int value;
    private String symbol;
    private String color;

    public Card(int value, String symbol, String color){
        setValue(value);
        setSymbol(symbol);
        setColor(color);
    }
    public Card(String symbol){
        setSymbol(symbol);
    }
    public Card(){

    }





    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if(getValue() == 1){
            return "Ace of " + getSymbol();
        }else{
            return getValue() + " of " + getSymbol();
        }
    }
}
