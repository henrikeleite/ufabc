#include<stdio.h>

int main() {
	int horas, minutos, segundos, inputSeg;
	scanf("%d", &inputSeg);
	horas = inputSeg/(60*60);
	inputSeg -= horas*60*60;
	minutos = inputSeg/(60);
	inputSeg -= minutos*60;
	segundos = inputSeg;
	printf("%d:%d:%d\n", horas, minutos, segundos);
	return 0;
}