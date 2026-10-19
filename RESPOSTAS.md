1) No TDD, a gente começa fazendo o teste falhar e depois escreve o código mais simples para passar.
Usar return 70 era aceitável no começo porque o objetivo era ver o teste falhando primeiro.
Depois, quando criei outro teste com valores diferentes, o retorno fixo não funcionou mais.
Isso me obrigou a fazer a soma de verdade usando a1 + a2 + a3.

2) Porque 69 e 70 são valores próximos do limite de aprovação, que é 70.
Assim, dá para verificar se o programa diferencia corretamente quem ficou abaixo da nota mínima e quem atingiu exatamente a nota para passar.
Com 50 e 90, os valores ficam muito distantes do limite e o teste não verifica esse detalhe tão bem.

3) Na refatoração, organizei a validação das notas em um método chamado validarNota, para evitar repetir o mesmo código para A1, A2 e A3.
Tive certeza de que a mudança não quebrou o que já funcionava porque rodei os testes novamente e eles continuaram passando.

4) Porque no TDD os testes representam o que o programa deve fazer. Como o requisito mudou, primeiro alterei os testes para mostrar o novo comportamento esperado.
Eles falharam porque o código ainda tinha a regra antiga. Depois mudei o código para atender ao novo requisito e fiz os testes passarem.

5) O Ciclo 7 foi o mais difícil pra mim, porque precisei entender como a nota da AI substitui a menor nota entre A1 e A2.
Tive que entender melhor o uso de Math.min e das condições if para saber quando substituir a nota e quando deixar os valores como estavam.
Com os testes, consegui conferir se a lógica estava funcionando.

![Imagem da atividade](https://github.com/user-attachments/assets/02db57ac-9f91-4bb4-95dd-351221a8e9b4)
