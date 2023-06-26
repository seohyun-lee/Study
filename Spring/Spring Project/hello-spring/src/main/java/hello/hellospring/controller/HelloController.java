package hello.hellospring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello!!");
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template"; //view라는 템플릿 사용
    }
    //API
    @GetMapping("hello-string")
    @ResponseBody //body부에 아래 내용을 직접 넣어주겠다.
    public String helloString(@RequestParam("name") String name){
        return "hello" + name; //html 사용없이 무식하게 출력됨
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello; //객체를 넘긴 경우. 이것이 API 방식이다.
        //http://localhost:8080/hello-api?name=spring! 에서 {"name":"spring!"}이 출력된다. 이것이 JSON 방식.
    }

    static class Hello{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
