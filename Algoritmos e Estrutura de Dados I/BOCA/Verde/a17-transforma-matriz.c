#include<stdio.h>

int main(){
	long n,m;
	scanf("%ld", &n);
	scanf("%ld", &m);
	long Matriz[n][m];
	for (long i = 0; i < n; i++){
		for (long j = 0; j < m; j++){
			scanf("%ld", &Matriz[i][j]);
		}
	}
	for (long i = 0; i < m; i++){
		for (long j = 0; j < n; j++){
			printf("%ld", Matriz[j][i]);
			if((j+1)!=n){
				printf(" ");
			}
		}
		printf("\n");
	}
	return 0;
}