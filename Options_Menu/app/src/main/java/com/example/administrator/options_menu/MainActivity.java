package com.example.administrator.options_menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 1, "save");
        menu.add(0,2,2,"exit");
        return super.onCreateOptionsMenu(menu);

    }
public boolean onOptionsItemSelected(MenuItem item){
    if (item.getItemId()==2){
        finish();
    }
return super.onOptionsItemSelected(item);
}

}
