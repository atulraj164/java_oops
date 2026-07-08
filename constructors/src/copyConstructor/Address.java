package copyConstructor;

public class Address {
   String city;
   String Area;
   String houseno;
   
   public Address(String city,String Area,String houseno) {
	   this.city=city;
	   this.Area=Area;
	   this.houseno=houseno;
   }
   public Address(Address address) {
	   this.city=address.city;
	   this.Area=address.Area;
	   this.houseno=address.houseno;
   }
   public String toString() {
	   return this.city+" "+this.Area+" "+this.houseno;
   }
}
