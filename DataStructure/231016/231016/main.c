#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

enum level { freshman = 1, sophomore, junior, senior }; //�г�
struct student {		//�л� ������ ������ ����ü ���
	char name[20];		//�̸�
	enum level year;	//�г�
	int score;			//����
	struct student* next;	//�ٸ� �л��� ����Ű�� ������
};

typedef struct student STUDENT; //�г��� ����

STUDENT* buildClass(STUDENT* list) {
	FILE* fp = NULL;	//���� ������
	STUDENT* temp = (STUDENT*)malloc(sizeof(STUDENT));	//�ӽú��� temp ����
	if (temp == NULL) {	//�޸� �Ҵ��� ���� ���� ���
		fprintf(stderr, "�޸� �Ҵ� ����");
		exit(1);
	}

	fp = fopen("class.txt", "r");	//class.txt���� ����
	if (fp == NULL) {	//������ ���� �� ���� ���
		fprintf(stderr, "������ ���� �� ����");
		exit(1);
	}

	while (fscanf(fp, "%s %d %d", temp->name, &temp->year, &temp->score) == 3) {	//���Ͽ��� (���ڿ�, ����, ����) 3�� ������ �д´� (���� ������)
		if (list == NULL || strcmp(temp->name, list->name) < 0) {	//list�� ���� ��尡 ���ų� temp->name�� list->name���� ���ĺ��� ���� ���
			temp->next = list;	//temp ��带 ���� list ��� �տ� �����ϰ�
			list = temp;	//list �����Ͱ� temp ��带 ����Ű�� ��
		}
		else {	//temp->name�� list->name���� ���ĺ��� ���� ���
			STUDENT* current = list;	//list�� ��带 �ϳ��� ����ų ������ current

			while (current->next != NULL && strcmp(temp->name, current->next->name) >= 0) {	//������ ���ų� temp->name�� current->next->name���� ���ĺ��� ���� ������ �ѱ�
				current = current->next;	//current �����Ͱ� current->next�� ����Ű�� ��
			}
			temp->next = current->next;	//temp ��带 current ��� �ڿ� ����
			current->next = temp;
		}

		temp = (STUDENT*)malloc(sizeof(STUDENT));	//temp�� ���� �޸� �Ҵ�
		if (temp == NULL) {	//�޸� �Ҵ��� ���� ���� ���
			fprintf(stderr, "�޸� �Ҵ� ����");
			fclose(fp);
			exit(1);
		}
	}

	fclose(fp);	//���� �ݱ�
	return list;
}

void printClass(STUDENT* list) {	//list�� ���ϴ� ��� �л����� ������ ������� ȭ�鿡 ����ϴ� �Լ�
	STUDENT* stu = list;

	printf("\n=== �л� ���� ��� ===\n\n");
	while (stu) {
		printf("%-5s : %d�г�, %3d��\n", stu->name, stu->year, stu->score);
		stu = stu->next;	//���� �л����� �̵�
	}
	printf("\n\n");
}

void printStudent(STUDENT* list, const char* p) {	//�̸��� p(���� �迭)�� �л��� ������ ȭ�鿡 ����ϴ� �Լ�
	STUDENT* stu = list;

	printf("\n=== �л� 1�� ��� ===\n\n");
	while (stu) {
		if (strcmp(stu->name, p) == 0) {	//strcmp �Լ��� ���� ��� stu->name�� p�� ���ڿ��� ��ġ�ϸ� ��ȯ���� 0�̴�
			printf("%-5s : %d�г�, %3d��\n", stu->name, stu->year, stu->score);
		}
		stu = stu->next;	//���� �л����� �̵�
	}
	printf("\n\n");
}

void findStudents(STUDENT* list, int low, int high) {	//������ low <= score �̰� score <= high �� �����ϴ� �л����� ������ ����ϴ� �Լ�
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

void printYear(STUDENT* list, enum level year) {	//�г��� year�� �л����� ������ ����ϴ� �Լ�
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
	STUDENT* list = NULL;		//�л� ����Ʈ ����ų ������

	list = buildClass(list);	//�л� ����Ʈ ����
	printClass(list);			//�л� ����Ʈ ���
	printStudent(list, "Park");	//Park�� ���� ���
	findStudents(list, 70, 80);	//70���� 80�� ������ �л� ���� ���
	printYear(list, junior);	//3�г� �л� ���� ���
	return 0;
}