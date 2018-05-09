package com.example.usrgam.popmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirMenu(View v, String itemList) {
        PopupMenu menuPopupMenu = new PopupMenu(this, v);
        menuPopupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.idItemVer:
                        Toast.makeText(getApplicationContext(), "ver producto", Toast.LENGTH_LONG);
                        return true;
                    case R.id.idItemComprar:
                        Toast.makeText(getApplicationContext(), "comprar producto", Toast.LENGTH_LONG);
                        return true;
                    case R.id.idItemComparar:
                        Toast.makeText(getApplicationContext(), "comparar producto", Toast.LENGTH_LONG);
                        return true;
                }
                return false;
            }
        });
        menuPopupMenu.inflate(R.menu.pop_menu2);
        menuPopupMenu.show();
    }
}
