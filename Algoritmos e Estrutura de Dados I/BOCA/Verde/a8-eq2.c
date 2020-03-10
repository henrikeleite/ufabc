#include<stdio.h>
#include<math.h>

int main() {
	int a,b,c;
	double raizPos, raizNeg;
	scanf("%d", &a);
	scanf("%d", &b);
	scanf("%d", &c);
	raizPos = (((b*(-1))) + sqrt((b*b)-(4*a*c)))/(2*a);
	raizNeg = (((b*(-1))) - sqrt((b*b)-(4*a*c)))/(2*a);
	printf("%.4lf %.4lf\n", raizPos, raizNeg);
	return 0;
}