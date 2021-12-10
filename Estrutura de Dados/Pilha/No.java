package one.digitalInnovation;

public class No {

    private int dado;
    private No RefNo = null;

    public No() {
    }

    public No(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getRefNo() {
        return RefNo;
    }

    public void setRefNo(No refNo) {
        RefNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
