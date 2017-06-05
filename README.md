# Dilema-do-Prisioneiro
Jogo Dilema do Prisioneiro

Este é um jogo em texto baseado em escolhas
Como este é um jogo super-tecnologico, o jogador tem a opção de escolher
entre a quantidade massiva de nada mais nada menos do que
2 opções...

#########

Você e seu comparsa foram detidos, e estão cada um em uma sala de interrogatório diferente
Os dois não podem se falar e nem combinaram nada antes do interrogatório. Por isso você deve escolher
se entrega seu comparsa, ou se fica calado e não ajuda com as investigações. O seu parceiro terá de
fazer sua escolha a seu respeito também.

Entre trair e cooperar o jogo flui, sendo que existem diferentes resultados
com as possibilidades de escolha. Exemplos:

Se as escolhas resultarem em Trair x Trair, os dois individuos pegam 5 anos de cadeia cada um.
Se resultarem em Cooperar x Cooperar, os dois pegam 2 anos cada um.
Se resultarem em Trair x Coopeerar, ou vice-versa, o jogador que traiu conquista sua liberdade
e sai pela porta da frente. O outro ingênuo que cooperou pega 10 anos de prisão.

Existem algumas estratégias implantadas, sendo executadas apenas pelo jogador 2 que é a máquina:

Não Iterado
  As jogadas não tem estratégia, simplesmente escolhas.
  
Olho por olho
  Onde o jogador 2 repetirá a escolha que o jogador 1 fez na rodada anterior.
  
Olho por Dois Olhos
  Onde o jogador 2 repetirá a escolha que o jogador 1, apenas se o jogador 1 fizer a mesma escolhas
  duas vezes seguidas.
  
Provador Ingênuo
  Onde o jogador 2 repetirá a escolha do jogador 1, assim como na estratégia Olho por Olho,
  mas tem uma chance de mudar e escolher trair ao invés de seguir o jogador 1.
  
Retaliador Permanente
  Onde o jogador 2 sempre cooperará, a menos que o jogador 1 escolher trair. Assim em todas as próximas jogadas
   o jogador 2 escolherá trair.
