package Stringbuffers;

public class ensurecapicity {
public static void main(String[] args) {
	StringBuilder s=new StringBuilder();//default 16
	System.out.println(s.capacity());
	s.append("mahesh");
	System.out.println(s.capacity());//now 16
	s.ensureCapacity(10);
	System.out.println(s.capacity());//now 16   NO change 
	s.ensureCapacity(30);
	System.out.println(s.capacity());// old capacity*2+2=16*2+2=34
	s.ensureCapacity(69);// above old capacity
	System.out.println(s.capacity());// 34*2+2=70
	s.ensureCapacity(80);// above old capacity
	System.out.println(s.capacity());// 70*2+2=142
}
}
