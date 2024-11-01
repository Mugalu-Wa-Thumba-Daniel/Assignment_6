public abstract class Car {
    protected double CIF;       // Valeur_CIF
    protected int Seating_Capacity;         // Capacite_Accuil
    protected double Gross_Weight;          // Poid_Brut
    protected double Engine_Capacity;       // Capacité du moter en CC
    protected String Plate_System;          // Systeme_Plaque
    protected int Age;                      // Age
    protected String Transportation_Mode;   // Mode_Transport
    protected int Storage_Days;             // Stockage dans l'entrepot
    protected int Registration;

    public Car(double CIF_Value, int seating_Capacity, double gross_Weight, double engine_Capacity, int age, String transportation_Mode, String plate_System, int storage_Days) {
        this.CIF = CIF_Value;
        this.Seating_Capacity = seating_Capacity;
        this.Gross_Weight = gross_Weight;
        this.Engine_Capacity = engine_Capacity;
        this.Age = age;
        this.Transportation_Mode = transportation_Mode;
        this.Plate_System = plate_System;
        this.Storage_Days = storage_Days;
    }
    public abstract double Compute_Taxes(); // Calculer_Taxes
}