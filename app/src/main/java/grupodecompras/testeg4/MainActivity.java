package grupodecompras.testeg4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Aqui começa os códigos dos botões
    //botão 1
    public void cadastra_usuario (View View)
    {
        setContentView(R.layout.cadastra_usuario);
    }
    //botão 2
    public void cadastro_estabelecimento (View View)
    {
        setContentView(R.layout.cadastro_estabelecimento);
    }
    //botão 3
    public void login (View View)
    {
        setContentView(R.layout.login);
    }
    //botão 3
    public void voltar (View View)
    {
        setContentView(R.layout.activity_main);
    }

    //botão 4
    public void principal (View View)
    {
        setContentView(R.layout.principal);
    }
}
