/**
 * Created by pauline on 15/02/17.
 */
public class JavaDem<T> {

    int value;

    class Node<T> {
        T elem;

        Node(T elem) {
            this.elem = elem;
        }
    }

    public static void main(String[] args) {

    }

    public T exampleGenerics(T elem) {
        Node<T> node = new Node(elem);
        return node.elem;
    }


    public boolean size() {
        return (value == 0);
    }

    public void exampleConditional(int a, int b, int c, int d) {
        if (a < b) {
            a = b;
        } else {
            b = a;
        }
        c =d ;
    }

    public void exampleFormating(int a, int b, int c) {
        if (a < b)
            a = b;
        c = a;
    }

    /**
     * Validates a chess move.
     * <p>
     * Use {@link #doMove(int theFromFile, int theFromRank, int theToFile, int theToRank)} to move a piece.
     *
     * @param theFromFile file from which a piece is being moved
     * @param theFromRank rank from which a piece is being moved
     * @param theToFile   file to which a piece is being moved
     * @param theToRank   rank to which a piece is being moved
     * @return true if the move is valid, otherwise false
     */
    public boolean isValidMove(int theFromFile, int theFromRank, int theToFile, int theToRank) {
        // ...body
        return false;
    }

    /**
     * Moves a chess piece.
     *
     * @see java.math.RoundingMode
     */
    public void doMove(int theFromFile, int theFromRank, int theToFile, int theToRank) {
        // ...body
    }
}
