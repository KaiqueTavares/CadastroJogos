package com.tavares.kaique.cadastrojogos

import android.os.Parcel
import android.os.Parcelable

//DATA CLASS CRIA O OBJETO, ATRIBUIO O NOME E PASSO OS PARAMETROS (ATRIBUTOS QUE TEREI NESTE OBJETO)
//: Parcelable no final dos meus parametros para que eu consigo colocar no setPutExtra
//Ele serve para converter meus parametros
//Depois de colocar isto minha CLASS JOGO FICA VERMELHO
//APERTE ALT+ENTER E CLIQUE PARA IMPLEMENTAR QUE O CÓDIGO VAI SURGIR!
//CUIDADO SE EU ACRESCENTAR,ALTERAR A ORDEM, DELETAR ATRIBUTOS DEVO APAGAR O CODIGO E IMPLEMENTAR DENOVO
data class Jogo(val nome:String,
                val genero:String,
                val anoLancameto:Int) : Parcelable {

    //Parcel é uma classe do android que uso para passar de uma tela a outra
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readInt()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nome)
        parcel.writeString(genero)
        parcel.writeInt(anoLancameto)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Jogo> {
        override fun createFromParcel(parcel: Parcel): Jogo {
            return Jogo(parcel)
        }

        override fun newArray(size: Int): Array<Jogo?> {
            return arrayOfNulls(size)
        }
    }
}
