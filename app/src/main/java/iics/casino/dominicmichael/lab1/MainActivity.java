package iics.casino.dominicmichael.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button EvenNumGo =(Button) findViewById(R.id.EvenNumGoButton);

        EvenNumGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView EvenNum = (TextView) findViewById(R.id.EvenNumTextView);

                int i=20;
                for(int j=1; j<=i;j++) {
                    if (j % 2 == 0){
                        EvenNum.append(j + " ");
                    }
                }

            }



        });


    }
}
