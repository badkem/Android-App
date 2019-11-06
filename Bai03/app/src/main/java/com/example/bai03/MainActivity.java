package com.example.bai03;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private GridLayout mygrid;
    private int col = 5, row = 12;
    private MyStack myStack;
    private int currentvalue = 0;
    private String[] emoji = {"🐒","🐈","🐅","👻","🐎","🐂","🐃","🐄","🐏","🐑","🐐","🐁","🐀","🐇","🐊","🌴","🌵","🌾","🌿","🍀",
                                "🐍","🐉","🐋","🐌","🌸","😍","🌹","🌺","🌻","🌼","🌷","🌱","🌲","🌳","🍒","🍓","🍅","🍆","🌽",
                                "🍁","🍂","🍃","🍇","🍈","🍉","🍊","🍋","🍌","🍍","🍎","🍏","🍐","🍑","❄️","🍱","🍘","🍙",
                                "😅","🍄","🌰","🍞","🍖","🍗","🍔","🍟","🍕","🔥","💀","👽","🍳","🍲","🍯","🍷","🍺","🎃",
                                "🍚","🍛","🍜","🍠","🍣","🍤","🍥","🍦","🍧","🍩","🍪","🎂","🍰","🍭",
                                "🎄","🎉","🏀","💩","🏈","🏉","🌝","🌔","⭐","🌋","🚀"};
    private View.OnClickListener btClickListenter = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Button bt = (Button) view;
            int clickvalue = Integer.parseInt(bt.getHint().toString());
            Toast msg = Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT);
            if (clickvalue == currentvalue) {
                disableButton(currentvalue, col, row, mygrid);

                myStack.popData(currentvalue);

                if (myStack.getValues().size() > 0) {
                    msg.setText("Yeah \uD83D\uDE01");
                    msg.show();
                    currentvalue = myStack.selectValue();
                    makeActiveButton(currentvalue, col, row, mygrid);
                } else {
                    msg.setText("Chúc Mừng! Bạn Thật Sự Thông Minh! \uD83C\uDf89");
                    msg.show();
                    makeCongrats();
                    running = true;
                }
            }else {
                msg.setText("Sai \uD83D\uDE13");
                msg.show();
            }
        }
    };

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate((savedInstanceState));
        setContentView(R.layout.activity_main);

        System.out.println(emoji.length);
        mygrid = findViewById(R.id.mygrid);
        mygrid.setColumnCount(col);
        mygrid.getRootView().setBackgroundColor(Color.BLUE);

        for (int i=0; i<col*row; i++){
            Button bt = new Button(getApplicationContext());
            bt.setTextSize(20);
            bt.setOnClickListener(btClickListenter);
            mygrid.addView(bt);
        }
        initStage();

    }
    public void initStage(){

        myStack = new MyStack(100);

//Reset color for buttons

    for(int i=0; i<col*row; i++){
            Button bt = (Button) mygrid.getChildAt(i);
            bt.setBackgroundColor(Color.DKGRAY);
            bt.setTextColor(Color.WHITE);
            bt.setEnabled(true);

        }

    //Generate values for data

        for(int i=0; i<col*row/2; i++){
            myStack.pushData ();

        }

    //Load values from data to buttons

        for(int i=0; i<col*row; i++){
                Button bt = (Button) mygrid.getChildAt(i);
                bt.setText(emoji[myStack.getValues().get(i)]);
                bt.setHint(myStack.getValues().get(i) + "");

            }
        currentvalue = myStack.selectValue();
        makeActiveButton(currentvalue, col, row, mygrid);
    }
    public void makeActiveButton(int value, int c, int r, GridLayout grid) {
        for (int i = 0; i < r * c; i++) {
            Button bt = (Button) (grid.getChildAt(i));
            int tempvalue = Integer.parseInt(bt.getHint().toString());
            if (tempvalue == currentvalue) {
                bt.setBackgroundColor(Color.rgb(100, 0, 0));
                bt.setEnabled(false);
                break;
            }
        }
    }
    public void disableButton(int value, int c, int r, GridLayout grid) {
        for (int i = 0; i < c * r; i++) {
            Button bt = (Button) (grid.getChildAt(i));
            int tempvalue = Integer.parseInt(bt.getHint().toString());
            if (tempvalue == currentvalue) {
                bt.setEnabled(false);
                bt.setBackgroundColor(Color.DKGRAY);
                bt.setText(" ");
            }
        }
    }

    int step = 0;
    boolean running = true;

    public void makeCongrats (){
            Timer timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask(){
                @Override
                public void run() {
                    if (running)
                        handler.obtainMessage(1).sendToTarget();
                }

                }, 100, 100);
        }

    public Handler handler = new Handler() {
        @Override
        public void handleMessage (@NonNull Message msg) {
            Button bt = (Button) mygrid.getChildAt(step++);
            int color = Color.rgb((new Random()).nextInt(255), (new Random()).nextInt(255), (new Random()).nextInt(255));
            bt.setBackgroundColor(color);
            bt.setTextColor(color);
            if (step >= col * row) {
                running = false;
                step = 0;
                initStage();
            }
        }

    };
}
