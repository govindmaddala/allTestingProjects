import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class JavaStreams 
{
	public static void main(String[] args)
	{
		conventional_Count_Array();
		stream_Count_Array();
		conventional_Count_ArrayList();
		stream_Count_ArrayList();
		streams_count_Direct();
		streams_ops();
	}

	//To count words starts with some letter using conventional method from Array
	public static void conventional_Count_Array()
	{
		String[] nameArray={"apple","axe","aisle","anticipate","ajar","abandon",
				"boy","biscuit","baby","balayya","cat","cattle","catch","dog","degree","disease","eat","eaten","govind","gowri"};
		int count1=0;
		for(int i=0;i<nameArray.length;i++)
		{
			if(nameArray[i].startsWith("a"))
			{
				count1++;
			}
		}
		System.out.println("Using conventional_Count_Array: Count of Letters started with a are "+count1);
	}
	
	//To count words starts with some letter using streams from Array
	public static void stream_Count_Array()
	{
		String[] nameArray={"apple","axe","aisle","anticipate","ajar","abandon",
				"boy","biscuit","baby","balayya","govind","gowri"};
		List<String> nameArrayList= Arrays.asList(nameArray);
		long count2=nameArrayList.stream().filter(a->a.startsWith("a")).count();
		System.out.println("Using stream_Count_Array: count of words started with a are "+count2);
	}

	
	//To count words starts with some letter using conventional_Count_ArrayList()
	public static void conventional_Count_ArrayList()
	{
		ArrayList<String> nameArrayList=new ArrayList<String>();
		nameArrayList.add("apple");
		nameArrayList.add("axe");
		nameArrayList.add("aisle");
		nameArrayList.add("anticipate");
		nameArrayList.add("ajar");
		nameArrayList.add("abandon");
		nameArrayList.add("boy");
		nameArrayList.add("biscuit");
		nameArrayList.add("balayya");
		nameArrayList.add("govind");
		nameArrayList.add("gowri");
		nameArrayList.add("baby");
		int count3=0;
		for(int i=0;i<nameArrayList.size();i++)
		{
			if(nameArrayList.get(i).startsWith("a"))
			{
				count3++;
			}
		}
		System.out.println("Using conventional_Count_ArrayList: Count of Letters started with a are "+count3);	
	}
	
	////To count words starts with some letter using stream_Count_ArrayList()
	public static void stream_Count_ArrayList()
	{
		ArrayList<String> nameArrayList=new ArrayList<String>();
		nameArrayList.add("apple");
		nameArrayList.add("axe");
		nameArrayList.add("aisle");
		nameArrayList.add("anticipate");
		nameArrayList.add("ajar");
		nameArrayList.add("abandon");
		nameArrayList.add("boy");
		nameArrayList.add("biscuit");
		nameArrayList.add("balayya");
		nameArrayList.add("govind");
		nameArrayList.add("gowri");
		nameArrayList.add("baby");
		long count4=nameArrayList.stream().filter(a->a.startsWith("a")).count();
		System.out.println("Using stream_Count_ArrayList: count of words started with a are "+count4);
	}

	public static void streams_count_Direct()
	{
		long count5=Stream.of("apple","axe","aisle","anticipate","ajar","abandon","boy","biscuit","baby",
				"balayya","govind","gowri")
				.filter(a->a.startsWith("a")
				).count();
		
		System.out.println("Using streams_count_Direct: count of letters with a are: "+count5);
	}
	
	public static void streams_ops()
	{
		//printing all names using "forEach"
		String[] words={"apple","axe","aisle","anticipate","ajar","abandon","boy","biscuit","baby",
				"balayya","govind","gowri"};
		List<String> wordlist=Arrays.asList(words);
		wordlist.stream().forEach(b->System.out.println(b));
		
		//printing limited words starting with letter "a"
		wordlist.stream().filter(c->c.startsWith("a")).limit(1).forEach(d->System.out.println(d));
		System.out.println(  );
		
		//printing using length of words starting with "a":
		wordlist.stream().filter(a->a.startsWith("a")).filter(b->b.length()>4).forEach(c->System.out.println(c));
		
		System.out.println(  );
		
		//printing using length of words starting with "a" and changing their cases:
		wordlist.stream().filter(a->a.startsWith("a")).filter(b->b.length()>4).map(c->c.toUpperCase()).forEach(d->System.out.println(d));
		
		System.out.println(  );
		
		//printing using length of words starting with "a" and changing their cases and 'sorted':
		wordlist.stream().filter(a->a.startsWith("a")).filter(b->b.length()>4).map(c->c.toUpperCase()).sorted().forEach(d->System.out.println(d));
		
		//concate 2 strings
		System.out.println(  );
		long count6= Stream.concat(Stream.of("abcd"), Stream.of("bcda")).count();
		System.out.println("Contcated 2 streams of having 1 word each: "+count6);
		
		//crossChecking the existence of whole word using anyMatch
		Stream<String> concat= Stream.concat(Stream.of("abcd"), Stream.of("bcda"));
		boolean val=concat.anyMatch(d->d.equalsIgnoreCase("abcd"));
		System.out.println(val); //In this testNg is not there otherwise it can be handled by
		/*
		 
		 Assert.assertTrue(val)  //if val=true test case passes else fails the test case
		 
		 */	

		
		//collect the results and convert it back into list 
		List<String> aWords=wordlist.stream().filter(c->c.startsWith("a")).collect(Collectors.toList());
		System.out.println(aWords.get(0));
		
		System.out.println(  );
		//Printing unique ans sorting array
		Stream.of(5,1,2,3,4,3,34,424,1,1,1,3,2,3,2,6,5,7,8,8,6,4).distinct().sorted().forEach(d->System.out.println(d));;
		System.out.println(  );
		//printing 4th index number only by sorting and unique 
		List<Integer> num=Stream.of(5,1,2,3,4,3,34,424,1,1,1,3,2,3,2,6,5,7,8,8,6,4).distinct().sorted().collect(Collectors.toList());
		System.out.println(num.get(4));
	}
}
