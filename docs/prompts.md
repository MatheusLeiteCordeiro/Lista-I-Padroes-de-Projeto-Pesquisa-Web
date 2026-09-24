# Registro de uso de IA

## Questão 1 — Pesquisa na Web

### Enunciado
Alterar o código do pacote websearch para usar o padrão Strategy...

### Prompt inicial
"Olá, me ajude na seguinte atividade da faculdade:

Você deverá criar um repositório no GitHub para cada questão (5 repositórios
no total), para onde submeterá suas respostas;

● A entrega da atividade será o link de cada repositório (5 links no total);
● A apresentação será arguição sobre o código;
● Para as três primeiras questões abaixo, vocês vão usar o código inicial do
arquivo src.zip;

• Vocês deverão utilizar o auxílio de IA na resolução dos problemas. Em vez de
pedir a solução, peça um passo-a-passo (um tutorial) para gerar a
solução.

• Toda a utilização da IA deverá ser documentada:
quais prompts utilizados?

• Todos os seus ajustes sobre o que a IA fez deverá ser documentado:
por que o que IA fez não serviu totalmente?
por que determinado ajuste seu melhora a solução da IA?

• A documentação se dará através de commits no seu repositório do problema.

Os commits deverão ser curtos, agrupar ajustes correlatos e contar a
história da sua solução.

Cada a passo/etapa sugerida pela IA deverá ter um commit
correspondente.

Todo commit tem uma mensagem, essa mensagem dá uma visão
geral/resumo daquele conjunto de ajustes. E para o detalhamento você

pode usar o recurso de comentários de linhas do próprio GitHub e
comentários no código.

"Quem lê o histórico de commits vai conseguir entender a evolução da
solução do prolema?" Se a reposta for não, sua solução será inválida. 

--------------------------------

Questão - Pesquisa na Web:

- Enunciado da questão;
- estrutura de arquivos do projeto;
"

### Plano recebido
1. Criar interface de filtro.
2. Alterar o model para aceitar filtro no registro.
3. Alterar o model para filtrar antes de notificar.
4. Alterar o Snooper para registrar dois observadores.
5. Testar.

### Ajustes manuais previstos
- Filtro deve ficar no model, não dentro do observador.
- Filtro de 'friend' deve ser case-insensitive.
- Filtro de comprimento deve ser > 60, não >= 60.
- Remover observador antigo que imprimia tudo.