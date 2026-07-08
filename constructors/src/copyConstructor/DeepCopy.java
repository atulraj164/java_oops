package copyConstructor;

public class DeepCopy {
	   int id;
	    String name;
	    Address address;
	    
	    public DeepCopy(int id,String name,Address address) {
	    	this.id=id;
	    	this.name=name;
	    	this.address=address;
	    }
	    
	    public DeepCopy(DeepCopy sc) {
	    	this.id=sc.id;
	    	this.name=sc.name;
	    	this.address=new Address(sc.address);
	    }
}
