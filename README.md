# 🏠 Simulador de Financiamento Imobiliário


Projeto desenvolvido em **Java** que simula financiamentos imobiliários, permitindo escolher entre **Casa, Apartamento ou Terreno**, calcular parcelas e gerar um relatório detalhado mês a mês.

---

## 🔹 Funcionalidades

- Escolha do tipo de imóvel: **Casa, Apartamento ou Terreno**  
- Inserção de:
  - Valor do imóvel  
  - Valor da entrada  
  - Taxa de juros anual  
  - Prazo em meses  
- Cálculo de parcelas pelo sistema de amortização:
  - **PRICE**: parcela fixa  
  - **SAC**: parcela decrescente  
- Relatório detalhado mês a mês:
  - Amortização  
  - Juros  
  - Saldo devedor  
- Interface em console simples e intuitiva

---

## 📂 Estrutura do Projeto

src/
├── main/
│ └── Main.java
├── model/
│ ├── Casa.java
│ ├── Apartamento.java
│ ├── Terreno.java
│ ├── Financiamento.java
│ └── Imovel.java
└── view/
└── InterfaceUsuario.java

---

## ⚙️ Como Executar<br>

1. Clone o repositório:<br>
   
   git clone https://github.com/GabrielMuraro04/projetoFinanciamento.git<br>
   
Entre na pasta do projeto:<br>

cd projetoFinanciamento<br>
Compile todas as classes:<br>

javac -d out src/model/*.java src/view/*.java src/main/Main.java<br>
Execute o programa:<br>

java -cp out main.Main<br>
🧮 Tecnologias e Conceitos<br>
Java (POO e polimorfismo)<br>

Conceitos financeiros: sistemas de amortização PRICE e SAC<br>

Interface em console para interação com o usuário<br>

🖥️ Exemplo de Saída<br>


=== Simulador de Financiamento ===<br>
Escolha o tipo de imóvel:<br>
1 - Casa<br>
2 - Apartamento<br>
3 - Terreno<br>
Opção: 1<br>

Você escolheu Casa: Casa{endereco='Rua Exemplo, 123', area=120.0, quartos=3, banheiros=2, valor=500000.0}<br>
Informe o valor da entrada: R$ 100000<br>
Informe a taxa de juros anual (%): 8<br>
Informe o prazo do financiamento em meses: 240<br>
Escolha o tipo de amortização (1-PRICE, 2-SAC): 1<br>

=== Resultado da Simulação ===<br>
Tipo de imóvel escolhido: Casa<br>
Tipo de amortização: PRICE<br>
Parcela mensal: R$ 4021.34<br>

=== Relatório Mensal ===<br>
Mês    Amortização  Juros        Saldo Devedor<br>
1      2354.56      1666.78      398645.44<br>
2      2365.34      1655.00      396280.10<br>
...

👤 Autor<br>
Gabriel Muraro<br>
Desenvolvedor Júnior | Projetos pessoais em Java e Web<br>
GitHub<br>

📌 Observações<br>
Projeto desenvolvido como simulador de financiamentos, ideal para prática de POO, polimorfismo e cálculos financeiros.<br>

Pode ser expandido com:<br>

Interface gráfica (GUI)

Banco de dados

Integração web

Perfeito para portfólio e demonstração de habilidades em Java
