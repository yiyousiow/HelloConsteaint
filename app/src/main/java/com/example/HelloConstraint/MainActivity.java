package com.example.HelloConstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private int mCount=0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount=(TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view)
    {
        Toast toast=Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view)
    {
        ++mCount;

        if(mShowCount !=null){
            findViewById(R.id.button_zero).setBackgroundColor(Color.MAGENTA);
        }
            mShowCount.setText(Integer.toString(mCount));

        if (mCount%2==1)
            view.setBackgroundColor(Color.GREEN);
        else
            view.setBackgroundColor(Color.BLUE);
        //tes

    }
   public void zero(View view)
   {
       if (mShowCount!=null)
       {

           mCount = 0;
           mShowCount.setText(Integer.toString(mCount));
           findViewById(R.id.button_zero).setBackgroundColor(Color.GRAY);
           findViewById(R.id.button_count).setBackgroundColor(Color.BLUE);
       }
   }


}

