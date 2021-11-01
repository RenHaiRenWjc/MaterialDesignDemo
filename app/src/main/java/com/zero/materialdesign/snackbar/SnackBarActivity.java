package com.zero.materialdesign.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;
import com.example.materialdesigndemo.R;
import com.example.materialdesigndemo.databinding.ActivitySnackBarBinding;

public class SnackBarActivity extends AppCompatActivity {

    private ActivitySnackBarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySnackBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnSnackBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(binding.btnSnackBar, "Hello SnackBar!", Snackbar.LENGTH_LONG).setAction("SnackBarTest", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // do something
                    }
                }).show();
            }
        });

    }
}