package Interfaces;


public interface HastanePersonel {

    String getIsim();
    String getSoyIsim();
    String getMeslek();
    String getGorev();
    int getYas();
    double getMaas();

    default public void displayInfo()
    {
        System.out.println("\nisim: " + getIsim() + "\nsoyisim: " + getSoyIsim() + "\nmeslek: " + getMeslek() + //
                            "\nyas: " + getYas() + "\nmaaş: " + getMaas() + "\ngörev: " + getGorev() );
    }



}








