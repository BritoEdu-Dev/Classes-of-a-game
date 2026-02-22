## Portuguese:
# Objetivo:

Criar classes genericas que represente um herói de uma aventura e que possua as seguintes propriedades:

- nome
- idade
- atributo especial
- tipo (ex: guerreiro, mago, monge, ninja )

Além disso, deve ter um método chamado atacar que deve atender os seguientes requisitos:

- exibir a mensagem: "o {tipo} atacou usando {ataque}")
- aonde o {tipo} deve ser concatenando o tipo que está na propriedade da classe
- e no {ataque} deve seguir uma descrição diferente conforme o tipo, seguindo a tabela abaixo:

se mago -> no ataque exibir (usou magia)
se guerreiro -> no ataque exibir (usou espada)
se monge -> no ataque exibir (usou artes marciais)
se ninja -> no ataque exibir (usou shuriken)
se médico -> no ataque exibir (usou adaga)

## Saída

Ao final deve se exibir uma mensagem:

- "o {tipo} atacou usando {ataque}"
  ex: mago atacou usando magia
  guerreiro atacou usando espada
  
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## English:
# Objective:

Create generic classes that represent a hero in an adventure and that possess the following properties:

- name
- age
- special attribute
- type (e.g., warrior, mage, monk, ninja)

In addition, it must have a method called attack that must meet the following requirements:

- display the message: "{type} attacked using {attack}")
- where {type} should be concatenated with the type that is in the class property
- and {attack} should follow a different description according to the type, following the table below:

if mage -> in attack display (used magic)
if warrior -> in attack display (used sword)
if monk -> in attack display (used martial arts)
if ninja -> in attack display (used shuriken)
if doctor -> in attack display (used dagger)

## Output

At the end, a message should be displayed:

- "{type} attacked using {attack}"

e.g., mage attacked using magic
warrior attacked using sword
