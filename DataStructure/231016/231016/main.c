#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

enum level { freshman = 1, sophomore, junior, senior }; //학년
struct student {		//학생 정보를 저장할 구조체 모양
	char name[20];		//이름
	enum level year;	//학년
	int score;			//점수
	struct student* next;	//다른 학생을 가리키는 포인터
};

typedef struct student STUDENT; //닉네임 정의

STUDENT* buildClass(STUDENT* list) {
	FILE* fp = NULL;	//파일 포인터
	STUDENT* temp = (STUDENT*)malloc(sizeof(STUDENT));	//임시변수 temp 생성
	if (temp == NULL) {	//메모리 할당이 되지 않은 경우
		fprintf(stderr, "메모리 할당 에러");
		exit(1);
	}

	fp = fopen("class.txt", "r");	//class.txt파일 열기
	if (fp == NULL) {	//파일을 읽을 수 없는 경우
		fprintf(stderr, "파일을 읽을 수 없음");
		exit(1);
	}

	while (fscanf(fp, "%s %d %d", temp->name, &temp->year, &temp->score) == 3) {	//파일에서 (문자열, 정수, 정수) 3개 값씩을 읽는다 (파일 끝까지)
		if (list == NULL || strcmp(temp->name, list->name) < 0) {	//list에 아직 노드가 없거나 temp->name이 list->name보다 알파벳이 앞인 경우
			temp->next = list;	//temp 노드를 기존 list 노드 앞에 삽입하고
			list = temp;	//list 포인터가 temp 노드를 가리키게 함
		}
		else {	//temp->name이 list->name보다 알파벳이 뒤인 경우
			STUDENT* current = list;	//list의 노드를 하나씩 가리킬 포인터 current

			while (current->next != NULL && strcmp(temp->name, current->next->name) >= 0) {	//마지막 노드거나 temp->name이 current->next->name보다 알파벳이 앞일 때까지 넘김
				current = current->next;	//current 포인터가 current->next를 가리키게 함
			}
			temp->next = current->next;	//temp 노드를 current 노드 뒤에 삽입
			current->next = temp;
		}

		temp = (STUDENT*)malloc(sizeof(STUDENT));	//temp에 다음 메모리 할당
		if (temp == NULL) {	//메모리 할당이 되지 않은 경우
			fprintf(stderr, "메모리 할당 에러");
			fclose(fp);
			exit(1);
		}
	}

	fclose(fp);	//파일 닫기
	return list;
}

void printClass(STUDENT* list) {	//list에 속하는 모든 학생들의 정보를 순서대로 화면에 출력하는 함수
	STUDENT* stu = list;

	printf("\n=== 학생 정보 출력 ===\n\n");
	while (stu) {
		printf("%-5s : %d학년, %3d점\n", stu->name, stu->year, stu->score);
		stu = stu->next;	//다음 학생으로 이동
	}
	printf("\n\n");
}

void printStudent(STUDENT* list, const char* p) {	//이름이 p(문자 배열)인 학생의 정보를 화면에 출력하는 함수
	STUDENT* stu = list;

	printf("\n=== 학생 1명 출력 ===\n\n");
	while (stu) {
		if (strcmp(stu->name, p) == 0) {	//strcmp 함수로 비교한 결과 stu->name과 p의 문자열이 일치하면 반환값이 0이다
			printf("%-5s : %d학년, %3d점\n", stu->name, stu->year, stu->score);
		}
		stu = stu->next;	//다음 학생으로 이동
	}
	printf("\n\n");
}

void findStudents(STUDENT* list, int low, int high) {	//점수가 low <= score 이고 score <= high 를 만족하는 학생들의 정보를 출력하는 함수
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

void printYear(STUDENT* list, enum level year) {	//학년이 year인 학생들의 정보를 출력하는 함수
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
	STUDENT* list = NULL;		//학생 리스트 가리킬 포인터

	list = buildClass(list);	//학생 리스트 구축
	printClass(list);			//학생 리스트 출력
	printStudent(list, "Park");	//Park의 정보 출력
	findStudents(list, 70, 80);	//70점과 80점 사이의 학생 정보 출력
	printYear(list, junior);	//3학년 학생 정보 출력
	return 0;
}