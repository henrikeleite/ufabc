#include <stdio.h>
int main(){
	long n;
	int count=0;
	scanf("%ld", &n);
	for (int i = 1; i <= n; ++i){
		if(n%i==0){
			if(i%2==0){
				count++;
			}
		}
	}
	printf("%d\n", count);
	return 0;
}