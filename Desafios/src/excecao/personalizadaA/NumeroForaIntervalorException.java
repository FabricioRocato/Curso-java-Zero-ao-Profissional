package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroForaIntervalorException extends RuntimeException {

    private String nomeDoAtributo;
    NumeroForaIntervalorException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo %s está fora do intervalo", nomeDoAtributo);
    }
}
