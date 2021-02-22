package nz.nightwind.Cauldron.Entities;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

public interface Entity {

    String LIMITED_COMPANY = "Limited Company";
    String UNLIMITED_COMPANY = "Unlimited Company";
    String PARTNERSHIP = "Partnership";
    String SOLE_TRADER = "Sole Trader";

    String getName();

}
