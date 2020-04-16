#include <stdio.h>
#include <stdlib.h>

int main(){
	int **matrizA, **matrizB, **matrizC;
	int n;
	scanf("%d", &n);

	matrizA = malloc(sizeof(int)*n);
	for(int i=0; i<n; i++){
		matrizA[i] = malloc(sizeof(int)*n);
		for (int j = 0; j < n; j++){
			scanf("%d", &matrizA[i][j]);
		}
	}

	matrizB = malloc(sizeof(int)*n);
	for(int i=0; i<n; i++){
		matrizB[i] = malloc(sizeof(int)*n);
		for (int j = 0; j < n; j++){
			scanf("%d", &matrizB[i][j]);
		}
	}

	matrizC = malloc(sizeof(int)*n);
	for(int i=0; i<n; i++){
		matrizC[i] = malloc(sizeof(int)*n);
		for (int j = 0; j < n; j++){
			matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
		}
	}
	for(int i=0; i<n; i++){
		for (int j = 0; j < n; j++){
			printf("%d", matrizC[i][j]);
			if(!(j==n-1)){
				printf(" ");
			}
		}
		printf("\n");
	}
	for(int i=0; i<n; i++){
		free(matrizA[i]);
		free(matrizB[i]);
		free(matrizC[i]);		
	}
	free(matrizA);
	free(matrizB);
	free(matrizC);

	return 0;
}