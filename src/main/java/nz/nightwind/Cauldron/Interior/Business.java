package nz.nightwind.Cauldron.Interior;

import nz.nightwind.Cauldron.Entity;
import nz.nightwind.Cauldron.Financials.Reserves.Reserve;

import java.util.HashMap;

public abstract class Business implements Entity {
    private String name;
    private HashMap<String, Reserve> reserves = new HashMap<>();

    public Business(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public Reserve getReserve(String name){
        return reserves.get(name);
    }

    public void addReserve(Reserve newReserve){
        reserves.put(newReserve.getName(), newReserve);
    }

    public boolean renameReserve(String currentReserveName, String newReserveName){
        Reserve r = reserves.remove(currentReserveName);
        if(r == null)
            return false;
        r.changeName(newReserveName);
        addReserve(r);
        return true;
    }

    public Reserve removeReserve(String nameOfReserve){
        return reserves.remove(nameOfReserve);
    }

    public String getSummary(){
        StringBuilder sb = new StringBuilder();

        sb.append("Company Name: ")
        .append(this.getName())
        .append("\n");

        for(Reserve r : reserves.values()){
            sb.append("\t")
            .append(r.getName())
            .append(" : ")
            .append(r.getCurrency().getCurrencyCode())
            .append(" ")
            .append(r.getBalance())
            .append("\n");
        }

        return sb.toString();
    }
}
