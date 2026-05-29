package streamTutorials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;
//@Test
public class Test1 {
	public void regular()
	{
		ArrayList<String> names= new ArrayList<String>();
		names.add("Mayra");
		names.add("Aarya");
		names.add("Aadam");
		names.add("Aagstya");
		names.add("Shaunak");
	int count =0;
	
	for(int i =0; i<names.size(); i++)
	{
		String actual =names.get(i);
		if(actual.startsWith("A"))
		{
			count++;
		}
	}
	System.out.println(count);
	
	}
	//@Test
	
public void streamFilter()
	{
		ArrayList<String> names= new ArrayList<String>();
		names.add("Mayra");
		names.add("Aarya");
		names.add("Aadam");
		names.add("Aagstya");
		names.add("Shaunak");
		Long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		//there is no life for intermediate operation if there is no terminal operation
		//terminal operation will execute only if intermediate operation(filter) is return true
		Long d =Stream.of("Mayra","Aarya","Aadam","Aagstya","Shaunak").filter(s->
		{
			s.startsWith("A");
		return true;
		}).count();
		System.out.println(d);
		//
		
		//print all the names presnt in array list
		
		//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		//limit the output able to show only onr result
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
	}
	//@Test
	public void streamMap()
	{
	ArrayList<String> names=	new ArrayList<String>();
	names.add("man");
	names.add("women");
	names.add("Don");
		//print names whoich have last letter a with uppercase
		Stream.of("Mayra","Aarya","Aadam","Aagstya","Shaunak").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).
		forEach(s->System.out.println(s));
		//print name which starts with a and uppercase with sorted order
		List<String> names1 = Arrays.asList("Mayra","Aarya","Aadam","Azagstya","Shaunak");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//merging two stream with sorting order
		
		Stream<String> newStream= Stream.concat(names.stream(), names1.stream());
		newStream.sorted().forEach(s->System.out.println(s));
		//Aarya is present in list or not
		boolean flag =newStream.anyMatch(s->s.equalsIgnoreCase("Aarya"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	@Test
	public void streamCollect()
	{
		List <String> ls =Stream.of("Mayra","Aarya","Aadam","Aagstya","Shaunak").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).
		collect(Collectors.toList());
		
		System.out.println(ls.get(0));
		
		List<Integer> values = Arrays.asList(1,3,4,7,1,3,2,5,9,7,0);
		
		//print unique number in array and sort the array and after sorting give me the 3rd index
		//values.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> li= values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
	}
}


