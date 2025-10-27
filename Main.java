public class Main {
    public static void main(String[] args) {
        System.out.println(" CLÍNICA DENTAL SONRISAS SALUDABLES");
        System.out.println("Listado de Pacientes Registrados\n");
        
        DentalPatient paciente1 = new DentalPatient("María Rodríguez", "1015438920", "3102345678");
        DentalPatient paciente2 = new DentalPatient("Carlos Gómez", "79548321", "3156789012");
        DentalPatient paciente3 = new DentalPatient("Ana Martínez", "1023456789", "3187654321");
        DentalPatient paciente4 = new DentalPatient("Luis Fernández", "80123456", "3209876543");
        DentalPatient paciente5 = new DentalPatient("Laura Pérez", "1034567890", "3198765432");
        
        paciente1.showInfo();
        paciente2.showInfo();
        paciente3.showInfo();
        paciente4.showInfo();
        paciente5.showInfo();
        
        System.out.println("Total de pacientes registrados: 5");
    }
}