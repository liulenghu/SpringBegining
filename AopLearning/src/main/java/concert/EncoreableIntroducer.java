package concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Created by liujiajia on 2017/3/28.
 */
@Aspect
@Component
public class EncoreableIntroducer {
    @DeclareParents(value = "concert.Performance+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
