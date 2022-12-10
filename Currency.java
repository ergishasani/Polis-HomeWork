package detyrat_polis;

import javax.swing.JOptionPane;

class dsh1{

    public static void main(String[] args) {
    int euro = 117;
    int yen = 123;
    int lira = 16;
    double pound = 0.74;
    double first, Euro, Yen, Lira, Pound;

        JOptionPane.showMessageDialog(null,"Ky program ben konvertimin e disa monedhave nderkombetare");

        
        first = (int) Double.parseDouble(JOptionPane.showInputDialog(null, "Shtypni 1 per konvertimin e Lek ne Euro" +"\n" 
        + "Shtypni 2 per konvertimin e Lek ne Yen"+"\n"+"Shtypni 3 per konvertimin e Lek ne Lira"+"\n"+"Shtypni 4 per konvertimin e Lek ne Pound"));

        if(first == 1 ){
            Euro = (double) Double.parseDouble(JOptionPane.showInputDialog(null, "Jepni shumen qe doni te konvertoni:"));
            int shuma_1 = (int) (Euro/euro);
            JOptionPane.showMessageDialog(null, "Shuma "+Euro +"Lek ne Euro eshte "+"\n"+shuma_1 + "€");

        }
        else if(first == 2 ){
            Yen = (int) Double.parseDouble(JOptionPane.showInputDialog(null, "Jepni shumen qe doni te konvertoni:"));
            int shuma_2 = (int) (Yen/yen);
            JOptionPane.showMessageDialog(null, "Shuma "+Yen +"Lek ne Yen eshte "+"\n"+shuma_2+ " Yen");
        }
        else if(first==3){
            Lira = (int) Double.parseDouble(JOptionPane.showInputDialog(null, "Jepni shumen qe doni te konvertoni:"));
            int shuma_3 = (int) (Lira/lira);
            JOptionPane.showMessageDialog(null, "Shuma "+Lira +"Lek ne Lira eshte "+"\n"+shuma_3 +" Lira");
        }
        else if(first == 4){
            Pound = (int) Double.parseDouble(JOptionPane.showInputDialog(null, "Jepni shumen qe doni te konvertoni:"));
            double shuma_4 = (int)(Pound*pound);
            JOptionPane.showMessageDialog(null, "Shuma "+Pound +"Lek ne Paund eshte "+"\n"+shuma_4 +"£");
        }
        else{
            JOptionPane.showMessageDialog(null,"Numri qe ju shtypet nuk eshte ne list.");
        }


    }
    

}