package com.example.git.tictactoe;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    /**
     * to declare all global variables ;
     */
    Button tile1, tile2, tile3, tile4, tile5, tile6, tile7, tile8, tile9, tile10, tile11, tile12, tile13, tile14;
    Button tile15, tile16, tile17, tile18, tile19, tile20, tile21, tile22, tile23, tile24, tile25;
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
        setContentView(R.layout.activity_main2);
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
        tile10 = findViewById(R.id.tile10);
        tile11 = findViewById(R.id.tile11);
        tile12 = findViewById(R.id.tile12);
        tile13 = findViewById(R.id.tile13);
        tile14 = findViewById(R.id.tile14);
        tile15 = findViewById(R.id.tile15);
        tile16 = findViewById(R.id.tile16);
        tile17 = findViewById(R.id.tile17);
        tile18 = findViewById(R.id.tile18);
        tile19 = findViewById(R.id.tile19);
        tile20 = findViewById(R.id.tile20);
        tile21 = findViewById(R.id.tile21);
        tile22 = findViewById(R.id.tile22);
        tile23 = findViewById(R.id.tile23);
        tile24 = findViewById(R.id.tile24);
        tile25 = findViewById(R.id.tile25);
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
     *             from tile1 to tile 25
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
                    break;
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
                        turn.setText(playerOTurn);
                    } else {
                        tile7.setText("O");
                        tile7.setTextColor(Color.RED);
                        player = 0;
                        result();
                        turn.setText(playerXTurn);
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
                    break;
                case "2 Players":
                    if (player == 0) {
                        tile8.setText("X");
                        tile8.setTextColor(Color.BLUE);
                        player = 1;
                        resultX();
                        turn.setText(playerOTurn);
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

    public void tile10(View view) {
        if (tile10.getText().toString().equals("")) {
            switch (value) {
                case "With Computer":
                    tile10.setText("X");
                    tile10.setTextColor(Color.BLUE);
                    resultX();
                    turn.setText(computerTurn);

                    withComputer();
                    result();
                    turn.setText(yourTurn);
                    break;
                case "2 Players":
                    if (player == 0) {
                        tile10.setText("X");
                        tile10.setTextColor(Color.BLUE);
                        player = 1;
                        resultX();
                        turn.setText(playerOTurn);
                    } else {
                        tile10.setText("O");
                        tile10.setTextColor(Color.RED);
                        player = 0;
                        result();
                        turn.setText(playerXTurn);
                    }
            }
        }
    }

    public void tile11(View view) {
        if (tile11.getText().toString().equals("")) {
            switch (value) {
                case "With Computer":
                    tile11.setText("X");
                    tile11.setTextColor(Color.BLUE);
                    resultX();
                    turn.setText(computerTurn);

                    withComputer();
                    result();
                    turn.setText(yourTurn);
                    break;
                case "2 Players":
                    if (player == 0) {
                        tile11.setText("X");
                        tile11.setTextColor(Color.BLUE);
                        player = 1;
                        resultX();
                        turn.setText(playerOTurn);
                    } else {
                        tile11.setText("O");
                        tile11.setTextColor(Color.RED);
                        player = 0;
                        result();
                        turn.setText(playerXTurn);
                    }
            }
        }
    }

    public void tile12(View view) {
        if (tile12.getText().toString().equals("")) {
            switch (value) {
                case "With Computer":
                    tile12.setText("X");
                    tile12.setTextColor(Color.BLUE);
                    resultX();
                    turn.setText(computerTurn);

                    withComputer();
                    result();
                    turn.setText(yourTurn);
                    break;
                case "2 Players":
                    if (player == 0) {
                        tile12.setText("X");
                        tile12.setTextColor(Color.BLUE);
                        player = 1;
                        resultX();
                        turn.setText(playerOTurn);
                    } else {
                        tile12.setText("O");
                        tile12.setTextColor(Color.RED);
                        player = 0;
                        result();
                        turn.setText(playerXTurn);
                    }
            }
        }
    }

    public void tile13(View view) {
        if (tile13.getText().toString().equals("")) {
            switch (value) {
                case "With Computer":
                    tile13.setText("X");
                    tile13.setTextColor(Color.BLUE);
                    resultX();
                    turn.setText(computerTurn);

                    withComputer();
                    result();
                    turn.setText(yourTurn);
                    break;
                case "2 Players":
                    if (player == 0) {
                        tile13.setText("X");
                        tile13.setTextColor(Color.BLUE);
                        player = 1;
                        resultX();
                        turn.setText(playerOTurn);
                    } else {
                        tile13.setText("O");
                        tile13.setTextColor(Color.RED);
                        player = 0;
                        result();
                        turn.setText(playerXTurn);
                    }
            }
        }
    }

    public void tile14(View view) {
        if (tile14.getText().toString().equals("")) {
            switch (value) {
                case "With Computer":
                    tile14.setText("X");
                    tile14.setTextColor(Color.BLUE);
                    resultX();
                    turn.setText(computerTurn);

                    withComputer();
                    result();
                    turn.setText(yourTurn);
                    break;
                case "2 Players":
                    if (player == 0) {
                        tile14.setText("X");
                        tile14.setTextColor(Color.BLUE);
                        player = 1;
                        resultX();
                        turn.setText(playerOTurn);
                    } else {
                        tile14.setText("O");
                        tile14.setTextColor(Color.RED);
                        player = 0;
                        result();
                        turn.setText(playerXTurn);
                    }
            }
        }
    }

    public void tile15(View view) {
        if (tile15.getText().toString().equals("")) {
            switch (value) {
                case "With Computer":
                    tile15.setText("X");
                    tile15.setTextColor(Color.BLUE);
                    resultX();
                    turn.setText(computerTurn);

                    withComputer();
                    result();
                    turn.setText(yourTurn);
                    break;
                case "2 Players":
                    if (player == 0) {
                        tile15.setText("X");
                        tile15.setTextColor(Color.BLUE);
                        player = 1;
                        resultX();
                        turn.setText(playerOTurn);
                    } else {
                        tile15.setText("O");
                        tile15.setTextColor(Color.RED);
                        player = 0;
                        result();
                        turn.setText(playerXTurn);
                    }
            }
        }
    }

    public void tile16(View view) {
        if (tile16.getText().toString().equals("")) {
            switch (value) {
                case "With Computer":
                    tile16.setText("X");
                    tile16.setTextColor(Color.BLUE);
                    resultX();
                    turn.setText(computerTurn);

                    withComputer();
                    result();
                    turn.setText(yourTurn);
                    break;
                case "2 Players":
                    if (player == 0) {
                        tile16.setText("X");
                        tile16.setTextColor(Color.BLUE);
                        player = 1;
                        resultX();
                        turn.setText(playerOTurn);
                    } else {
                        tile16.setText("O");
                        tile16.setTextColor(Color.RED);
                        player = 0;
                        result();
                        turn.setText(playerXTurn);
                    }
            }
        }
    }

    public void tile17(View view) {
        if (tile17.getText().toString().equals("")) {
            switch (value) {
                case "With Computer":
                    tile17.setText("X");
                    tile17.setTextColor(Color.BLUE);
                    resultX();
                    turn.setText(computerTurn);

                    withComputer();
                    result();
                    turn.setText(yourTurn);
                    break;
                case "2 Players":
                    if (player == 0) {
                        tile17.setText("X");
                        tile17.setTextColor(Color.BLUE);
                        player = 1;
                        resultX();
                        turn.setText(playerOTurn);
                    } else {
                        tile17.setText("O");
                        tile17.setTextColor(Color.RED);
                        player = 0;
                        result();
                        turn.setText(playerXTurn);
                    }
            }
        }
    }

    public void tile18(View view) {
        if (tile18.getText().toString().equals("")) {
            switch (value) {
                case "With Computer":
                    tile18.setText("X");
                    tile18.setTextColor(Color.BLUE);
                    resultX();
                    turn.setText(computerTurn);

                    withComputer();
                    result();
                    turn.setText(yourTurn);
                    break;
                case "2 Players":
                    if (player == 0) {
                        tile18.setText("X");
                        tile18.setTextColor(Color.BLUE);
                        player = 1;
                        resultX();
                        turn.setText(playerOTurn);
                    } else {
                        tile18.setText("O");
                        tile18.setTextColor(Color.RED);
                        player = 0;
                        result();
                        turn.setText(playerXTurn);
                    }
            }
        }
    }

    public void tile19(View view) {
        if (tile19.getText().toString().equals("")) {
            switch (value) {
                case "With Computer":
                    tile19.setText("X");
                    tile19.setTextColor(Color.BLUE);
                    resultX();
                    turn.setText(computerTurn);

                    withComputer();
                    result();
                    turn.setText(yourTurn);
                    break;
                case "2 Players":
                    if (player == 0) {
                        tile19.setText("X");
                        tile19.setTextColor(Color.BLUE);
                        player = 1;
                        resultX();
                        turn.setText(playerOTurn);
                    } else {
                        tile19.setText("O");
                        tile19.setTextColor(Color.RED);
                        player = 0;
                        result();
                        turn.setText(playerXTurn);
                    }
            }
        }
    }

    public void tile20(View view) {
        if (tile20.getText().toString().equals("")) {
            switch (value) {
                case "With Computer":
                    tile20.setText("X");
                    tile20.setTextColor(Color.BLUE);
                    resultX();
                    turn.setText(computerTurn);

                    withComputer();
                    result();
                    turn.setText(yourTurn);
                    break;
                case "2 Players":
                    if (player == 0) {
                        tile20.setText("X");
                        tile20.setTextColor(Color.BLUE);
                        player = 1;
                        resultX();
                        turn.setText(playerOTurn);
                    } else {
                        tile20.setText("O");
                        tile20.setTextColor(Color.RED);
                        player = 0;
                        result();
                        turn.setText(playerXTurn);
                    }
            }
        }
    }

    public void tile21(View view) {
        if (tile21.getText().toString().equals("")) {
            switch (value) {
                case "With Computer":
                    tile21.setText("X");
                    tile21.setTextColor(Color.BLUE);
                    resultX();
                    turn.setText(computerTurn);

                    withComputer();
                    result();
                    turn.setText(yourTurn);
                    break;
                case "2 Players":
                    if (player == 0) {
                        tile21.setText("X");
                        tile21.setTextColor(Color.BLUE);
                        player = 1;
                        resultX();
                        turn.setText(playerOTurn);
                    } else {
                        tile21.setText("O");
                        tile21.setTextColor(Color.RED);
                        player = 0;
                        result();
                        turn.setText(playerXTurn);
                    }
            }
        }
    }

    public void tile22(View view) {
        if (tile22.getText().toString().equals("")) {
            switch (value) {
                case "With Computer":
                    tile22.setText("X");
                    tile22.setTextColor(Color.BLUE);
                    resultX();
                    turn.setText(computerTurn);

                    withComputer();
                    result();
                    turn.setText(yourTurn);
                    break;
                case "2 Players":
                    if (player == 0) {
                        tile22.setText("X");
                        tile22.setTextColor(Color.BLUE);
                        player = 1;
                        resultX();
                        turn.setText(playerOTurn);
                    } else {
                        tile22.setText("O");
                        tile22.setTextColor(Color.RED);
                        player = 0;
                        result();
                        turn.setText(playerXTurn);
                    }
            }
        }
    }

    public void tile23(View view) {
        if (tile23.getText().toString().equals("")) {
            switch (value) {
                case "With Computer":
                    tile23.setText("X");
                    tile23.setTextColor(Color.BLUE);
                    resultX();
                    turn.setText(computerTurn);

                    withComputer();
                    result();
                    turn.setText(yourTurn);
                    break;
                case "2 Players":
                    if (player == 0) {
                        tile23.setText("X");
                        tile23.setTextColor(Color.BLUE);
                        player = 1;
                        resultX();
                        turn.setText(playerOTurn);
                    } else {
                        tile23.setText("O");
                        tile23.setTextColor(Color.RED);
                        player = 0;
                        result();
                        turn.setText(playerXTurn);
                    }
            }
        }
    }

    public void tile24(View view) {
        if (tile24.getText().toString().equals("")) {
            switch (value) {
                case "With Computer":
                    tile24.setText("X");
                    tile24.setTextColor(Color.BLUE);
                    resultX();
                    turn.setText(computerTurn);

                    withComputer();
                    result();
                    turn.setText(yourTurn);
                    break;
                case "2 Players":
                    if (player == 0) {
                        tile24.setText("X");
                        tile24.setTextColor(Color.BLUE);
                        player = 1;
                        resultX();
                        turn.setText(playerOTurn);
                    } else {
                        tile24.setText("O");
                        tile24.setTextColor(Color.RED);
                        player = 0;
                        result();
                        turn.setText(playerXTurn);
                    }
            }
        }
    }

    public void tile25(View view) {
        if (tile25.getText().toString().equals("")) {
            switch (value) {
                case "With Computer":
                    tile25.setText("X");
                    tile25.setTextColor(Color.BLUE);
                    resultX();
                    turn.setText(computerTurn);
                    withComputer();
                    result();
                    turn.setText(yourTurn);
                    break;
                case "2 Players":
                    if (player == 0) {
                        tile25.setText("X");
                        tile25.setTextColor(Color.BLUE);
                        player = 1;
                        resultX();
                        turn.setText(playerOTurn);

                    } else {
                        tile25.setText("O");
                        tile25.setTextColor(Color.RED);
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
        if (tile1.getText().toString().equals("X") && tile2.getText().toString().equals("X") && tile3.getText().toString().equals("X") && tile4.getText().toString().equals("X") && tile5.getText().toString().equals("X")) {
            Toast.makeText(this, youWin  , Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerXScore();
        } else if (tile6.getText().toString().equals("X") && tile7.getText().toString().equals("X") && tile8.getText().toString().equals("X") && tile9.getText().toString().equals("X") && tile10.getText().toString().equals("X")) {
            Toast.makeText(this, youWin  , Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerXScore();
        } else if (tile11.getText().toString().equals("X") && tile12.getText().toString().equals("X") && tile13.getText().toString().equals("X") && tile14.getText().toString().equals("X") && tile15.getText().toString().equals("X")) {
            Toast.makeText(this, youWin  , Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerXScore();
        } else if (tile16.getText().toString().equals("X") && tile17.getText().toString().equals("X") && tile18.getText().toString().equals("X") && tile19.getText().toString().equals("X") && tile20.getText().toString().equals("X")) {
            Toast.makeText(this, youWin  , Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerXScore();
        } else if (tile21.getText().toString().equals("X") && tile22.getText().toString().equals("X") && tile23.getText().toString().equals("X") && tile24.getText().toString().equals("X") && tile25.getText().toString().equals("X")) {
            Toast.makeText(this, youWin  , Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerXScore();
        } else if (tile1.getText().toString().equals("X") && tile6.getText().toString().equals("X") && tile11.getText().toString().equals("X") && tile16.getText().toString().equals("X") && tile21.getText().toString().equals("X")) {
            Toast.makeText(this, youWin  , Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerXScore();
        } else if (tile2.getText().toString().equals("X") && tile7.getText().toString().equals("X") && tile12.getText().toString().equals("X") && tile17.getText().toString().equals("X") && tile22.getText().toString().equals("X")) {
            Toast.makeText(this, youWin  , Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerXScore();
        } else if (tile3.getText().toString().equals("X") && tile8.getText().toString().equals("X") && tile13.getText().toString().equals("X") && tile18.getText().toString().equals("X") && tile23.getText().toString().equals("X")) {
            Toast.makeText(this, youWin  , Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerXScore();
        } else if (tile4.getText().toString().equals("X") && tile9.getText().toString().equals("X") && tile14.getText().toString().equals("X") && tile19.getText().toString().equals("X") && tile24.getText().toString().equals("X")) {
            Toast.makeText(this, youWin  , Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerXScore();
        } else if (tile5.getText().toString().equals("X") && tile10.getText().toString().equals("X") && tile15.getText().toString().equals("X") && tile20.getText().toString().equals("X") && tile25.getText().toString().equals("X")) {
            Toast.makeText(this, youWin  , Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerXScore();
        } else if (tile1.getText().toString().equals("X") && tile7.getText().toString().equals("X") && tile13.getText().toString().equals("X") && tile19.getText().toString().equals("X") && tile25.getText().toString().equals("X")) {
            Toast.makeText(this, youWin  , Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerXScore();
        } else if (tile5.getText().toString().equals("X") && tile9.getText().toString().equals("X") && tile13.getText().toString().equals("X") && tile17.getText().toString().equals("X") && tile21.getText().toString().equals("X")) {
            Toast.makeText(this, youWin  , Toast.LENGTH_SHORT).show();
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
            tile10.setEnabled(false);
            tile11.setEnabled(false);
            tile12.setEnabled(false);
            tile13.setEnabled(false);
            tile14.setEnabled(false);
            tile15.setEnabled(false);
            tile16.setEnabled(false);
            tile17.setEnabled(false);
            tile18.setEnabled(false);
            tile19.setEnabled(false);
            tile20.setEnabled(false);
            tile21.setEnabled(false);
            tile22.setEnabled(false);
            tile23.setEnabled(false);
            tile24.setEnabled(false);
            tile25.setEnabled(false);
        }
    }

    /**
     * this method checks if three tiles have the same value o, vertically horizontally or diagonally
     * if it does then it displays a toast to declare player o as the winner of the round.
     * it calls the method that add player o's score
     */
    public void result() {
        if (tile1.getText().toString().equals("O") && tile2.getText().toString().equals("O") && tile3.getText().toString().equals("O") && tile4.getText().toString().equals("O") && tile5.getText().toString().equals("X")) {
            Toast.makeText(this, computerWin  , Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerOScore();
        } else if (tile6.getText().toString().equals("O") && tile7.getText().toString().equals("O") && tile8.getText().toString().equals("O") && tile9.getText().toString().equals("O") && tile10.getText().toString().equals("O")) {
            Toast.makeText(this, computerWin  , Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerOScore();
        } else if (tile11.getText().toString().equals("O") && tile12.getText().toString().equals("O") && tile13.getText().toString().equals("O") && tile14.getText().toString().equals("O") && tile15.getText().toString().equals("O")) {
            Toast.makeText(this, computerWin  , Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerXScore();
        } else if (tile16.getText().toString().equals("O") && tile17.getText().toString().equals("O") && tile18.getText().toString().equals("O") && tile19.getText().toString().equals("O") && tile20.getText().toString().equals("O")) {
            Toast.makeText(this, computerWin  , Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerOScore();
        } else if (tile21.getText().toString().equals("O") && tile22.getText().toString().equals("O") && tile23.getText().toString().equals("O") && tile24.getText().toString().equals("O") && tile25.getText().toString().equals("O")) {
            Toast.makeText(this, computerWin  , Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerOScore();
        } else if (tile1.getText().toString().equals("O") && tile6.getText().toString().equals("O") && tile11.getText().toString().equals("O") && tile16.getText().toString().equals("O") && tile21.getText().toString().equals("O")) {
            Toast.makeText(this, computerWin  , Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerOScore();
        } else if (tile2.getText().toString().equals("O") && tile7.getText().toString().equals("O") && tile12.getText().toString().equals("O") && tile17.getText().toString().equals("O") && tile22.getText().toString().equals("O")) {
            Toast.makeText(this, computerWin  , Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerOScore();
        } else if (tile3.getText().toString().equals("O") && tile8.getText().toString().equals("O") && tile13.getText().toString().equals("O") && tile18.getText().toString().equals("O") && tile23.getText().toString().equals("O")) {
            Toast.makeText(this, computerWin  , Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerOScore();
        } else if (tile4.getText().toString().equals("O") && tile9.getText().toString().equals("O") && tile14.getText().toString().equals("O") && tile19.getText().toString().equals("O") && tile24.getText().toString().equals("O")) {
            Toast.makeText(this, computerWin  , Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerOScore();
        } else if (tile5.getText().toString().equals("O") && tile10.getText().toString().equals("O") && tile15.getText().toString().equals("O") && tile20.getText().toString().equals("O") && tile25.getText().toString().equals("O")) {
            Toast.makeText(this, computerWin  , Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerOScore();
        } else if (tile1.getText().toString().equals("O") && tile7.getText().toString().equals("O") && tile13.getText().toString().equals("O") && tile19.getText().toString().equals("O") && tile25.getText().toString().equals("O")) {
            Toast.makeText(this, computerWin  , Toast.LENGTH_SHORT).show();
            win = Boolean.TRUE;
            playerOScore();
        } else if (tile5.getText().toString().equals("O") && tile9.getText().toString().equals("O") && tile13.getText().toString().equals("O") && tile17.getText().toString().equals("O") && tile21.getText().toString().equals("O")) {
            Toast.makeText(this, computerWin  , Toast.LENGTH_SHORT).show();
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
            tile10.setEnabled(false);
            tile11.setEnabled(false);
            tile12.setEnabled(false);
            tile13.setEnabled(false);
            tile14.setEnabled(false);
            tile15.setEnabled(false);
            tile16.setEnabled(false);
            tile17.setEnabled(false);
            tile18.setEnabled(false);
            tile19.setEnabled(false);
            tile20.setEnabled(false);
            tile21.setEnabled(false);
            tile22.setEnabled(false);
            tile23.setEnabled(false);
            tile24.setEnabled(false);
            tile25.setEnabled(false);
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
        tile10.setText("");
        tile11.setText("");
        tile12.setText("");
        tile13.setText("");
        tile14.setText("");
        tile15.setText("");
        tile16.setText("");
        tile17.setText("");
        tile18.setText("");
        tile19.setText("");
        tile20.setText("");
        tile21.setText("");
        tile22.setText("");
        tile23.setText("");
        tile24.setText("");
        tile25.setText("");

        tile1.setEnabled(true);
        tile2.setEnabled(true);
        tile3.setEnabled(true);
        tile4.setEnabled(true);
        tile5.setEnabled(true);
        tile6.setEnabled(true);
        tile7.setEnabled(true);
        tile8.setEnabled(true);
        tile9.setEnabled(true);
        tile10.setEnabled(true);
        tile11.setEnabled(true);
        tile12.setEnabled(true);
        tile13.setEnabled(true);
        tile14.setEnabled(true);
        tile15.setEnabled(true);
        tile16.setEnabled(true);
        tile17.setEnabled(true);
        tile18.setEnabled(true);
        tile19.setEnabled(true);
        tile20.setEnabled(true);
        tile21.setEnabled(true);
        tile22.setEnabled(true);
        tile23.setEnabled(true);
        tile24.setEnabled(true);
        tile25.setEnabled(true);
        win = Boolean.FALSE;
    }

    /**
     * @param view this method resets the whole game. include the board and the score counter
     */
    public void gameReset(View view) {
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
        if (tile13.getText().toString().equals("")) {
            tile13.setText("O");
            tile13.setTextColor(Color.RED);
        } else if (tile1.getText().toString().equals("")) {
            tile1.setText("O");
            tile1.setTextColor(Color.RED);
        } else if (tile5.getText().toString().equals("")) {
            tile5.setText("O");
            tile5.setTextColor(Color.RED);
        } else if (tile25.getText().toString().equals("")) {
            tile25.setText("O");
            tile25.setTextColor(Color.RED);
        } else if (tile11.getText().toString().equals("")) {
            tile11.setText("O");
            tile11.setTextColor(Color.RED);
        } else if (tile15.getText().toString().equals("")) {
            tile15.setText("O");
            tile15.setTextColor(Color.RED);
        } else if (tile21.getText().toString().equals("")) {
            tile21.setText("O");
            tile21.setTextColor(Color.RED);
        } else if (tile2.getText().toString().equals("")) {
            tile2.setText("O");
            tile2.setTextColor(Color.RED);
        } else if (tile6.getText().toString().equals("")) {
            tile6.setText("O");
            tile6.setTextColor(Color.RED);
        } else if (tile3.getText().toString().equals("")) {
            tile3.setText("O");
            tile3.setTextColor(Color.RED);
        } else if (tile10.getText().toString().equals("")) {
            tile10.setText("O");
            tile10.setTextColor(Color.RED);
        } else if (tile4.getText().toString().equals("")) {
            tile4.setText("O");
            tile4.setTextColor(Color.RED);
        } else if (tile7.getText().toString().equals("")) {
            tile7.setText("O");
            tile7.setTextColor(Color.RED);
        } else if (tile20.getText().toString().equals("")) {
            tile20.setText("O");
            tile20.setTextColor(Color.RED);
        } else if (tile8.getText().toString().equals("")) {
            tile8.setText("O");
            tile8.setTextColor(Color.RED);
        } else if (tile9.getText().toString().equals("")) {
            tile9.setText("O");
            tile9.setTextColor(Color.RED);
        } else if (tile12.getText().toString().equals("")) {
            tile12.setText("O");
            tile12.setTextColor(Color.RED);
        } else if (tile14.getText().toString().equals("")) {
            tile14.setText("O");
            tile14.setTextColor(Color.RED);
        } else if (tile16.getText().toString().equals("")) {
            tile16.setText("O");
            tile16.setTextColor(Color.RED);
        } else if (tile18.getText().toString().equals("")) {
            tile18.setText("O");
            tile18.setTextColor(Color.RED);
        } else if (tile23.getText().toString().equals("")) {
            tile23.setText("O");
            tile23.setTextColor(Color.RED);
        } else if (tile19.getText().toString().equals("")) {
            tile19.setText("O");
            tile19.setTextColor(Color.RED);
        } else if (tile22.getText().toString().equals("")) {
            tile22.setText("O");
            tile22.setTextColor(Color.RED);
        } else if (tile24.getText().toString().equals("")) {
            tile24.setText("O");
            tile24.setTextColor(Color.RED);
        } else if (tile17.getText().toString().equals("")) {
            tile17.setText("O");
            tile17.setTextColor(Color.RED);
        }

    }
}
