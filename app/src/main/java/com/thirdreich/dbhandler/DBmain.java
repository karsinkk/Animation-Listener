package com.thirdreich.dbhandler;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class DBmain extends ActionBarActivity {
    Button but1, but2;
    private static final String TAG = "DBmain";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbmain);
        but1 = (Button) findViewById(R.id.b1);
        but2 = (Button) findViewById(R.id.b2);
        Log.i(TAG, "Oncreate");
    }



    public void modifydb(View view) {

        Log.i(TAG, "modifydb Button clicked");

        aniMate(but1);


        aniMate1(but2);

    }





    public void viewdb(View view) {
        Log.i(TAG, "view Button clicked");

        aniMate(but1);
        aniMate2(but2);


    }


    public void aniMate(Button bb2) {
        Log.i(TAG, "aniMate");
        ObjectAnimator animY = ObjectAnimator.ofFloat(bb2, "translationX", 0f, -1000f);
        animY.setDuration(1000);
        animY.setRepeatCount(0);
        animY.start();

    }
    public void aniMate1(Button bb2) {
        Log.i(TAG, "aniMate1");


        ObjectAnimator animZ = ObjectAnimator.ofFloat(bb2, "translationX", 0f, 1000f);
       animZ.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {


            }

            @Override
            public void onAnimationEnd(Animator animation) {

                Intent ModifyDB = new Intent(DBmain.this, Modify_DB.class);
                startActivity(ModifyDB);

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });

        animZ.setDuration(900);
        animZ.setRepeatCount(0);
        animZ.start();

        /*
        startActivity(intent);
        */
    }

    public void aniMate2(Button bb2) {
        Log.i(TAG, "aniMate1");


        ObjectAnimator animZ = ObjectAnimator.ofFloat(bb2, "translationX", 0f, 1000f);
        animZ.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {


            }

            @Override
            public void onAnimationEnd(Animator animation) {

                Intent ViewDB = new Intent(DBmain.this, View_DB.class);
                startActivity(ViewDB);



            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });

        animZ.setDuration(900);
        animZ.setRepeatCount(0);
        animZ.start();

        /*
        startActivity(intent);
        */
    }
    public void aniMate3(Button bb1) {
        Log.i(TAG, "aniMate");
        ObjectAnimator animY = ObjectAnimator.ofFloat(bb1, "translationX",1000f , 0f);
        animY.setDuration(1000);
        animY.setRepeatCount(0);
        animY.start();

    }
    public void aniMate4(Button bb2) {
        Log.i(TAG, "aniMate");
        ObjectAnimator animY = ObjectAnimator.ofFloat(bb2, "translationX", -1000f, 0f);
        animY.setDuration(1000);
        animY.setRepeatCount(0);
        animY.start();

    }
    @Override
    protected void onResume() {
        super.onResume();
        aniMate3(but1);
        aniMate4(but2);

    }
}
    /*


   }























    public void aniMate2( Button bb1, Button bb2) {
        Log.i(TAG, "aniMate");
        ObjectAnimator animY = ObjectAnimator.ofFloat(bb1, "translationX", 1000f, 0f);
        animY.setDuration(1000);
        animY.setRepeatCount(0);
        animY.start();

        ObjectAnimator animZ = ObjectAnimator.ofFloat(bb2, "translationX", -1000f, 0f);
        animZ.setDuration(1000);
        animZ.setRepeatCount(0);
        animZ.start();}


        @Override
    protected void onRestart() {
        super.onRestart();
        aniMate2(but1, but2);

    }
    */





/*
ObjectAnimator animY = ObjectAnimator.ofFloat(bb1, "translationX", 1000f, 0f);
animY.setDuration(1000);
        animY.setRepeatCount(0);
        animY.start();

        ObjectAnimator animZ = ObjectAnimator.ofFloat(bb2, "translationX", -1000f, 0f);
        animZ.setDuration(1000);
        animZ.setRepeatCount(0);
        animZ.start();
*/
