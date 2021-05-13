package Spring.boot.demo.app.Logic;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Data
@Component
public class SetLogic {

  private final String PREFIX = "頭文字-";

  public String addPrefix(String input){
    return PREFIX + input;
  }
}
