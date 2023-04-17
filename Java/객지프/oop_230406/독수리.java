public class 독수리 extends 동물 {

    public void 날기(){
    	System.out.println("독수리가 하늘을 훨훨 날아다닙니다.");
    }
    
    //상속받은 메소드를 객체 성격에 맞도록 다시 재정의: 오버라이트 override
    public void 움직이기() {
    	날기();
    }

}
