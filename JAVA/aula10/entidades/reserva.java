package entidades;

public class reserva {
    private Propriedade propriedade;
    private hospede hospede;
    private String checkIn;
    private String checkOut;
    private double precoTotal;

    // Construtor para inicialização dos atributos
    public reserva(Propriedade propriedade, hospede hospede, String checkIn, String checkOut, double precoTotal) {
        this.propriedade = propriedade;
        this.hospede = hospede;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.precoTotal = precoTotal;
    }

    // Métodos get e set para os atributos
    public Propriedade getPropriedade() {
        return propriedade;
    }

    public void setPropriedade(Propriedade propriedade) {
        this.propriedade = propriedade;
    }

    public hospede getHospede() {
        return hospede;
    }

    public void setHospede(hospede hospede) {
        this.hospede = hospede;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
}
