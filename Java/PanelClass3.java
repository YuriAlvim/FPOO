import javax.swing.JOptionPane;

public class PanelClass3 {
    public static void main(String[]args) {
        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
        float n3 = Float.parseFloat(JOptionPane.showInputDialog("Nota 3"));
        float n4 = Float.parseFloat(JOptionPane.showInputDialog("Nota 4"));
        float media = (n1 + n2 + n3 + n4)/4;

        if (media > 7){
            JOptionPane.showMessageDialog(null, "Sua média final foi: "+media, "Resultado",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Você foi aprovado(a)! Continue se esforçando ;)", "Parabéns!",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Sua média final foi: "+media, "Resultado",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Você foi reprovado(a), mas continue tentanto, sei que vai melhorar ;)", "Talvez na próxima ;-;",JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }
    
}