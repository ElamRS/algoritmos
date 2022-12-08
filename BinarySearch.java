//(Lógica do Algoritmo)

/* O objetivo do algoritmo é o de checar se o elemento passado como item da busca faz parte
 * dos objetos a serem pesquisados (elementos do vetor). Para tal utiliza da seguinte lógica:
 * 
 * 1 - Escolhe o elemento do meio da lista (meio == [fim+inicio]/2).
 * 2 - Checa se o elemento do meio é o elemento procurado. Caso seja, o elemento do meio (ou mensagem de sucesso)
 *     é retornado, caso contrário, vai para o passo 3.
 * 3 - Analisa, de acordo o tipo de dado, se o elemento procurado está à esquerda (menor) ou à direita do elemento do meio.
 * 4 - Caso o elemento esteja à esquerda, o valor de fim é atualizado para o do índice imediatamente anterior ao índice do meio, criando um sub vetor 
 *     à esquerda (v[inicio, ..., meio-1]). Caso esteja à direita, o valor de inicio recebe (meio + 1), criando um sub vetor direito (v[meio+1, ..., fim-1]).
 *	   Na prática, o que ocorre é que a lista é dividida ao meio em cada comparação.
 * 5 - Retorna-se ao passo 1 e seguem-se os passos até que o elemento seja procurado ou constate-se que não se encontra na lista passada
*/

public class BinarySearch {
	// Método responsável por realizar a busca binária
	public static void binarySearch(int[] v, int elemento) {
		// A busca binária só é possível de ser realizada se a lista a ser pesquisada estiver ordenada
		int inicio = 0; // Em um primeiro momento o valor de 'inicio' (low) é tido como o primeiro índice do vetor
		int fim = v.length-1; // E o de 'fim' (high) como o do último índice do vetor
		int meio, flag=0; // Declaração da variável que armazenará o índice do meio e da flag que informará se o elemento pertence ao vetor
		
		// Inicia-se um laço de repetição while
		while (inicio<=fim) {
			// Exemplo: Calcular o índice do meio de um vetor ordenado de 9 elementos  
			// 1 - 2 - 3 - 5 - 8 - 9 - 11 - 14 - 17
			// inicio = 0 (v[0]==1), fim = 8 (v[8]==17) --> meio = (0 + 8) / 2 = 8 / 2 = 4 | v[4] == 8
			meio = (inicio + fim) / 2; // O índice do meio é calculado utilizando-se a fórmula (inicio + fim) / 2
			// Checa se o elemento procurado é maior que o elemento no índice do meio
			if (elemento > v[meio]) {
				inicio = meio + 1; // Neste caso a lista é diminuída pela metade e o inicio (low) passa a ser o índice imediatamente após o 'meio'
			} else if (elemento < v[meio]) { // Checa se o elemento procurado é menor que o elemento no índice do meio
				fim = meio - 1; // Caso seja, então o fim do vetor passa a ser o índice imediatamente anterior ao do meio
			} else {
				System.out.println(elemento + " encontrado no indice " + meio + ".");
				flag++; // Quando o elemento é encontrado, o valor da flag é acrescido de 1
				break; // E o break interrompe a continuação do loop
			}
		}
		if (flag==0) {System.out.println(elemento + " nao faz parte da lista passada.");}
	}
}
