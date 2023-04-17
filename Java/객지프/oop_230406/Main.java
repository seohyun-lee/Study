
public class Main {

	public static void main(String[] args) {
		강아지 a = new 강아지();
		고양이 b = new 고양이();
		독수리 c = new 독수리(); //자유로운 heap이라는 공간에 강아지, 고양이, 독수리라는 객체 세마리 만듬.
		//누군가는 얘 위치를  (가리키도록) 저장하고 있어야 함. so 변수 이름 겅한다.
		
		동물 d = new 강아지(); //얘네는 동물로 볼 수도 있어
		d.움직이기();
		
		movable e = new 독수리();
		//movable 인터페이스 배열로 만들어 접근하기
		
		movable [] m = {a, b, c, d};
		
		for(int i=0;i<m.length; i++) {
			m[i].움직이기();
		}
		
		//for-each 문
		for(movable ani : m) {
			ani.움직이기();
		}

		//동물[] 동물농장 = new 동물[3];
		//동물농장[0] = a;
		//동물농장[1] = b;
		//동물농장[2] =c;

		
		동물[] 동물농장 = {a, b, c, new 뱀()};
		for(동물 ani : 동물농장) {
			ani.움직이기();
		}
		
		/*
		for(int i=0; i<동물농장. length; i++) {
			동물농장[i].움직이기();
		}
		*/
	}

}
