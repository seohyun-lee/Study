#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

enum level { freshman=1, sophomore, junior, senior }; //학년
struct student {		//학생 정보를 저장할 구조체 모양
	char name[20];		//이름
	enum level year;	//학년
	int score;			//점수
	struct student* next;	//다른 학생을 가리킬 포인터
};

typedef struct student STUDENT; //닉네임 정의

STUDENT* buildClass(STUDENT* list) { //list에 첫 학생 저장
	FILE* fp = NULL;
	STUDENT* temp = (STUDENT*)malloc(sizeof(STUDENT));
	if (temp == NULL) {
		fprintf(stderr, "메모리 할당 에러");
		exit(1);
	}

	fp = fopen("class.txt", "r");
	if (fp == NULL) exit(1); //파일을 읽을 수 없음

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
			fprintf(stderr, "메모리 할당 에러");
			fclose(fp);
			exit(1);
		}
	}

	fclose(fp);
	return list;
}

void printClass(STUDENT* list) {
	STUDENT* stu = list;

	printf("\n=== 학생 정보 출력 ===\n\n");
	while (stu) {
		printf("%-5s : %d학년, %3d점\n", stu->name, stu->year, stu->score);
		stu = stu->next;
	}
	printf("\n\n");
}

void printStudent(STUDENT* list, const char* p) {
	STUDENT* stu = list;

	printf("\n=== 학생 1명 출력 ===\n\n");
	while (stu) {
		if (strcmp(stu->name, p) == 0) {
			printf("%-5s : %d학년, %3d점\n", stu->name, stu->year, stu->score);
		}
		stu = stu->next;
	}
	printf("\n\n");
}

void findStudents(STUDENT* list, int low, int high) {
	STUDENT* stu = list;

	printf("\n=== %d점과 %d점 사이의 학생 정보 ===\n\n", low, high);
	while (stu) {
		if (stu->score >= low && stu->score <= high) {
			printf("%-5s : %d학년, %3d점\n", stu->name, stu->year, stu->score);
		}
		stu = stu->next;
	}
	printf("\n\n");
}

void printYear(STUDENT* list, enum level year) {
	STUDENT* stu = list;

	printf("\n=== %d학년 학생 정보 ===\n\n", year);
	while (stu) {
		if (stu->year == year) {
			printf("%-5s : %d학년, %3d점\n", stu->name, stu->year, stu->score);
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