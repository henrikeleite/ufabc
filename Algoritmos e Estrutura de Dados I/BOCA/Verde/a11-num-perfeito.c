#include <stdio.h>
int main(){
	long n;
	int somador=0;
	scanf("%ld", &n);
	for (int i = 1; i < n; ++i){
		if(n%i==0){
			somador+=i;
		}
	}
	if (somador==n){
		printf("SIM\n");
	} else {
		printf("NAO\n");
	}
	
	return 0;
}