package ExercicioSenha;

public class SenhaInvalidaExption extends RuntimeException {
    public SenhaInvalidaExption(String mensagem) {
        super(mensagem);
    }
}
