import javax.swing.JOptionPane;

public class Tri {
    public static void main(String[] args) {
        int la = Integer.parseInt(JOptionPane.showInputDialog("Lado 1"));
        int lb = Integer.parseInt(JOptionPane.showInputDialog("Lado 2"));
        int lc = Integer.parseInt(JOptionPane.showInputDialog("Lado 3"));

        if (((la + lb) > lc) && ((la + lc) > lb) && ((lb + lc) > la)) {
            if ((la == lb) && (la == lc)) {
                JOptionPane.showMessageDialog(null, "Esse triângulo é equilátero", "Equilátero",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                if ((la == lb) || (la == lc) || (lb == lc)) {
                    JOptionPane.showMessageDialog(null, "Esse triângulo é isóceles", "Isóceles",
                            JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, "Esse triângulo é escaleno", "Escaleno",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Sinto em lhe dizer mas isso não é um triângulo", "Não é um triângulo",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
