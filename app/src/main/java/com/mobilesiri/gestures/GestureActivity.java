package com.mobilesiri.gestures;

import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class GestureActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener ,
        View.OnTouchListener {

    private ImageView iv;
    private TextView tv;
    private GestureDetectorCompat gd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gesture);
        this.gd =new GestureDetectorCompat(this,this);
        iv = (ImageView)findViewById(R.id.imageView);
        assert iv != null;
        iv.setImageResource(R.drawable.noon);
        tv=(TextView)findViewById(R.id.textView);
        tv.setText("noon");

    }

    @Override
    public boolean onDown(MotionEvent e) {
        tv.setText("On Down");
        iv.setImageResource(R.drawable.ondwn);
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        tv.setText("ON show press");
        iv.setImageResource(R.drawable.onshow);

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        tv.setText("single tap");
        iv.setImageResource(R.drawable.sclk);
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

        tv.setText("long press");
        iv.setImageResource(R.drawable.longprs);

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent event) {
        this.gd.onTouchEvent(event);
        // Be sure to call the superclass implementation
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return gd.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        //iv.setImageResource(R.drawable.dclk);
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        iv.setImageResource(R.drawable.dclk);
        return false;
    }

}
