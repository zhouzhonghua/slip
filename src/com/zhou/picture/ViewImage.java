package com.zhou.picture;

import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;

public class ViewImage extends Activity {
    ImageView imageView;
    
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewimage);
        imageView = (ImageView)findViewById(R.id.image);
        Bundle bundle = getIntent().getExtras();
        imageView.setImageResource(MyAdapter.imgs[bundle.getInt("position")]); 
        
        final GestureDetector listener = new GestureDetector(this, new GestureListener( imageView, bundle.getInt("position") ) );
        
        imageView.setOnTouchListener( new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
//                buttonListener.onTouch(v, event);
                listener.onTouchEvent(event);
                return true;
            }
        } );
    }

}
