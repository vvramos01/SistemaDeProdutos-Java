package Prod;

public class ProdutoImportado extends Produto {

    private Double taxaAlfandega;

    public ProdutoImportado() {
        super();
    }

    public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    public Double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(Double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }

    public Double precoTotal() {
        return getPreco() + taxaAlfandega;
    }

    @Override
    public String etiquetaPreco() {
        return getNome()
                + " R$ "
                + String.format("%.2f", precoTotal())
                + " (Taxa de alfândega: R$ "
                + String.format("%.2f", taxaAlfandega)
                + ")";
    }
}
