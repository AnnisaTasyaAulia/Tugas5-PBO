package Tugas5;


public class Person {
    String name;
    String address;
    
    Person(String nama, String address){
        this.name = nama;
        this.address = address;
    }
    
    String getNama(){
        return name;
    }
    
    String getAddress(){
        return address;
    }
    
    void setAddress(String address){
        this.address = address;
    }
    
    @Override
    public String toString(){
        return ("Nama = " + name +
            "Address = " + super.toString());
    }  
}
