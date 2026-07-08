package copyConstructor;

public class Copymain {
 public static void main(String[] args) {
	//shallow copy
	 
	 shallowCopy sc=new shallowCopy(1,"sty",new Address("dbg","btola","009"));
	 shallowCopy sc1=new shallowCopy(sc);
	 System.out.println(sc.address);
	 System.out.println(sc1.address);
	 System.out.println(sc.address==sc1.address);//pointing to same inner class object
	 
	 //deepcopy
	 DeepCopy dc=new DeepCopy(1,"sty",new Address("dbg","btola","009"));
	 DeepCopy dc1=new DeepCopy(dc);
	 System.out.println(dc.address);
	 System.out.println(dc1.address);
	 System.out.println(dc.address==dc1.address);//pointing to diffrent inner classes object
}
}
