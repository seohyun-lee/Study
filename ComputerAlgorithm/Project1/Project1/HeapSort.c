#include <stdio.h>

void Heapify(int A[], int i, int n)
{
	int maxIndex = i;
	int left = 2 * i;
	int right = 2 * i + 1;
	if (left <= n && A[left] > A[maxIndex]) {
		maxIndex = left;
	}
	if (right <= n && A[right] > A[maxIndex]) {
		maxIndex = right;
	}
	if (maxIndex != i) {
		int temp = A[maxIndex];
		A[maxIndex] = A[i];
		A[i] = temp;
		Heapify(A, maxIndex, n);
	}
}

void BuildHeap(int A[], int n)
{
	int i;
	for (i = n / 2; i >= 1; i--)
	{
		Heapify(A, i, n);
	}
}

void HeapSort(int A[], int n)
{
	int i;
	BuildHeap(A, n);
	for (i = n; i >= 2; i--) {
		int temp = A[1];
		A[1] = A[i];
		A[i] = temp;
		Heapify(A, 1, i - 1);
	}
}

int main()
{
	int i;
	int C[11] = { 0, 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
	HeapSort(C, 10);
	for (i = 0; i < 11; i++)
		printf("%d ", C[i]);
	printf("\n");
}


/*
int main()
{
	int i;
	int A[11] = { 0, 16, 4, 10, 14, 7, 9, 3, 2, 8, 1 };
	Heapify(A, 2, 10);
	for (i = 0; i < 11; i++)
		printf("%d ", A[i]);
	printf("\n");

	int B[11] = { 0, 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
	BuildHeap(B, 10);
	for (i = 0; i < 11; i++)
		printf("%d ", B[i]);
	printf("\n");

	int C[11] = { 0, 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
	HeapSort(C, 10);
	for (i = 0; i < 11; i++)
		printf("%d ", C[i]);
	printf("\n");
}*/