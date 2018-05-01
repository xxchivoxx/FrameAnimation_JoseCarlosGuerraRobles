package com.example.carlos.frameanimation_josecarlosguerrarobles;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private AnimationDrawable onePunchAnimation;
    private Button btnClear, btnRun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //btnClear = (Button) findViewById(R.id.btnClear);
        //btnRun = (Button) findViewById(R.id.btnRun);
        imageView = (ImageView) findViewById(R.id.animation);
        //if (imageView == null) throw new AssertionError();
        //imageView.setVisibility(View.INVISIBLE);
        imageView.setBackgroundResource(R.drawable.one_punch_animation);

        //onePunchAnimation = (AnimationDrawable) imageView.getBackground();
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimationDrawable animacion = (AnimationDrawable) imageView.getBackground();
                animacion.start();
            }
        });



        /*btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                if (onePunchAnimation.isRunning()) {
                    onePunchAnimation.stop();
                }
                onePunchAnimation.start();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onePunchAnimation.stop();
            }
        });*/
    }
}
