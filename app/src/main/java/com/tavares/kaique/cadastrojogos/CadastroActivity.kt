package com.tavares.kaique.cadastrojogos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cadastro.*

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        //setOnClickListener para eu ter a ação do botão
        btnCadastrar.setOnClickListener{
            //Val - Constante não posso atribuir novos valores em outras telas
            //Intent é uma intenção eu saio de um lugar e vou para outro
            //Logo eu saio desta tela (this) e vou para outra activity
            val telaSucesso = Intent(this,SucessoActivity::class.java)

            //Pego uma constante e atribuio ela ao meu objeto passando os parametros do objeto
            //Lembre-se que devo converter os textos deste edit text e converto para string TODOS!!!!!
            //E os que tem que ser Int por causa do Objeto converto novamente usando .toInt()
            val jogo = Jogo(etNome.text.toString(),
                    etGenero.text.toString(),
                    etAno.text.toString().toInt())

            //.text não retorna um texto ele retorna um editable por isto devo converter para toString()
            //putExtra coloco valores dentro de uma variavel para passar para a proxima tela
            //telaSucesso.putExtra("nome",etNome.text.toString())

            //Pego minha val e coloco dentro dela o meu objeto
            telaSucesso.putExtra("jogo",jogo)

            //Starto minha activity passando todos os meus atributos para outra tela
            startActivity(telaSucesso)

            //Vou limpar meus inputs, pois vou para outra tela e quando voltar os inputs deve estar vazio, deve estar depois de eu
            //Ter setado meu objeto
            limpar()
        }

        //Chamo meu botão de limpar que recebe uma ação
        btnLimpar.setOnClickListener {
            //Chamo minha função de limpar
            limpar()
        }
    }

    //Criei esta função pois usei ela 2 vezes
    private fun limpar (){
        //Deixo meus inputs todos vazios
        etAno.setText("")
        etGenero.setText("")
        etNome.setText("")
    }
}
