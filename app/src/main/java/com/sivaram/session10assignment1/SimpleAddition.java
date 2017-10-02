package com.sivaram.session10assignment1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by User on 02/10/2017.
 */

public class SimpleAddition extends Fragment {

    // Create Object of View And TextView Types
    View view; // Inflate Layout and Return to This View. Which allows to access TextView Within the View.
    TextView enteredValueTextView; // to set Default value to empty in TextView.

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate View Bu Updating the Layout.
        view =  inflater.inflate(R.layout.fragment_simpleaddition, container, false);

        // Type Cast TextView and Change Text.
        enteredValueTextView = (TextView) view.findViewById(R.id.enteredValueTextView);
        enteredValueTextView.setText(""); // Change Text To Empty on View Create.

        // Return Inflated View.
        return  view;
    }

    // This method shall be accessable from MainActivity. With the Help of FragmentManager.
    // This Method will change Text of TextView and Updates UI
    public void ChangeText(String textViewText){
        // Update TextView Text.
        enteredValueTextView.setText(textViewText);

    }
}
