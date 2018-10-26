package com.leonardomachadoleite.tecladoperkins;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NavegacaoMenuPrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegacao_menu_principal);
    }

    public void onClickEntrarMenu(View view) {
        switch ((String) view.getTag()) {
            case "Bloco de Notas":

                return;
            case "Leitor de Tela":

                return;
            case "Aplicativos":

                return;
            case "Opcoes":

                return;
            case "Informacoes":

                return;
            default:
                return;
        }
    }

}
