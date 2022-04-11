import javax.swing.JOptionPane;

public class PanelClass2 {
    public static void main(String[]args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Valor A"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Valor B"));
        int res = n1 + n2;
        JOptionPane.showMessageDialog(null, "Resultado da soma: "+res, "Resultado",JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}