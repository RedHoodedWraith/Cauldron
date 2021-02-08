package nz.nightwind.Cauldron;

import nz.nightwind.Cauldron.Financials.Reserves.GenericReserve;
import nz.nightwind.Cauldron.Financials.Reserves.Reserve;
import nz.nightwind.Cauldron.Financials.Transactions.Transaction;
import nz.nightwind.Cauldron.Entities.Interior.AbstractCompany;
import nz.nightwind.Cauldron.Entities.Interior.LimitedCompany;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Currency;

import static org.junit.Assert.fail;

public class SimpleTests {

    public static String PRIMARY_BANK_ACC = "Primary Bank Account";
    public static Currency nzd = Currency.getInstance("NZD");

    @Test
    public void simpleTransaction(){
        System.out.println("Cauldron Business Manager\n");

        ArrayList<AbstractCompany> companies = new ArrayList<>();

        LimitedCompany company1 = new LimitedCompany("Company Inc. A");
        company1.addReserve(new GenericReserve(PRIMARY_BANK_ACC, nzd));
        companies.add(company1);

        LimitedCompany company2 = new LimitedCompany("Company Inc. B");
        company2.addReserve(new GenericReserve(PRIMARY_BANK_ACC, nzd));
        companies.add(company2);

        GenericReserve r1 = (GenericReserve) company1.getReserve(PRIMARY_BANK_ACC);
        r1.addFunds(100);

        GenericReserve r2 = (GenericReserve) company2.getReserve(PRIMARY_BANK_ACC);
        r2.addFunds(150);

        System.out.println("Before Transaction:");
        for(AbstractCompany company : companies){
            System.out.println(company.getSummary());
        }

        Transaction<Reserve, Reserve> t = new Transaction<>(r1, r2, nzd, 69.42);
        System.out.println("Transaction " + (t.getSuccessState() ? "Passed" : "Failed") + "\n");

        System.out.println("After Transaction:");
        for(AbstractCompany company : companies) {
            System.out.println(company.getSummary());
        }

    }

}
