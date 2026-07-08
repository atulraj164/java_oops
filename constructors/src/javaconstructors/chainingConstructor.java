package javaconstructors;

public class chainingConstructor {
  
	private int id;
	private String name;
	private String address;
	
   public chainingConstructor(int id) {
	  this.id=id;
	  
	}
   public chainingConstructor(int id,String name) {
	   this(id); 
	   this.name=name;
		
  	}
	public chainingConstructor(int id,String name,String address) {
		this(id,name);
		this.address=address;
	}
	
	public String toString() {
		return this.id+ ", "+this.name+", "+this.address;
	}
	
}
