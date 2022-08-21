package programmer.spring.core.data;

import lombok.Getter;
import org.springframework.stereotype.Component;
import programmer.spring.core.aware.IdAware;

@Component
public class Car implements IdAware {

  @Getter
  private String id;

  @Override
  public void setId(String id) {
    this.id = id;
  }
}
