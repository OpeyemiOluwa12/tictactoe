package com.example.git.tictactoe;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button tile1, tile2, tile3, tile4, tile5, tile6, tile7, tile8, tile9;
    int player = 0;
    int playerX = 0;
    int playerO = 0;
    int round = 1;
    TextView turn;
    String value;
    String computerWin;
    String youWin;
    Boolean win = Boolean.FALSE;
    String computerTurn = "Computer's Turn";
    String yourTurn = "Your Turn";
    String playerXTurn = "PlayerX's Turn";
    String playerOTurn = "PlayerO's Turn";

    /**
     * @param savedInstanceState first method to be instantiated when the app runs
     *                           instantiated the tiles to to get resource value
     *                           also got type of player value from the previous page using intent
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView computer = findViewById(R.id.computer);
        TextView you = findViewById(R.id.you);

        tile1 = findViewById(R.id.tile1);
        tile2 = findViewById(R.id.tile2);
        tile3 = findViewById(R.id.tile3);
        tile4 = findViewById(R.id.tile4);
        tile5 = findViewById(R.id.tile5);
        tile6 = findViewById(R.id.tile6);
        tile7 = findViewById(R.id.tile7);
        tile8 = findViewById(R.id.tile8);
        tile9 = findViewById(R.id.tile9);
        turn = findViewById(R.id.turn);
        Intent intent = getIntent();
        value = intent.getStringExtra("player");
        if (value.equals("With Computer")) {
            turn.setText(yourTurn);
            youWin = "You won this Round";
            computerWin = "Computer won this Round";
            you.setText("YOU X");
            computer.setText("COMPUTER O");
        } else {
            turn.setText(playerXTurn);
            youWin = "Player X won this Round";
            computerWin = "Player O won this Round";
        }
    }

    /**
     * @param view this method determines what will appear on the screen when each tiles are clicked
     *             includes setting the players value either x or o
     *             checking the result
     *             from tile1 to tile 9
     */
    public void tile1(View view) {
        if (tile1.getText().toString().equals("")) {
            switch (value) {
                case "With Computer":
                    tile1.setText("X");
                    tile1.setTextColor(Color.BLUE);
                    resultX();
                    turn.setText(computerTurn);
                    withComputer();
                    result();
                    turn.setText(yourTurn);
                    break;
                case "2 Players":
                    if (player == 0) {
                        tile1.setText("X");
                        tile1.setTextColor(Color.BLUE);
                        player = 1;
                        resultX();
                        turn.setText(playerOTurn);
                    } else {
                        tile1.setText("O");
                        tile1.setTextColor(Color.RED);
                        player = 0;
                        result();
                        turn.setText(playerXTurn);
                    }
            }
        }
    }

    public void tile2(View view) {
        if (tile2.getText().toString().equals("")) {
            switch (value) {
                case "With Computer":
                    tile2.setText("X");
                    tile2.setTextColor(Color.BLUE);
                    resultX();
                    turn.setText(computerTurn);
                    withComputer();
                    result();
                    turn.setText(yourTurn);
                    break;
                case "2 Players":
                    if (player == 0) {
                        tile2.setText("X");
                        tile2.setTextColor(Color.BLUE);
                        player = 1;
                        resultX();
                        turn.setText(playerOTurn);
                    } else {
                        tile2.setText("O");
                        tile2.setTextColor(Color.RED);
                        player = 0;
                        result();
                        turn.setText(playerXTurn);
                    }
            }
        }
    }

    public void tile3(View view) {
        if (tile3.getText().toString().equals("")) {
            switch (value) {
                case "With Computer":
                    tile3.setText("X");
                    tile3.setTextColor(Color.BLUE);
                    resultX();
                    turn.setText(computerTurn);
                    withComputer();
                    result();
                    turn.setText(yourTurn);
                    ;
                case "2 Players":
                    if (player == 0) {
                        tile3.setText("X");
                        tile3.setTextColor(Color.BLUE);
                        player = 1;
                        resultX();
                        turn.setText(playerOTurn);
                    } else {
                        tile3.setText("O");
                        tile3.setTextColor(Color.RED);
                        player = 0;
                        result();
                        turn.setText(playerXTurn);
                    }
            }
        }
    }

    public void tile4(View view) {
        if (tile4.getText().toString().equals("")) {
            switch (value) {
                case "With Computer":
                    tile4.setText("X");
                    tile4.setTextColor(Color.BLUE);
                    resultX();
                    turn.setText(computerTurn);
                    withComputer();
                    result();
                    turn.setText(yourTurn);
                    break;
                case "2 Players":
                    if (player == 0) {
                        tile4.setText("X");
                        tile4.setTextColor(Color.BLUE);
                        player = 1;
                        resultX();
                        turn.setText(playerOTurn);
                    } else {
                        tile4.setText("O");
                        tile4.setTextColor(Color.RED);
                        player = 0;
                        result();
                        turn.setText(playerXTurn);
                    }
            }
        }
    }

    public void tile5(View view) {
        if (tile5.getText().toString().equals("")) {
            switch (value) {
                case "With Computer":
                    tile5.setText("X");
                    tile5.setTextColor(Color.BLUE);
                    resultX();
                    turn.setText(computerTurn);
                    withComputer();
                    result();
                    turn.setText(yourTurn);
                    break;
                case "2 Players":
                    if (player == 0) {
                        tile5.setText("X");
                        tile5.setTextColor(Color.BLUE);
                        player = 1;
                        resultX();
                        turn.setText(playerOTurn);
                    } else {
                        tile5.setText("O");
                        tile5.setTextColor(Color.RED);
                        player = 0;
                        result();
                        turn.setText(playerXTurn);
                    }
            }
        }
    }

    public void tile6(View view) {
        if (tile6.getText().toString().equals("")) {
            switch (value) {
                case "With Computer":
                    tile6.setText("X");
                    tile6.setTextColor(Color.BLUE);
                    resultX();
                    turn.setText(computerTurn);
                    withComputer();
                    result();
                    turn.setText(yourTurn);
                    break;
                case "2 Players":
                    if (player == 0) {
                        tile6.setText("X");
                        tile6.setTextColor(Color.BLUE);
                        player = 1;
                        resultX();
                        turn.setText(playerOTurn);
                    } else {
                        tile6.setText("O");
                        tile6.setTextColor(Color.RED);
                        player = 0;
                        result();
                        turn.setText(playerXTurn);
                    }
            }
        }
    }

    public void tile7(View view) {
        if (tile7.getText().toString().equals("")) {
            switch (value) {
                case "With Computer":
                    tile7.setText("X");
                    tile7.setTextColor(Color.BLUE);
                    resultX();
                    turn.setText(computerTurn);
                    withComputer();
                    result();
                    turn.setText(yourTurn);
                    break;
                case "2 Players":
                    if (player == 0) {
                        tile7.setText("X");
                        tile7.setTextColor(Color.BLUE);
                        player = 1;
                        resultX();
                        turn.setText(playerXTurn);
                    } else {
                        tile7.setText("O");
                        tile7.setTextColor(Color.RED);
                        player = 0;
                        result();
                    }
            }
        }
    }

    public void tile8(View view) {
        if (tile8.getText().toString().equals("")) {
            switch (value) {
                case "With Computer":
                    tile8.setText("X");
                    tile8.setTextColor(Color.BLUE);
                    resultX();
                    turn.setText(computerTurn);
                    withComputer();
                    result();
                    turn.setText(yourTurn);
                    turn.setText(playerOTurn);
                    break;
                case "2 Players":
                    if (player == 0) {
                        tile8.setText("X");
                        tile8.setTextColor(Color.BLUE);
                        player = 1;
                        resultX();
                    } else {
                        tile8.setText("O");
                        tile8.setTextColor(Color.RED);
                        player = 0;
                        result();
                        turn.setText(playerXTurn);
                    }
            }
        }
    }

    public void tile9(View view) {
        if (tile9.getText().toString().equals("")) {
            switch (value) {
                case "With Computer":
                    tile9.setText("X");
                    tile9.setTextColor(Color.BLUE);
                    resultX();
                    turn.setText(computerTurn);
                    withComputer();
                    result();
                    turn.setText(yourTurn);
                    break;
                case "2 Players":
                    if (player == 0) {
                        tile9.setText("X");
                        tile9.setTextColor(Color.BLUE);
                        player = 1;
                        resultX();
                        turn.setText(playerOTurn);
                    } else {
                        tile9.setText("O");
                        tile9.setTextColor(Color.RED);
                        player = 0;
                        result();
                        turn.setText(playerXTurn);
                    }
            }
        }
    }

    /**
     * this method checks if three tiles have the same value x, vertically horizontally or diagonally
     * if it does then it displays a toast to declare player x as the winner of the round.
     * it calls the method that add player x's score
     */
    public void resultX() {
        if (tile1.getText().toString().equals("X") && tile2.getText().toString().equals("X") && tile3.getText().toString().equals("X")) {
            tile1.setTextColor(Color.BLACK);
            tile2.setTextColor(Color.BLACK);
            tile3.setTextColor(Color.BLACK);
            Toast.makeText(this, youWin, Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerXScore();
        } else if (tile4.getText().toString().equals("X") && tile5.getText().toString().equals("X") && tile6.getText().toString().equals("X")) {
            tile4.setTextColor(Color.BLACK);
            tile5.setTextColor(Color.BLACK);
            tile6.setTextColor(Color.BLACK);
            Toast.makeText(this, youWin, Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerXScore();
        } else if (tile7.getText().toString().equals("X") && tile8.getText().toString().equals("X") && tile9.getText().toString().equals("X")) {
            tile7.setTextColor(Color.BLACK);
            tile8.setTextColor(Color.BLACK);
            tile9.setTextColor(Color.BLACK);
            Toast.makeText(this, youWin, Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerXScore();
        } else if (tile1.getText().toString().equals("X") && tile4.getText().toString().equals("X") && tile7.getText().toString().equals("X")) {
            tile1.setTextColor(Color.BLACK);
            tile4.setTextColor(Color.BLACK);
            tile7.setTextColor(Color.BLACK);
            Toast.makeText(this, youWin, Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerXScore();
        } else if (tile2.getText().toString().equals("X") && tile5.getText().toString().equals("X") && tile8.getText().toString().equals("X")) {
            tile2.setTextColor(Color.BLACK);
            tile5.setTextColor(Color.BLACK);
            tile8.setTextColor(Color.BLACK);
            Toast.makeText(this, youWin, Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerXScore();
        } else if (tile3.getText().toString().equals("X") && tile6.getText().toString().equals("X") && tile9.getText().toString().equals("X")) {
            tile3.setTextColor(Color.BLACK);
            tile6.setTextColor(Color.BLACK);
            tile9.setTextColor(Color.BLACK);
            Toast.makeText(this, youWin, Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerXScore();
        } else if (tile1.getText().toString().equals("X") && tile5.getText().toString().equals("X") && tile9.getText().toString().equals("X")) {
            tile1.setTextColor(Color.BLACK);
            tile5.setTextColor(Color.BLACK);
            tile9.setTextColor(Color.BLACK);
            Toast.makeText(this, youWin, Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerXScore();
        } else if (tile3.getText().toString().equals("X") && tile5.getText().toString().equals("X") && tile7.getText().toString().equals("X")) {
            tile3.setTextColor(Color.BLACK);
            tile5.setTextColor(Color.BLACK);
            tile7.setTextColor(Color.BLACK);
            Toast.makeText(this, youWin, Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerXScore();
        }
        if (win) {
            tile1.setEnabled(false);
            tile2.setEnabled(false);
            tile3.setEnabled(false);
            tile4.setEnabled(false);
            tile5.setEnabled(false);
            tile6.setEnabled(false);
            tile7.setEnabled(false);
            tile8.setEnabled(false);
            tile9.setEnabled(false);
        }
    }

    /**
     * this method checks if three tiles have the same value o, vertically horizontally or diagonally
     * if it does then it displays a toast to declare player o as the winner of the round.
     * it calls the method that add player o's score
     */
    public void result() {
        if (tile1.getText().toString().equals("O") && tile4.getText().toString().equals("O") && tile7.getText().toString().equals("O")) {
            tile1.setTextColor(Color.BLACK);
            tile4.setTextColor(Color.BLACK);
            tile7.setTextColor(Color.BLACK);
            Toast.makeText(this, computerWin, Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerOScore();
        } else if (tile2.getText().toString().equals("O") && tile5.getText().toString().equals("O") && tile8.getText().toString().equals("O")) {
            tile2.setTextColor(Color.BLACK);
            tile5.setTextColor(Color.BLACK);
            tile8.setTextColor(Color.BLACK);
            Toast.makeText(this, computerWin, Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerOScore();
        } else if (tile3.getText().toString().equals("O") && tile6.getText().toString().equals("O") && tile9.getText().toString().equals("O")) {
            tile3.setTextColor(Color.BLACK);
            tile6.setTextColor(Color.BLACK);
            tile9.setTextColor(Color.BLACK);
            Toast.makeText(this, computerWin, Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerOScore();
        } else if (tile1.getText().toString().equals("O") && tile2.getText().toString().equals("O") && tile3.getText().toString().equals("O")) {
            tile1.setTextColor(Color.BLACK);
            tile2.setTextColor(Color.BLACK);
            tile3.setTextColor(Color.BLACK);
            Toast.makeText(this, computerWin, Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerOScore();
        } else if (tile4.getText().toString().equals("O") && tile5.getText().toString().equals("O") && tile6.getText().toString().equals("O")) {
            tile4.setTextColor(Color.BLACK);
            tile5.setTextColor(Color.BLACK);
            tile6.setTextColor(Color.BLACK);
            Toast.makeText(this, computerWin, Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerOScore();
        } else if (tile7.getText().toString().equals("O") && tile8.getText().toString().equals("O") && tile9.getText().toString().equals("O")) {
            tile7.setTextColor(Color.BLACK);
            tile8.setTextColor(Color.BLACK);
            tile9.setTextColor(Color.BLACK);
            Toast.makeText(this, computerWin, Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerOScore();
        } else if (tile1.getText().toString().equals("O") && tile5.getText().toString().equals("O") && tile9.getText().toString().equals("O")) {
            tile1.setTextColor(Color.BLACK);
            tile5.setTextColor(Color.BLACK);
            tile9.setTextColor(Color.BLACK);
            Toast.makeText(this, computerWin, Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerOScore();
        } else if (tile3.getText().toString().equals("O") && tile5.getText().toString().equals("O") && tile7.getText().toString().equals("O")) {
            tile3.setTextColor(Color.BLACK);
            tile5.setTextColor(Color.BLACK);
            tile7.setTextColor(Color.BLACK);
            Toast.makeText(this, computerWin, Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerOScore();
        }

        if (win) {
            tile1.setEnabled(false);
            tile2.setEnabled(false);
            tile3.setEnabled(false);
            tile4.setEnabled(false);
            tile5.setEnabled(false);
            tile6.setEnabled(false);
            tile7.setEnabled(false);
            tile8.setEnabled(false);
            tile9.setEnabled(false);
        }
    }


    /**
     * @param view calls the resetBoard()
     */
    public void reset(View view) {
        resetBoard();
    }

    /**
     * this method resets the board only
     * the game moves to the next round
     */
    public void resetBoard() {
        round();
        tile1.setText("");
        tile2.setText("");
        tile3.setText("");
        tile4.setText("");
        tile5.setText("");
        tile6.setText("");
        tile7.setText("");
        tile8.setText("");
        tile9.setText("");

        tile1.setEnabled(true);
        tile2.setEnabled(true);
        tile3.setEnabled(true);
        tile4.setEnabled(true);
        tile5.setEnabled(true);
        tile6.setEnabled(true);
        tile7.setEnabled(true);
        tile8.setEnabled(true);
        tile9.setEnabled(true);
        win = Boolean.FALSE;
    }

    /**
     * @param view this method resets the whole game. include the board and the score counter
     */
    public void gameReset(View view) {
        resetBoard();
        playerX = 0;
        playerO = 0;
        round = 0;
        TextView player1Score = findViewById(R.id.player1Score);
        player1Score.setText(String.valueOf(playerX));
        TextView player2Score = findViewById(R.id.player2Score);
        player2Score.setText(String.valueOf(playerO));
        TextView roundView = findViewById(R.id.round);
        roundView.setText("Round " + String.valueOf(round));
    }

    /**
     * this method changes the game to the next round
     */
    public void round() {
        round = round + 1;
        TextView roundView = findViewById(R.id.round);
        roundView.setText("Round " + String.valueOf(round));
    }

    /**
     * calculates playerX score
     */
    public void playerXScore() {
        playerX = playerX + 1;
        TextView player1Score = findViewById(R.id.player1Score);
        player1Score.setText(String.valueOf(playerX));
    }

    /**
     * calculates playerO score
     */

    public void playerOScore() {
        playerO = playerO + 1;
        TextView player2Score = findViewById(R.id.player2Score);
        player2Score.setText(String.valueOf(playerO));
    }

    /**
     * this method determines what the computer should play
     */
    public void withComputer() {

        if (tile1.getText().toString().equals("")) {
            tile1.setText("O");
            tile1.setTextColor(Color.RED);
        } else if (tile5.getText().toString().equals("")) {
            tile5.setText("O");
            tile5.setTextColor(Color.RED);
        } else if (tile9.getText().toString().equals("")) {
            tile9.setText("O");
            tile9.setTextColor(Color.RED);
        } else if (tile3.getText().toString().equals("")) {
            tile3.setText("O");
            tile3.setTextColor(Color.RED);
        } else if (tile7.getText().toString().equals("")) {
            tile7.setText("O");
            tile7.setTextColor(Color.RED);
        } else if (tile2.getText().toString().equals("")) {
            tile2.setText("O");
            tile2.setTextColor(Color.RED);
        } else if (tile8.getText().toString().equals("")) {
            tile8.setText("O");
            tile8.setTextColor(Color.RED);
        } else if (tile4.getText().toString().equals("")) {
            tile4.setText("O");
            tile4.setTextColor(Color.RED);
        } else if (tile6.getText().toString().equals("")) {
            tile6.setText("O");
            tile6.setTextColor(Color.RED);
        }
    }

}
