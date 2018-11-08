package com.leonardomachadoleite.tecladoperkins;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.support.v7.widget.GridLayout;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickItemMenu(View view) {
        Intent intent;
        switch ((String) view.getTag()) {
            case "Navegacao":
                intent = new Intent(this, NavegacaoMenuPrincipalActivity.class);
                startActivity(intent);
                return;
            case "Botoes":
                Log.i("onClick", "Botoes was clicked");
                intent = new Intent(this,ManualBotoesActivity.class);
                startActivity(intent);
                return;
            case "Funcoes":
                intent = new Intent(this,TelaFuncoesActivity.class);
                startActivity(intent);
                return;
            default:
                return;
        }
    }

/*
    private void createBrailleCell() {
        GridLayout brailleMatrix = findViewById(R.id.BrailleMatrix);
        GridLayout cell = new GridLayout(this);

        addViewToGridLayout(cell, this.createCell(1), 0,0);
        addViewToGridLayout(cell, this.createCell(2), 1,0);
        addViewToGridLayout(cell, this.createCell(3), 2,0);
        addViewToGridLayout(cell, this.createCell(4), 0,1);
        addViewToGridLayout(cell, this.createCell(5), 1,1);
        addViewToGridLayout(cell, this.createCell(6), 2,1);

        addViewToGridLayout(brailleMatrix, cell, 0, 1);
    }

    private void addViewToGridLayout(GridLayout grid, View view, int row, int column) {
        grid.addView(view, new GridLayout.LayoutParams(
                GridLayout.spec(row),
                GridLayout.spec(column)
        ));
    }
    */

}
