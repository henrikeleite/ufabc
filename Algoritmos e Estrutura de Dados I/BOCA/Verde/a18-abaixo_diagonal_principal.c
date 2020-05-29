#include <stdio.h>
#include <stdlib.h>
double funSoma(long **m, int n){
	double soma = 0;
	for(int i=0; i<n; i++){
		for(int j=0; j<i; j++){
			soma += m[i][j];
		}
	}
	return soma;
}

double funMedia(long **m, int n){
	double soma = 0;
	int contador = 0;
	for(int i=0; i<n; i++){
		for(int j=0; j<i; j++){
			soma += m[i][j];
			contador ++;
		}
	}
	return soma/contador;
}

int main(){
	char operacao;
	int n;
	scanf("%c", &operacao);
	scanf("%d", &n);
	long **matriz = malloc(sizeof(long)*n);
	for(int i=0; i<n; i++){
		matriz[i] = malloc(sizeof(long)*n);
		for(int j=0; j<n; j++){
			scanf("%ld", &matriz[i][j]);
		}
	}
	if(operacao=='S'){
		printf("%.1lf\n", funSoma(matriz, n));
	} else {
		printf("%.1lf\n", funMedia(matriz, n));
	}
	for(int i=0; i<n; i++)
		free(matriz[i]);
	free(matriz);
	return 0;
}