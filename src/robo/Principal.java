package robo;

public class Principal {
    public static void main(String[] args) {
        TestarRobo exe = new TestarRobo();
        exe.definirAmbiente();
        exe.iniciarRobo();
        exe.menu();
    }
}
