package programmer.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import programmer.spring.core.configuration.BarConfiguration;
import programmer.spring.core.configuration.FooConfiguration;

@Configuration
@Import({
    FooConfiguration.class,
    BarConfiguration.class
})
public class MainConfiguration {
}
