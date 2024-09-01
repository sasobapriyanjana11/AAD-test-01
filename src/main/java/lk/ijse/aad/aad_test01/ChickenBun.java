package lk.ijse.aad.aad_test01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChickenBun implements Food {

    @Autowired(required = true)
    @Override
    public void preferFood() {
        System.out.println("chicken bun");
    }
}
