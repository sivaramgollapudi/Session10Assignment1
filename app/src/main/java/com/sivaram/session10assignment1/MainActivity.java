package com.sivaram.session10assignment1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {

    // Declare EditText And Button Variables.
    EditText inputNumberEditText;
    Button showNumberButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TypeCast Button and Edit Text to Access in this Method.
        showNumberButton = (Button)findViewById(R.id.showNumberButton);
        inputNumberEditText = (EditText)findViewById(R.id.inputNumberEditText);


        // Set OnClick Listener To Change Value of TextView Which is located in Fragment, Based on the
        // Data Entered in Edit Text Of This Activity.
        showNumberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create An Object Of Fragment Class And Get Fragment Details.
                // Which allows to Access Methods which are available in Fragment Class
                SimpleAddition simpleAddition =(SimpleAddition)getSupportFragmentManager().findFragmentById(R.id.fragment);
                simpleAddition.ChangeText(inputNumberEditText.getText().toString()); // Access Change Text Method To Update Edit Text Value into Fragment TextView.
            }
        });
    }
}
