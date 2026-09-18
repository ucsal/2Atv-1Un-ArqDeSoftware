# Padrões de Projeto — Extensão

Projeto desenvolvido para a disciplina de Arquitetura de Software da UCSAL.

O objetivo é estudar e aplicar padrões de projeto da categoria **Extensão**, demonstrando como eles ajudam a tornar o código mais organizado, reutilizável, flexível e fácil de manter.

## Padrões abordados

O projeto apresenta os seguintes padrões:

- Decorator;
- Iterator;
- Visitor.

Cada padrão possui uma finalidade diferente e pode ser utilizado de acordo com o problema que precisa ser resolvido.

---

## Padrão Decorator

### Conceito

O **Decorator** é um padrão estrutural que permite adicionar novas responsabilidades ou comportamentos a um objeto de forma dinâmica, sem alterar sua classe original.

Ele utiliza objetos que envolvem outros objetos, acrescentando funcionalidades antes ou depois da execução do comportamento principal.

### Problema que resolve

Em alguns sistemas, é necessário adicionar funcionalidades a um objeto sem criar várias subclasses para cada combinação possível.

Por exemplo, um dispositivo pode receber diferentes recursos adicionais, como:

- Monitoramento;
- Notificações;
- Registro de atividades;
- Controle remoto.

Criar uma classe para cada combinação dessas funcionalidades deixaria o código difícil de manter.

### Funcionamento

O Decorator possui uma estrutura semelhante à seguinte:

- **Componente:** define a operação principal;
- **Componente concreto:** implementa o comportamento básico;
- **Decorator:** mantém uma referência para outro componente;
- **Decorators concretos:** adicionam novos comportamentos.

Cada decorator pode executar uma ação adicional e depois chamar o objeto envolvido.

### Vantagens

- Permite adicionar funcionalidades dinamicamente;
- Evita a criação de muitas subclasses;
- Mantém o princípio da responsabilidade única;
- Facilita a combinação de comportamentos.

### Limitações

- Pode aumentar a quantidade de objetos;
- A estrutura pode ficar mais complexa;
- A ordem dos decorators pode alterar o resultado final.

---

## Padrão Iterator

### Conceito

O **Iterator** é um padrão comportamental que permite percorrer os elementos de uma coleção sem expor sua estrutura interna.

Ele fornece uma forma padronizada de acessar os elementos, independentemente de como a coleção é implementada.

### Problema que resolve

Um sistema pode armazenar informações em diferentes estruturas, como:

- Listas;
- Conjuntos;
- Filas;
- Coleções personalizadas.

Sem o Iterator, o código que percorre essas estruturas precisaria conhecer detalhes da implementação de cada coleção.

### Funcionamento

O Iterator normalmente possui métodos para:

- Verificar se existem mais elementos;
- Retornar o próximo elemento;
- Percorrer a coleção de forma controlada.

A coleção disponibiliza um Iterator, e o código cliente utiliza esse objeto para acessar seus elementos.

### Exemplo de aplicação

Em um sistema de gerenciamento de dispositivos, o Iterator pode ser utilizado para percorrer todos os dispositivos cadastrados, sem que o código precise conhecer como eles estão armazenados.

### Vantagens

- Separa a estrutura da coleção do código de navegação;
- Permite percorrer diferentes coleções de maneira semelhante;
- Facilita a criação de coleções personalizadas;
- Mantém o encapsulamento da coleção.

### Limitações

- Pode exigir a criação de várias classes;
- Para coleções simples, pode ser desnecessário;
- Alguns iterators podem consumir recursos ao percorrer grandes coleções.

---

## Padrão Visitor

### Conceito

O **Visitor** é um padrão comportamental que permite adicionar novas operações a diferentes objetos sem alterar diretamente suas classes.

Ele separa as operações dos objetos que recebem essas operações.

### Problema que resolve

Em um sistema com diferentes tipos de dispositivos, podem surgir várias operações, como:

- Calcular consumo de energia;
- Realizar manutenção;
- Gerar relatórios;
- Verificar o estado dos equipamentos.

Colocar todas essas operações dentro das classes dos dispositivos pode deixar o código complexo e difícil de manter.

### Aplicação no projeto

O Visitor pode ser aplicado em um sistema de gerenciamento de dispositivos inteligentes, como:

- Lâmpadas;
- Termostatos;
- Câmeras de segurança.

Cada dispositivo pode aceitar diferentes Visitors, responsáveis por executar operações específicas.

Exemplos de Visitors:

- `ConsumoEnergiaVisitor`;
- `ManutencaoVisitor`.

### Funcionamento

Os dispositivos implementam uma operação para aceitar um Visitor.

O Visitor possui métodos específicos para cada tipo de dispositivo. Assim, a operação correta é executada de acordo com o objeto visitado.

Esse funcionamento utiliza o conceito de **Double Dispatch**.

### Vantagens

- Permite adicionar novas operações sem alterar os dispositivos;
- Separa responsabilidades;
- Facilita a manutenção;
- Evita concentrar muitas funcionalidades nas classes principais;
- Permite reutilizar operações em diferentes objetos.

### Limitações

- A criação de novos tipos de objetos pode exigir alterações nos Visitors;
- Pode aumentar a quantidade de classes e interfaces;
- É mais indicado quando existem muitas operações diferentes sobre os mesmos objetos.

---

## Comparação entre os padrões

| Padrão | Categoria | Principal finalidade |
|---|---|---|
| Decorator | Estrutural | Adicionar comportamentos a objetos dinamicamente |
| Iterator | Comportamental | Percorrer coleções sem expor sua estrutura interna |
| Visitor | Comportamental | Adicionar operações a objetos sem modificar suas classes |

## Tecnologias utilizadas

- Java;
- Maven;
- JUnit 5;
- Git;
- GitHub.

## Testes

O projeto pode utilizar testes automatizados para verificar o funcionamento dos padrões implementados.

Para executar os testes com Maven:

```bash
mvn test
