# 2Atv-1Un-ArqDeSoftware

## Padrão Decorator e Iterator

Decorator: serve para adicionar novas funcionalidades aos dispositivos sem alterar a classe original, por exemplo, pegamos a classe LampadaInteligente e adicionamos recursos como monitoramento de energia e notificações através dos decorators, deixando o sistema mais flexível

Iterator: serve para percorrer todos os dispositivos cadastrados na casa sem precisar saber como eles estão armazenados internamente, por exemplo, ele passa pela lâmpada, geladeira, tv, um por um


Padrão Visitor
Conceito

O Visitor é um padrão comportamental que permite adicionar novas operações a um conjunto de objetos sem alterar suas classes.

Ele separa as operações dos objetos que recebem essas operações, facilitando a manutenção e a expansão do sistema.

Problema do mundo real

Em uma casa inteligente, diferentes dispositivos podem precisar de operações como:

Calcular consumo de energia;

Realizar manutenção;

Gerar relatórios;

Verificar o estado dos dispositivos.

Adicionar essas operações diretamente em cada dispositivo pode deixar o código complexo e difícil de manter.

Aplicação no projeto SmartHome Manager

O padrão Visitor foi aplicado em dispositivos inteligentes, como:

LampadaInteligente;

TermostatoInteligente;

CameraSeguranca.

Cada dispositivo aceita um Visitor por meio do método aceitar().

Os Visitors utilizados são:

ConsumoEnergiaVisitor: calcula o consumo dos dispositivos;

ManutencaoVisitor: verifica possíveis necessidades de manutenção.

Estrutura das classes
DispositivoVisitable

Interface implementada pelos dispositivos que podem receber um Visitor.

DispositivoVisitor

Interface que define os métodos de visita para cada tipo de dispositivo.

Dispositivos visitáveis

Representam os equipamentos da casa inteligente e implementam o método aceitar().

Visitors

Contêm as operações que serão executadas nos dispositivos, sem modificar suas classes.

Funcionamento

O dispositivo recebe um Visitor e chama o método correspondente ao seu tipo. Esse processo utiliza Double Dispatch, permitindo que a operação correta seja executada para cada dispositivo.

Exemplo de resultado
Consumo da lâmpada: 12 kWh
Consumo do termostato: 35 kWh
Manutenção da câmera: necessária
Vantagens

Facilita a adição de novas operações;

Mantém as responsabilidades separadas;

Evita alterações constantes nas classes dos dispositivos;

Melhora a organização do código.

Limitações

A criação de novos tipos de dispositivos pode exigir alterações nos Visitors;

A estrutura pode ficar mais complexa em projetos pequenos.

Testes realizados

Foram criados testes com JUnit 5 para verificar:

A aceitação dos Visitors;

O cálculo de consumo;

A execução das operações de manutenção.

Para executar os testes:

mvn test
Conclusão

O padrão Visitor foi utilizado para separar as operações dos dispositivos inteligentes. Dessa forma, o projeto pode receber novas funcionalidades sem modificar diretamente as classes dos dispositivos, tornando o sistema mais organizado e fácil de expandir.
