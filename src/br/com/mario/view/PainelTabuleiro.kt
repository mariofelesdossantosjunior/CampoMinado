package br.com.mario.view

import br.com.mario.model.Tabuleiro
import br.com.mario.view.BotaoCampo
import java.awt.GridLayout
import javax.swing.JPanel

class PainelTabuleiro(tabuleiro: Tabuleiro) : JPanel() {

    init {
        layout = GridLayout(tabuleiro.qtdLinhas, tabuleiro.qtdColunas)
        tabuleiro.forEachCampo {  campo ->
            val botao = BotaoCampo(campo)
            add(botao)
        }
    }
}