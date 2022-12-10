package detyrat_polis;

import javax.swing.JOptionPane;

public class Date {
    public static void main(String[] args) {
        int number_Of_DaysInMonth = 0; 
        String MonthOfName = "Unknown";
        int month = (int) Double.parseDouble(JOptionPane.showInputDialog(null, "Jepni nr e muajit:"));
        int year = (int) Double.parseDouble(JOptionPane.showInputDialog(null, "Jepni vitin:"));

        switch (month) {
            case 1:
                MonthOfName = "Janar";
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "Shkurt";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "Mars";
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "Prill";
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "Maj";
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "Qeshor";
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "Korrik";
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "Gusht";
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "Shtator";
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "Tetor";
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "Nentor";
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "Dhjetor";
                number_Of_DaysInMonth = 31;
        }
        JOptionPane.showMessageDialog(null,"Muaji "+MonthOfName+" ne vitin "+year+" ka "+ number_Of_DaysInMonth+" dite");
   
    }
    
}
