public class SUV extends Car {
    protected int Registration;
    public SUV(double CIF_Value, int seating_Capacity, double gross_Weight, double engine_Capacity,int age, String transportation_Mode, String plate_System, int storage_Days) {
        super(CIF_Value, seating_Capacity, gross_Weight, engine_Capacity, age, transportation_Mode, plate_System, storage_Days);
        if (plate_System == "APS"){
            Registration = 300000;
        } else if (plate_System == "DPS") {
            Registration = 700000;
        }
    }

    @Override
    public double Compute_Taxes() {
        // Calcul des taxes pour les voitures SUV
        double taxes = 0;
        taxes += CIF * 0.25;        // Import Duty -------------> (ID)  // Droits d'importation
        taxes += CIF * 0.18;        // Value Added Tax ---------> (VAT) // Taxe sur la valeur ajoutée
        taxes += CIF * 0.06;        // Withholding Tax ---------> (WHT) // Retenue à la source
        taxes += 150000;            // Infrastructure Levy -----> (IL)  // Prélèvement infrastructure
        taxes += 35000;             // Stamp Duty --------------> (SD)  // Droits de timbre
        taxes += 20000;             // Form Fees ---------------> (FF)  // Frais de formulaire
        taxes += 200000;            // Excise Duty -------------> (ED)  // Droit d'accise
        taxes += Registration;      // Registration(PlateSystem)  (R)   // Anregistrement (System de plaque)

        if (Gross_Weight < 1500){   // If the vehicle has a gross weight ...
            taxes += CIF * 0.02;
        } else if (Gross_Weight >= 1500 && Gross_Weight <= 2000) {
            taxes += CIF * 0.10;
        } else if (Gross_Weight > 2000) {
            taxes += CIF * 0.15;
        }

        if (Age < 5){
            taxes += CIF * 0.015;
        }else if(5 <= Age && Age < 10){
            taxes += CIF * 0.05;
        } else if (10 <= Age && Age <= 15){
            taxes += CIF * 0.10;
        } else {
            System.out.println("You cannot import a SEDANT older than 15 Years");
        }

        if (Transportation_Mode == "Carrier Bed Vehicle") {
            taxes += CIF * 0.05;
        } else if (Transportation_Mode == "Driven") {
            taxes += CIF * 0.015;
        }

        taxes += (Storage_Days * 15000);    // When these vehicles arrive in the country, they are usually stored in a bond. Every day that the car spends in the bond calls for 15,000 Shs

        return taxes;
    }
}