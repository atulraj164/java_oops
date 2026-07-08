package copyConstructor;

public class shallowCopy {
    int id;
    String name;
    Address address;
    
    public shallowCopy(int id,String name,Address address) {
    	this.id=id;
    	this.name=name;
    	this.address=address;
    }
    
    public shallowCopy(shallowCopy sc) {
    	this.id=sc.id;
    	this.name=sc.name;
    	this.address=sc.address;
    }
 
}
