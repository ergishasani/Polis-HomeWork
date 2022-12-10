package detyrat_polis;


import javax.swing.JOptionPane;

public class Even_Numbers {
	public static void main(String[] args) {

int shuma_1= (int) Double.parseDouble(JOptionPane.showInputDialog(null, "Jepni Numrin E Pare: "));
int shuma_2= (int) Double.parseDouble(JOptionPane.showInputDialog(null, "Jepni Numrin E Dyte: "));


int sum = 0;
for (int i = shuma_1; i <= shuma_2; i++) {
  if (i % 2 == 0) {
    sum += i;
  }
}


JOptionPane.showMessageDialog(null, "Shuma e mbledhur e numrave cift midis 2 numrave qe ju dhate eshte : "+ sum);

for (int i = shuma_1; i <= shuma_2; i++) {
  if (i % 2 == 0) {
	JOptionPane.showMessageDialog(null, "Numrat cift midis dy numrave te dhene jane: "+ i);
    
  }
}
	
}
}