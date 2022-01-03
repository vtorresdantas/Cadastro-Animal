# Cadastro-Animal
Global Solution- Laboratório de Programação (FIAP)

A sua equipe foi contratada para desenvolver um sistema para realizar o controle (cadastro e
busca em um vetor) de animais de uma fazenda. O sistema deverá apresentar para o usuário o
seguinte menu de opções:

1. Cadastrar
2. Relatório
3. Pesquisa

Ao escolher a opção de cadastro, um submenu deverá ser apresentado:

1. Bovino
2. Suíno
3. Caprino

O usuário da aplicação deverá escolher uma opção válida e, em seguida, entrar com as
informações do animal: raça, peso, idade. Além das informações citadas, para cada animal,
deverá ser gerado um código único composto por cinco letras maiúsculas obedecendo a
seguinte regra:

1. Bovino (BO + 3 letras maiúsculas)
2. Suíno (SU + 3 letras maiúsculas)
3. Caprino (CA + 3 letras maiúsculas)

Os dados de cada animal deverão ser armazenados em arrays e o código de cada animal deverá
ser armazenado de forma criptografada usando a cifra de César (descrição a seguir). Para a
criptografia o usuário da aplicação deverá informar qual o número de cifras para deslocamento.
A opção Relatório do menu principal deverá exibir no vídeo todos os dados de cada animal, o
código criptografado e o código descriptografado.

A opção Pesquisa do menu principal deverá receber o código criptografado e deverá pesquisar
no vetor se o animal com o código está registrado. Caso o animal esteja registrado no vetor, seus
dados deverão ser exibidos no vídeo. Se não estiver cadastrado, uma mensagem deverá ser
exibida para o usuário da aplicação.

# Cifra de César
Em criptografia, a Cifra de César, também conhecida como cifra de troca, código de
César ou troca de César, é uma das mais simples e conhecidas técnicas de criptografia.
É um tipo de cifra de substituição na qual cada letra do texto é substituída por outra,
que se encontra a frente da letra original um número fixo de vezes. Por exemplo, com
uma troca de três posições, a letra A seria substituída pela letra D, a letra B se tornaria 
34 a letra E assim por diante. O nome do método é em homenagem ao imperador romano
Júlio César, que o usou para se comunicar com os seus generais.

Observação: Caso o alfabeto termine, deve-se retornar ao início do alfabeto. Por
exemplo, para N = 3, as três últimas letras do alfabeto deverão ser substituídas pelas
três primeiras.

Exemplo:
BONECO ZABUMBA
ERQHFR CDEXPED
