
package com.zhou.picture;

import android.graphics.Matrix;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;

class GestureListener extends GestureDetector.SimpleOnGestureListener {
    private ImageView imageView;
    protected Matrix mSuppMatrix = new Matrix();
    private int position = 0;

    public GestureListener(ImageView imageView, int position){
        this.imageView = imageView;
        this.position = position;
    }
    
    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        mSuppMatrix.postTranslate(distanceX, distanceY);
        //left
//        if (e1.getX() - e2.getX() > 50) {
//            position = position - 1 < 0 ? 2 : position - 1;
//            imageView.setImageResource(MyAdapter.imgs[position]); 
//       
//        } else if (e1.getX() - e2.getX() < -50) {   //right
//            position = (position + 1) > 2 ? 0 : position + 1;
//            imageView.setImageResource(MyAdapter.imgs[position]); 
//        }
        Log.i("zhou", (e1.getX() - e2.getX()) + "");
        Log.i("zhou", distanceX + "=distanceX| " + distanceY + "=y");
        
        return true;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
//        if (mPaused)
//            return false;
//        setMode(MODE_NORMAL);
        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
//        if (mPaused)
//            return false;
//        showOnScreenControls();
//        scheduleDismissOnScreenControls();
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
//        if (mPaused)
//            return false;
//        ImageViewTouch imageView = mImageView;
//
//        // Switch between the original scale and 3x scale.
//        if (imageView.getScale() > 2F) {
//            mImageView.zoomTo(1f);
//        } else {
//            mImageView.zoomToPoint(3f, e.getX(), e.getY());
//        }
        return true;
    }
}
