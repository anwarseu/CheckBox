package com.tricktech.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public CheckBox checkPant,checkShirt,checkJacket;
    public Button btnBuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkPant = (CheckBox) findViewById(R.id.checkPant);
        checkShirt = (CheckBox) findViewById(R.id.checkShirt);
        checkJacket = (CheckBox) findViewById(R.id.checkJacket);

        btnBuy = (Button) findViewById(R.id.btnBuy);

        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuilder sb = new StringBuilder();
                int amount = 0;

                if (checkPant.isChecked()){
                    sb.append("Pant 100Tk");
                    amount +=100;
                }

                if (checkShirt.isChecked()){
                    sb.append("\nShirt 50Tk");
                    amount +=50;
                }
                if (checkJacket.isChecked()){
                    sb.append("\nJacket 500Tk");
                    amount +=500;
                }

                Toast.makeText(MainActivity.this, sb+"\n Total : "+amount, Toast.LENGTH_LONG).show();

            }
        });
    }
}
