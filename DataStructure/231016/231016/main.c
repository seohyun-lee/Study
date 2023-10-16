#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

enum level { freshman=1, sophomore, junior, senior }; //�г�
struct student {		//�л� ������ ������ ����ü ���
	char name[20];		//�̸�
	enum level year;	//�г�
	int score;			//����
	struct student* next;	//�ٸ� �л��� ����ų ������
};

typedef struct student STUDENT; //�г��� ����

STUDENT* buildClass(STUDENT* list) { //list�� ù �л� ����
	FILE* fp = NULL;
	STUDENT* temp = (STUDENT*)malloc(sizeof(STUDENT));
	if (temp == NULL) {
		fprintf(stderr, "�޸� �Ҵ� ����");
		exit(1);
	}

	fp = fopen("class.txt", "r");
	if (fp == NULL) exit(1); //������ ���� �� ����

	while (fscanf(fp, "%s %d %d", temp->name, &temp->year, &temp->score) == 3) {
		if (list == NULL || strcmp(temp->name, list->name) < 0) {
			temp->next = list;
			list = temp;
		}
		else {
			STUDENT* current = list;

			while (current->next != NULL && strcmp(temp->name, current->next->name) >= 0) {
				current = current->next;
			}
			temp->next = current->next;
			current->next = temp;
		}
		
		temp = (STUDENT*)malloc(sizeof(STUDENT));
		if (temp == NULL) {
			fprintf(stderr, "�޸� �Ҵ� ����");
			fclose(fp);
			exit(1);
		}
	}

	fclose(fp);
	return list;
}

void printClass(STUDENT* list) {
	STUDENT* stu = list;

	printf("\n=== �л� ���� ��� ===\n\n");
	while (stu) {
		printf("%-5s : %d�г�, %3d��\n", stu->name, stu->year, stu->score);
		stu = stu->next;
	}
	printf("\n\n");
}

void printStudent(STUDENT* list, const char* p) {
	STUDENT* stu = list;

	printf("\n=== �л� 1�� ��� ===\n\n");
	while (stu) {
		if (strcmp(stu->name, p) == 0) {
			printf("%-5s : %d�г�, %3d��\n", stu->name, stu->year, stu->score);
		}
		stu = stu->next;
	}
	printf("\n\n");
}

void findStudents(STUDENT* list, int low, int high) {
	STUDENT* stu = list;

	printf("\n=== %d���� %d�� ������ �л� ���� ===\n\n", low, high);
	while (stu) {
		if (stu->score >= low && stu->score <= high) {
			printf("%-5s : %d�г�, %3d��\n", stu->name, stu->year, stu->score);
		}
		stu = stu->next;
	}
	printf("\n\n");
}

void printYear(STUDENT* list, enum level year) {
	STUDENT* stu = list;

	printf("\n=== %d�г� �л� ���� ===\n\n", year);
	while (stu) {
		if (stu->year == year) {
			printf("%-5s : %d�г�, %3d��\n", stu->name, stu->year, stu->score);
		}
		stu = stu->next;
	}
	printf("\n\n");
}

int main() {
	STUDENT* list = NULL;

	list = buildClass(list);
	printClass(list);
	printStudent(list, "Park");
	findStudents(list, 70, 80);
	printYear(list, junior);
	return 0;
}