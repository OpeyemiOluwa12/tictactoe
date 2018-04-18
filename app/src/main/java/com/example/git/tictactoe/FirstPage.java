package com.example.git.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class FirstPage extends AppCompatActivity {
    /**
     * declare the global variable used
     */
    RadioButton playerType;
    RadioButton boardType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
    }

    /**
     * @param view this method determines what to so when the next page is clicked
     */
    public void nextPage(View view) {
        RadioGroup player = findViewById(R.id.player_Group);
        RadioGroup board = findViewById(R.id.board_Group);

        /**get the radio button value for player type and board type*/
        int selectedPlayer = player.getCheckedRadioButtonId();
        int selectedBoard = board.getCheckedRadioButtonId();
        playerType = findViewById(selectedPlayer);
        boardType = findViewById(selectedBoard);

        /** checked the board type */
        if (boardType.getText().equals("3 by 3")) {
            /** if board type is 3 by 3 then it loads the 3 by 3 board page and sends the player type*/
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("player", playerType.getText().toString());
            this.startActivity(intent);
        } else {
            /** if board type is 3 by 3 then it loads the 5 by 5 board page and sends the player type*/
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("player", playerType.getText().toString());
            this.startActivity(intent);
        }

    }
}
