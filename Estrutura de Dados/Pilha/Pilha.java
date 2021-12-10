package one.digitalInnovation;

public class Pilha {
    private No refEntradaNoPilha;

    public Pilha() {
        this.refEntradaNoPilha = null;
    }

    public void push(No novoNo) {
        No refAuxiliar = refEntradaNoPilha;
        refEntradaNoPilha = novoNo;
        refEntradaNoPilha.setRefNo(refAuxiliar);
    }

    public No pop() {
        if (!this.isEmpty()) {
            No noPoped = refEntradaNoPilha;
            refEntradaNoPilha = refEntradaNoPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public No top() {
        return refEntradaNoPilha;
    }

    public boolean isEmpty() {
        if (refEntradaNoPilha == null) {
            return true;
        }
        return false;
    }
    @Override
    public String toString () {
        String stringRetorno = "--------------\n";
        stringRetorno += "    Pilha\n";
        No noAuxiliar = refEntradaNoPilha;
        while (true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }
            else {
                break;
            }
        }
        stringRetorno += "==============\n";
        return stringRetorno;
    }
}