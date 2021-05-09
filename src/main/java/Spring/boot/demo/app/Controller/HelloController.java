package Spring.boot.demo.app.Controller;

import Spring.boot.demo.app.Logic.SetLogic;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequiredArgsConstructor
public class HelloController {

  private final SetLogic setLogic;

  @GetMapping("/hello")
  @ResponseBody
  public String hello() {
    return "Hello World!!!";
  }

  @GetMapping(value = "/set")
  @ResponseBody
  public String set(@RequestParam(name = "name", defaultValue = "デフォルト値") String name) {

    log.info("test log-Slf4j");

    return setLogic.addPrefix(name);
  }

}