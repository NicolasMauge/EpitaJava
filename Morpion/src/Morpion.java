public class Morpion {

    public static final int TABLE_SIZE = 3;

    /**
     * Affiche le plateau de jeu
     * @param board état du plateau de jeu
     */
    public void drawBoard(int[][] board) {
        String ligne = "";
        System.out.println("|---|---|---|");

        for(int j = 0; j< TABLE_SIZE; j++) {
            ligne = "| ";
            for (int i = 0; i < TABLE_SIZE; i++) {
                ligne += String.valueOf(board[j][i]) + " | ";
            }
            System.out.println(ligne);
            System.out.println("|---|---|---|");
        }
    }

    /**
     * initialisation du plateau de jeu avec des zéros
     * @param board plateau de jeu non initialisé
     * @return le plateau de jeu
     */
    public int[][] initBoard(int[][] board){
        for(int i = 0; i< TABLE_SIZE; i++) {
            for(int j = 0; j< TABLE_SIZE; j++) {
                board[i][j] = 0;
            }
        }
        return board;
    }

    /**
     * est-ce qu'il y a un joueur qui a gagné ?
     * @param board le plateau de jeu
     * @return un boolean pour savoir si une combinaison est gagnante
     */
    public Boolean isWinning(int[][] board) {
        // une ligne gagnante
        for(int i = 0; i< TABLE_SIZE; i++) {
            if((board[i][0] == board[i][1]) && (board[i][1] == board[i][2]) && (board[i][0] != 0)) {
                return true;
            }
        }

        // une colonne gagnante
        for(int i = 0; i< TABLE_SIZE; i++) {
            if((board[0][i] == board[1][i]) && (board[1][i] == board[2][i]) && (board[0][i] != 0)) {
                return true;
            }
        }

        // diagonale
        if((board[0][0] == board[1][1]) && (board[1][1] == board[2][2]) && (board[1][1] != 0)) {
            return true;
        }

        if((board[2][0] == board[1][1]) && (board[1][1] == board[0][2]) && (board[1][1] != 0)) {
            return true;
        }
        return false;
    }
}
