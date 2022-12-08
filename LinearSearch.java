// O método de busca linear consiste na forma mais simples de se procurar por um elemento em uma lista,
// Itera-se do início ao fim do vetor e caso o item seja encontrado, o índice é retornado.

// Possuí uma eficiência de O(1) no melhor caso (elemento procurado no primeiro índice)
// E de O(n) no pior caso (elemento procurado é o último da lista).

public class LinearSearch {
	public static int linearSearch(int[] vetor, int elemento) {
		// Itera-se sobre o vetor a procura do elemento
		for (int i=0; i<vetor.length; i++) {
			// Caso ele seja encontrado...
			if (vetor[i]==elemento) {
				return i; // O índice do elemento procurado é retornado
			}
		}
		return -1; // Caso o elemento procurado não faça parte da lista, -1 é retornado
	}
}
