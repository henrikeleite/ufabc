#include<stdio.h>

int main() {
	int anoAtual, anoNasc;
	char nome[100];
	scanf("%d %s %d", &anoAtual, &nome, &anoNasc);
	printf("%s, voce completa %d anos de idade neste ano.\n", nome, (anoAtual - anoNasc));
	return 0;
}