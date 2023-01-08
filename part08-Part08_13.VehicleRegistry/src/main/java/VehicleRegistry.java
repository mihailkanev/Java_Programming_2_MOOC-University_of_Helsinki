import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> reg;

    public VehicleRegistry() {
        this.reg = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!reg.containsKey(licensePlate)) {
            reg.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        return reg.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (reg.containsKey(licensePlate)) {
            reg.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate x : reg.keySet()) {
            System.out.println(x);
        }
    }

    public void printOwners() {
        ArrayList<String> list = new ArrayList<>();

        for (String string : reg.values()) {
            if(!list.contains(string)){
                list.add(string);
            }
        }

        for (String string : list) {
            System.out.println(string);
        }
    }
}
