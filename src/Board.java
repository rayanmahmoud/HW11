import java.util.Arrays;

public class Board {
    private Tile[][] tiles;
    private String[] Dimention;
    public Board(String Board) {
        int i=0;
        int j=0;
        this.Dimention = Board.split("");
        while (i!=this.Dimention.length){
            while(this.Dimention[j]!='|'){
                
            }
        }
    }




    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Board)) {
            return false;
        }
        Board board = (Board) other;
        return Arrays.deepEquals(tiles, board.tiles);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(tiles);
    }
}
