package org.techtown.login_mainmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void customerButtonClicked(View v) {
        Intent intent = new Intent();
        intent.putExtra("name", "Customer");
        setResult(RESULT_OK, intent);

        finish();
    }

    public void salesButtonClicked(View v) {
        Intent intent = new Intent();
        intent.putExtra("name", "Sales");
        setResult(RESULT_OK, intent);

        finish();
    }

    public void productButtonClicked(View v) {
        Intent intent = new Intent();
        intent.putExtra("name", "Product");
        setResult(RESULT_OK, intent);

        finish();
    }
}
