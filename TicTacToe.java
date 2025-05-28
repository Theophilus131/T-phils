import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char player1 = 'X';
        char player2 = 'O';

        char[][] board = {
            {'1','2','3'},
            {'4','5','6'},
            {'7','8','9'}
        };

	while(true){
	System.out.println("\nTphils Tic Tac Toe Board Game:");
	
	for(int i = 0; i<3; i++){
		for(int j = 0; j< 3; j++){
		System.out.print(board[i][j] + " ");
						}
		System.out.println();
					}

	char play;
	int turn = 0;
	if(turn % 2 == 0){
	play = player1;
	}else{ play = player2;
		}

	int playerPick;
	boolean valid;	
	do{
		System.out.print("Player" + play + ", pick a number (1-9): ");
		playerPick = input.nextInt();
		if(playerPick < 1 || playerPick > 9){
			valid = false;
		}else {
			int row = (playerPick -1) / 3;
			int col = (playerPick -1) % 3;

			if(board[row][col] != player1 && board[row][col] != 					player2){ 
			valid = true;
			board[row][col] = play;
		}else {
			valid = false;
			System.out.println("Spot already taken by the other play. Try agian: ");   }
			}
			if(!valid && (playerPick >=1 && playerPick <= 9)){
				System.out.println("invalid pick :");
			}
			} while (!valid);



}



}
	}