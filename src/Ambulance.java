public class Ambulance extends Car {
    protected int Registration;
    public Ambulance(double CIF_Value, int seating_Capacity, double gross_Weight, double engine_Capacity, int age, String transportation_Mode, String plate_System, int storage_Days) {
        super(CIF_Value, seating_Capacity, gross_Weight, engine_Capacity, age, transportation_Mode, plate_System, storage_Days);
        if (plate_System == "APS"){
            Registration = 300000;
        } else if (plate_System == "DPS") {
            Registration = 700000;
        }
    }

    @Override
    public double Compute_Taxes() {
        // Calcul des taxes pour les ambulances
        double taxes = 0;
        taxes += 35000;         // Stamp Duty                 (SD)   // Droits de timbre
        taxes += 20000;         // Form Fees                  (FF)   // Frais de formulaire
        taxes += 200000;        // Excise Duty                (ED)   // Droit d'accise
        taxes += 700000;        // Registration(PlateSystem)  (R)    // Anregistrement (System de plaque)
        if (Age <= 10) {        // Infrastructure Levy        (IL)   // Prélèvement infrastructure
            taxes += 150000;
        }
        else {                  // Infrastructure Levy        (IL)   // Prélèvement infrastructure
            taxes += (CIF *0.15);
        }

        taxes += (Storage_Days * 15000);    // When these vehicles arrive in the country, they are usually stored in a bond. Every day that the car spends in the bond calls for 15,000 Shs

        return taxes;
    }
}