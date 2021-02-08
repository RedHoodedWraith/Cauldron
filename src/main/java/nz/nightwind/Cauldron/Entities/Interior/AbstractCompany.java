package nz.nightwind.Cauldron.Entities.Interior;

import org.springframework.stereotype.Component;

@Component
public abstract class AbstractCompany extends Business {

    public AbstractCompany() {
        super();
    }

    public AbstractCompany(String name) {
        super(name);
    }

}
