package OopClass;

import java.util.Scanner;

public class Laptop {
    //store variables
    String[] details  = {"processor" ,"ram", "vga","soundCard", "lanDriver" , "bluetoothDriver", "hdmi", "usb2","usb3"};
    private String processor , ram , vga , soundCard , bluetoothDriver , lanDriver , hdmi , usb2 , usb3 ;

    //constructor
    public Laptop ( String ram , String processor )
    {
        this.processor = processor;
        this.ram = ram;
    }

    //constructor2
    public Laptop (String vga, String soundCard, String lanDriver, String bluetoothDriver, String hdmi, String usb2, String usb3)
    {
        this.vga = vga ;
        this.soundCard = soundCard;
        this.lanDriver = lanDriver;
        this.bluetoothDriver = bluetoothDriver;
        this.hdmi = hdmi;
        this.usb2 = usb2;
        this.usb3 = usb3;
    }

    //getters
    public String getDetail(int n) {
        if (n >= 0 && n < details.length) 
        {
            return details[n];
        }}

    //setters
    public void setDetail(int k, String value) {
        if (k >= 0 && k < details.length) 
        {
            this.details[k] = value;
        }}

        public String funLaptop()
        {   
            System.out.println("Laptop details are :");
            System.out.println("intel core i5 , Gth 8 ");
            System.out.println("16 GB ");
            return "";
        }
        public String funLaptop2 ()
        {
            Scanner reader = new Scanner(System.in);
            System.out.println("8 GB ");
            System.out.println("speakers (realtek(R)audio) ");
            System.out.println("lan driver") ;
            System.out.println("bluetoot driver" );
            System.out.println("hdml") ;
            System.out.println("usb2" );
            System.out.println("usb3" );
            System.out.println("enter price for the laptop , please : ");
            int price = reader.nextInt();
            int VTA = price * 14 / 100 ;
            System.out.println("VTA equal " + VTA + " and price after VTA is " + (VTA + price) );
            int shipment = 500 ; 
            System.out.println("and shipment = " + shipment + "\nrequired price now is " + (VTA + price + shipment));
            return "";
        }
        public static void main(String[] args) {
            Laptop laptop1 = new Laptop("intel core i5 ", "16 GB ");
            Laptop laptop2 = new Laptop("VGA ", "speakers (realtek(R)audio) ", "lanDriver", "null", "null", "usb2", "usb3");
        
            System.out.println( laptop1.funLaptop() + laptop2.funLaptop2()) ;
           
        }
}

