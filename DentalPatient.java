public class DentalPatient {
    private String name;
    private String id;
    private String phone;
    
    public DentalPatient(String name, String id, String phone) {
        this.name = name;
        this.id = id;
        this.phone = phone;
    }
    
    public void showInfo() {
        System.out.println("═══════════════════════════════");
        System.out.println("Paciente: " + name);
        System.out.println("Cédula: " + id);
        System.out.println("Teléfono: " + phone);
        System.out.println("═══════════════════════════════");
    }
    
    public String getName() { return name; }
    public String getId() { return id; }
    public String getPhone() { return phone; }
}
