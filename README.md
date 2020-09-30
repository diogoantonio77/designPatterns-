<h1 align = "center"> :fast_forward: BlackDesert Project: Design Patterns :rewind: </h1>
<h3 align = "center"> pt-BR </h3>

---

## 📖 Sobre

<p>Projeto desenvolvido para a matéria de Análise e Desenvolvimento de Sistemas.</p>

---

## 🛠 Tecnologias Usadas

- Java

---

## :pushpin: Objetivo

Descrição do trabalho:

- Implementar um software em java que demonstre a utilização de 3 design patterns em um mesmo contexto. As regras de negócio em si não são relevantes para o trabalho de forma que podem se resumir a prints na tela tal qual fazemos em sala. O que deve ser entregue e será avaliado:
- O código do trabalho no github.
- Um texto(arquivo README.md) também no github explicando como utilizou cada padrão e qual vantagem conseguida ao utiliza-lo.

---

## Descrição do projeto desenvolvido

- Fizemos a criação de um cenário, na qual se passa o jogo BlackDesert, na qual existem várias classes (algumas utilizadas na aplicação: Bruxa, Domadora, Feiticeira, Guerreiro, Mago, entre outras), cada uma respectiva classe com seus valores de vida, mana de ataque, velocidade de ataque e também de movimento.

## Descrição dos Design Patterns utilizados

- Strategy: Definimos qual classe estaria em execução no momento, a utilizamos devido ao fato de que o personagem pode alterar a classe durante o jogo.
- Singleton: Fizemos com que somente uma instância do personagem estivesse em execução durante o jogo.
- State: O personagem pode ter ações alteradas dependendo do estado em que ele se encontra.

## Pattern extra que poderiamos ter utilizado

- Observe: Poderíamos ter utilizado o mesmo, pelo fato que o personagem tem os seguintes métodos: entrarTerrenoRuim() e entrarTerrenoNormal(). Este pattern iria observar o terreno que o personagem alternasse o terreno, avisasse o personagem.

---

## Desenvolvido por:

- Daniel Araújo Fonseca - User GitHub: dnsfonseca - E-mail: daniel-fonseca13@hotmail.com
- Diogo Antônio Ribeiro Fernandes - User GitHub: diogoantonio77 - E-mail: diogoantonio47@hotmail.com
