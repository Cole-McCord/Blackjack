package BlackJack;

public class FaceCard extends Card{
    private String face;

    @Override
    public void setValue(int value) {
        super.setValue(10);
    }

    public FaceCard(int value, String symbol, String color, String face){
        super(10, symbol, color);
        setFace(face);

    }



    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    @Override
    public String toString() {
        return getFace() + " of " + super.getSymbol();
    }
}
