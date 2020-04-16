#include <stdio.h>
#include <stdlib.h>

int buscaSegura(int *numeros, int n, int busca){
	int inicio=0, fim=n-1, meio;
	while(inicio <= fim){
		meio = (inicio + fim) / 2;
		if(numeros[meio]==busca){
			return 1;
		}else if (numeros[meio]>busca) {
			fim = meio-1;
		} else {
			inicio = meio + 1;
		}
	}
	return 0;
}
void ordenaNumeros(int *numeros, int n){
	for (int i = 0; i < n-1; i++){
		for (int j = 0; j < n-i-1; j++){
			if(numeros[j]>numeros[j+1]){
				int aux;
				aux=numeros[j];
				numeros[j]=numeros[j+1];
				numeros[j+1]=aux;
			}
		}
	}
}
int main(){
	long n;
	int entrada;
	scanf("%ld", &n);
	int *numeros = malloc(sizeof(int)*n);
	for(int i=0; i<n; i++){
		scanf("%d ", &numeros[i]);
	}
	ordenaNumeros(numeros, n);
	while(scanf("%d", &entrada) != EOF){
		if(buscaSegura(numeros, n, entrada)){
			printf("SIM\n");
		} else {
			printf("CHAVE NAO ENCONTRADA\n");
		}
	}

	return 0;
}