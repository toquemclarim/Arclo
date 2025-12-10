
import java.time.LocalDate;
// Atributos do projeto
public class Projeto {
    private int codigoRegistro;
    private String nomeCliente;
    private double valorProjeto;
    private String linhaProjeto;
    private String statusProjeto;
    private String formaDePagamento;
    private LocalDate dataCriacao;
    private LocalDate dataPrazo;
    private String localizacao;

// Construtor vazio 
    public Projeto() {
}

    public Projeto(int codigoRegistro, String nomeCliente, double valorProjeto, String linhaProjeto,
               String statusProjeto, String formaDePagamento, LocalDate dataCriacao,
               LocalDate dataPrazo, String localizacao) {
    this.codigoRegistro = codigoRegistro;
    this.nomeCliente = nomeCliente;
    this.valorProjeto = valorProjeto;
    this.linhaProjeto = linhaProjeto;
    this.statusProjeto = statusProjeto;
    this.formaDePagamento = formaDePagamento;
    this.dataCriacao = dataCriacao;
    this.dataPrazo = dataPrazo;
    this.localizacao = localizacao;
    }

    ///// Getters and Setters ///////

// Codigo de registro
    public int getCodigoRegistro() {
        return codigoRegistro;
    }
// Nome do cliente
    public String getNomeCliente () {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
    if (nomeCliente != null && !nomeCliente.isBlank()) {
        this.nomeCliente = nomeCliente;
    } else {
        throw new IllegalArgumentException("Digite um nome válido.");
    }
// Valor do Projeto
    }
    public double getValorProjeto() {
        return valorProjeto;
    }
    public void setValorProjeto(double valorProjeto) {
        if (valorProjeto >= 1) {
            this.valorProjeto = valorProjeto;
        } else {
            throw new IllegalArgumentException("Digite um valor válido para o projeto.");
        }
    }
}

