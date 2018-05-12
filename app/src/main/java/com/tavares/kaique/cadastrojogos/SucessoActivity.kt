package com.tavares.kaique.cadastrojogos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sucesso.*

class SucessoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sucesso)

        //Crio uma variavel para receber a intenção do meu objeto da outra tela
        //getParcelableExtra<COLOCO O MEU OBJETO QUE DESEJO RECEBER> ("coloco o nome do setPutExtra da outra Activity")
        val jogo = intent.getParcelableExtra<Jogo>("jogo")

        //Pego meu textView e pego o texto deste text view que vai receber
        //Uma intenção (pois na outra tela usei o intent e devo receber está intenção)
        //Como dei um setPutExtra, aqui vou pegar (getStringExtra) uma string que mandei pego uma string
        //Pego o nome que dei na outra tela
        //tvMensagem.text = intent.getStringExtra("nome")

        //Pego meu TextView e pego o parametro = que vai ser Igual a um getString (vou pegar textos)
        //Com isto vou pegar meu value->strings.xml e o id dele
        tvMensagem.text = getString(R.string.mensagem_sucesso,
                //Passo os atributos do meu objeto que no caso desta tela foi atribuido para uma constante
                jogo.nome,
                jogo.genero,
                jogo.anoLancameto)
    }
}
