package gdscstudy.serverstudy3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController {
    @GetMapping("/") //root url 경로
    public String home(Model model){
        model.addAttribute("description", "메인 페이지입니다.");
        //key-value 쌍을 모델에 추가 (attributeName "des...", attributeValue "메인...")
        return "index"; //html 파일명
    }

    @GetMapping("/members") //url 경로
    public String showMembers(Model model){ //Model은 데이터를 View로 전달하기 위해 사용됨
        model.addAttribute("member1", "Seohyun Lee");
        model.addAttribute("member2", "Haeseung Jeon");
        model.addAttribute("member3", "Hyuna Kim");
        return "members"; //html 파일명
    }

    @GetMapping("/members/new") //url 경로
    public String showNewMember(@RequestParam(name = "name", defaultValue = "guest") String name,
                                //@RequestParam은 쿼리 스트링 방식으로 url을 통해 파라미터로 값을 받아옴
                                //"?name=value1&email=value2": query string(쿼리 파라미터), '&' 연산자 사용해 쿼리 스트링 여러개
                                //"name"은 쿼리 파라미터의 key, name 매개변수에 value 받아옴. "guest"은 value 없을 경우 기본값.
                                String email,   //RequestParam 생략 (자동으로 데이터 파싱), email 매개변수에 value 받아옴
                                Model model){
        model.addAttribute("name", name);   //"name"은 View의 변수 이름(key), name에 value 있음. 모델에 추가
        model.addAttribute("email", email); //"email"은 View의 변수 이름(key), email에 value 있음. 모델에 추가
        return "newMember"; //html 파일명
    }
}
//동영상 : https://drive.google.com/file/d/1kaPrxyZM4b8yTSnxNVRAOqSYwahvLMST/view?usp=sharing
//참고자료 :
// [Spring] @RequestParam 사용법 https://dangdangee.tistory.com/entry/Spring-RequestParam-%EC%82%AC%EC%9A%A9%EB%B2%95
// [Spring] @RequestParam - 요청 파라미터 데이터 파싱하기 https://amy-it.tistory.com/108
// [Spring] Spring MVC: Controller에서 parameter를 받아오는 방법 https://ooeunz.tistory.com/99