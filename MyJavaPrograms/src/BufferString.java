
public class BufferString 
{
	public static void main(String args[])
	{
		StringBuffer name=new StringBuffer("govind");
		System.out.println(name);
		//StringBuffer sur="madd"; ===> wrong convention
		
		//operations through StringBUffer
		//1)Appending:
		System.out.println(name.append(" Maddala")); //govind Maddala
		
		//2)insert:
		System.out.println(name.insert(6,"ha")); //govindha Maddala
		
		//3)delete:
		System.out.println(name.delete(6,16));//govindha Maddala --> govind
		
		//4)reverse: 
		System.out.println(name.reverse()); //dnivog
		System.out.println(name.reverse()); //govind		
		
		//5)replace:
		System.out.println(name.replace(2,6," india")); //go india
		
		//6)Length:
		System.out.println(name.length()); //8
		
		//7)substring:
		System.out.println(name.substring(5)); //dia
		
		//8)index: 
		System.out.println(name.indexOf("i")); //3
		
		//9)char at:
		System.out.println(name.charAt(3));  //i
		
		//10)subsequent:
		System.out.println(name.subSequence(3,5)); //in	
	}
}
