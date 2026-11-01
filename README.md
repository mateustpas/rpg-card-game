# RPG Card Game

Um jogo de batalha de cartas em turnos desenvolvido em Java via console/terminal, criado com o objetivo de consolidar os pilares fundamentais da Programação Orientada a Objetos (POO) e boas práticas de modelagem de software.
O projeto simula duelos estratégicos onde entidades utilizam decks de cartas com diferentes comportamentos, custos de energia, efeitos de dano, cura e efeitos.

---

## Objetivos de Aprendizado

- Praticar a modelagem de entidades complexas e suas relações.
- Aplicar os quatro pilares da Programação Orientada a Objetos em um cenário prático e interativo.
- Gerenciar ciclos de execução, turnos e fluxos condicionais de estado de jogo.

---

## Pilares de POO Aplicados

- Encapsulamento: Atributos de personagens e cartas (pontos de vida, mana/energia, valores de ataque) protegidos por modificadores de acesso, garantindo que alterações de estado ocorram apenas por meio de métodos consistentes.
- Herança: Criação de classes base genéricas (como `Carta` ou `Jogador`) estendidas por especializações (como diferentes Habilidades e atributos).
- Polimorfismo: Sobrescrita de métodos, permitindo que cada tipo de carta execute ações distintas dentro de uma mesma lista polimórfica de ações.
- Abstração: Interfaces e classes abstratas definindo contratos de combate sem acoplar a lógica central aos detalhes de implementação específicos.

---

## Tecnologias Utilizadas

- Linguagem: Java (versão 17)
- Paradigma: Orientação a Objetos (POO)
- Interface: Terminal

---

## Mecânicas do Jogo

- Sistema de Turnos: Alternância de rodadas com jogadas de jogadores ou algoritmo.
- Validação de Recursos: Verificação de custo de energia/mana antes de executar cada jogada.
- Condição de Vitória/Derrota: Monitoramento contínuo de vida das entidades envolvidas na partida.
## Desenvolvimento e Implementações

- Ainda no início, ainda na fase de implementação das classes e consolidação das regras de fluxo do sistema. Foram feitos os alicerces da estrutura do projeto, como as classes:

- Batalha: Direciona a via de turnos e o ritmo de um combate.
- Controlador: Representação de uma entidade que contenha um as cartas e tenha o poder de decidir jogadas numa batalha.
- Habilidade: Classe utilitária que define especialização de cada carta.
- Personagem: Próprias cartas, na qual contém atributos e especializações particulares.

