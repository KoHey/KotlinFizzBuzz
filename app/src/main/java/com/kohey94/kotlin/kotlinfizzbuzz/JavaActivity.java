package com.kohey94.kotlin.kotlinfizzbuzz;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class JavaActivity extends AppCompatActivity {
    EditText inputNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputNumber = (EditText)findViewById(R.id.inputNumber);
        final TextView outputText = (TextView)findViewById(R.id.outputWord);
        Button createBUtton = (Button)findViewById(R.id.createButton);
        createBUtton.setAllCaps(false);
        createBUtton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inputNumber.getText().toString().length() != 0) {//入力チェック
                    int intInputNum = Integer.parseInt(inputNumber.getText().toString());
                    String str = "";
                    for (int i = 1 ; i <= intInputNum ; i++){
                        if (i % 3 == 0 && i % 5 == 0) {
                            str += "FizzBuzz\n";
                        } else if (i % 3 == 0) {
                            str += "Fizz\n";
                        } else if (i % 5 == 0){
                            str += "Buzz\n";
                        } else {
                            str += i + "\n";
                        }
                    }
                    outputText.setText(str);
                }else{
                    Log.v("input","入力してください");
                }
            }
        });
    }
}
