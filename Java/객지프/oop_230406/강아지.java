public class 강아지 extends 동물 {

    public void 뛰기(){
    	System.out.println("강아지가 풀밭을 총총 뛰어다닙니다.");
    }
    
    //상속받은 메소드를 객체 성격에 맞도록 다시 재정의: 오버라이트 override
    public void 움직이기() {
    	뛰기();
    }

}
