package org.example.models;


public class Bill {
    private int flutequantity;
    private int guitarquantity;
    private int pianoquantity;

    public Bill() {
        flutequantity = 0;
        guitarquantity = 0;
        pianoquantity = 0;
    }

    public Bill(int flutequantity, int guitarquantity, int pianoquantity) {
        this.flutequantity = flutequantity;
        this.guitarquantity = guitarquantity;
        this.pianoquantity = pianoquantity;
    }

    public int getFlutequantity() {
        return flutequantity;
    }

    public void setFlutequantity(int flutequantity) {
        this.flutequantity = flutequantity;
    }

    public int getGuitarquantity() {
        return guitarquantity;
    }

    public void setGuitarquantity(int guitarquantity) {
        this.guitarquantity = guitarquantity;
    }

    public int getPianoquantity() {
        return pianoquantity;
    }

    public void setPianoquantity(int pianoquantity) {
        this.pianoquantity = pianoquantity;
    }

    public void billgen(){
        int total=(flutequantity*300)+(guitarquantity*1000)+(pianoquantity*1200);
        System.out.println("----------Bill------------\n");
        System.out.println("Item\t Quantity\t Price\t\t Total\n"+
                "Flute\t\t"+flutequantity+"\t\tRs 300\t\t"+ flutequantity*300 +"\n"+
                "Guitar\t\t"+guitarquantity+"\t\tRs 1000\t\t"+ guitarquantity*1000+"\n"+
                "Piano\t\t"+pianoquantity+"\t\tRs 1200\t\t"+ pianoquantity*1200+"\n"+
                "Subtotal : "+ total);
    }
}