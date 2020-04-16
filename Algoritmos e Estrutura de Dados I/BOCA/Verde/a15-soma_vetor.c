#include <stdio.h>
#include <stdlib.h>

int main(){
	int *vetor;
	long n, total=0;
	scanf("%ld", &n);
	vetor = malloc(sizeof(int)*n);
	for(int i=0; i<n; i++){
		scanf("%d", &vetor[i]);
	}
	for (int i = 0; i < n; i++){
		total += vetor[i];
	}
	printf("%ld\n", total);
	return 0;
}