package nz.nightwind.Cauldron.Entities.Interior;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

@Component
public class LimitedCompany extends AbstractCompany {

    @Autowired
    public LimitedCompany() {
        super();
    }

    public LimitedCompany(String name) {
        super(name);
    }

}
