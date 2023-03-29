package SnakeAndLadder;

public class Game {
    Board board;
    Player[] players;
    int turn;
    boolean[] isAllowed;
    Coordinates[] positions;

    Game(Board board, Player[] players) {
        this.board = board;
        this.players = players;
        this.turn = 0;
        this.isAllowed = new boolean[players.length];
        this.positions = new Coordinates[players.length];

        for (int i = 0; i < positions.length; i++)
            this.positions[i] = new Coordinates(9, 0);
    }

    public void play() {
        while (true) {
            int num = Dice.roll();
            if (!isAllowed[turn]) {
                if (num == 1)
                    isAllowed[turn] = true;
                turn = (turn + 1) % players.length;
                continue;
            }
            Coordinates newCord = getNewCord(num);

            if (newCord.rn < 0) {
                System.out.println(players[turn].name + " has won..!!");
                return;
            }
            positions[turn] = newCord;
            turn = (turn + 1) % players.length;

        }
    }

    public Coordinates getNewCord(int num){
        int rn = positions[turn].rn , cn = positions[turn].cn;
        while(num--> 0){
            if(rn % 2 != 0){
                if(cn == 9) rn--;
                else cn++;
            }else{
                if(cn == 0) rn--;
                else cn--;
            }
        }
        if(rn < 0 ) return new Coordinates(rn, cn);
        if(checkIfThereIsJumper(board.board[rn][cn]))
    }

}
