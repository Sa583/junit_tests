package com.example.dom.kv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText, editText2, editText3;
    TextView textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);

        textView6 = (TextView) findViewById(R.id.textView6);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener( new View.OnClickListener() {
            public void onClick( View w )
            {
                double a, b, c;

                a = Double.parseDouble( editText.getText().toString() );
                b = Double.parseDouble( editText2.getText().toString() );
                c = Double.parseDouble( editText3.getText().toString() );

                SqSolve s = new SqSolve();
                s.setA(a);
                s.setB(b);
                s.setC(c);

                if (!s.solve())
                    textView6.setText( "Нет решений");
                else
                {
                    if (s.x.size() == 1)
                        textView6.setText( "Корень: " + s.x.get(0).toString() );
                    else
                    {
                        String str = "Корни: ";

                        for( int i = 0; i < s.x.size(); i++ )
                            str = str + s.x.get(i).toString() + "   ";

                        textView6.setText( str );
                    }
                }

            }
        });


    }
}
