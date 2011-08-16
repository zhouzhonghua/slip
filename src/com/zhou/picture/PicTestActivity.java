package com.zhou.picture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class PicTestActivity extends Activity {
    private View mNoImagesView;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mNoImagesView = findViewById(R.id.no_images);
        
        mNoImagesView.setVisibility( View.GONE );
        
        GridView grid = (GridView)findViewById(R.id.grid);
//        grid.setNumColumns(2);
        grid.setAdapter(new MyAdapter(this));
        
        grid.setOnItemClickListener(new OnItemClickListener(){//¼àÌýÊÂ¼þ
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
//                Intent intent = new Intent(
//                        Intent.ACTION_VIEW, image.fullSizeImageUri());
                Intent intent = new Intent(PicTestActivity.this, ViewImage.class);
                
//                intent.set
                Bundle dataStore = new Bundle();
                dataStore.putInt("position", position);
                intent.putExtras( dataStore );
                startActivity(intent);
            }
        });  
        
    }
}