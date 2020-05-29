#include<stdio.h>

int main(){
	long n;
	scanf("%ld", &n);
	long m1[n][n], m2[n][n];
	for (long i = 0; i < n; i++){
		for (long j = 0; j < n; j++){
			scanf("%ld", &m1[i][j]);
		}
	}
	for (long i = 0; i < n; i++){
		for (long j = 0; j < n; j++){
			scanf("%ld", &m2[i][j]);
		}
	}
	for (long i = 0; i < n; i++){
		for (long j = 0; j < n; j++){
			printf("%ld", m1[i][j] + m2[i][j]);
			if((j+1)!=n){
				printf(" ");
			}
		}
		printf("\n");
	}
	return 0;
}