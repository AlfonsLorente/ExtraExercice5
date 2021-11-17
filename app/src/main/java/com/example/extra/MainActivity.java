package com.example.extra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity  extends FragmentActivity implements AtackTheDragon.NoticeDialogListener {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= (TextView) findViewById(R.id.textView);
    }

    public void verDialog(View view) {
        DialogFragment dialog = new AtackTheDragon();
        dialog.show(getSupportFragmentManager(), "NoticeDialogFragment");
    }

    @Override
    public void onDialogPositiveClick(DialogFragment dialog) {
        textView.setText("You defeated the dragon!");

    }

    @Override
    public void onDialogNegativeClick(DialogFragment dialog) {
        textView.setText("The dragon has escaped!");

    }





}