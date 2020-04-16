#include <stdio.h>
#include <stdlib.h>
/*void ordenarVetor(int *array, int n){
	for(int i=0; i<n-1; i++){
		for(int j=i+1; j<n; j++){
			if(array[i]>array[j]){
				int aux = array[i];
				array[i] = array[j];
				array[j] = aux;
			}
		}
	}
}*/
long contaIndicesPosterior(int *array, long n, long nRecebido){
	long restantes=0;
	for(long i=0; i<n; i++){
		if(array[i]==nRecebido){
			restantes = n-i;
			break;
		}
	}
	return restantes;
}

int main(){
	int *array;
	long n, nRecebido;
	scanf("%ld", &n);
	array = malloc(sizeof(long)*n);
	for(long i=0; i<n; i++){
		scanf("%d", &array[i]);
	}
	//ordenarVetor(array, n);
	scanf("%ld", &nRecebido);
	printf("%ld\n", contaIndicesPosterior(array, n, nRecebido));
	free(array);
	return 0;
}