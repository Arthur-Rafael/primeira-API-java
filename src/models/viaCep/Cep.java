package models.viaCep;

public class Cep implements Comparable<Cep>{

    private String cep;

    public Cep (meuCep cep) {
        this.cep = String.valueOf(cep);
    }

    public String getCep() {
        return this.cep;
    }

    @Override
    public int compareTo(Cep outroCep) {
        return this.getCep().compareTo(outroCep.getCep());
    }
}
