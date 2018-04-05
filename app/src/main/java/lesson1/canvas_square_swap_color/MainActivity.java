package lesson1.canvas_square_swap_color;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import CustomViewClass.MyView;

public class MainActivity extends AppCompatActivity {

    private MyView myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MyView myView = new MyView(this);

        myView = (MyView)findViewById(R.id.customView);
        findViewById(R.id.swapColor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myView.swap_color();
            }
        });

    }
}
