public class Guitar extends BandMember {
    private String 일렉톤;

    public void 톤맞추기(String tone) {
    	this.일렉톤 = tone;
    }
    
    public void 속주하기(){
    	if(this.일렉톤=="crunch"){
			System.out.println("퍼스트 기타가 속주로 기교를 뽐냅니다.");
    	}
    	if(this.일렉톤=="clean"){
			System.out.println("세컨 기타가 속주로 기교를 뽐냅니다.");
    	}
    }

    public void 기타솔로하기(){
    	if(this.일렉톤=="crunch"){
			System.out.println("퍼스트 기타가 지기장장 화려한 기타 솔로를 선보입니다.");
    	}
    	if(this.일렉톤=="clean"){
			System.out.println("세컨 기타가 청명한 소리로 기타 솔로를 선보입니다.");
    	}
    }
    
    public void 공연하기() {
    	if(this.일렉톤=="crunch"){
    			System.out.println("퍼스트 기타가 신나게 멜로디라인을 연주합니다.");
    	}
    	if(this.일렉톤=="clean"){
			System.out.println("세컨 기타가 신나게 스트로크를 칩니다.");
    	}
    }
    
}
