package week13;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Map.Entry;
public class Book {
	public static void main(String[] args){
		Map<String,Library> books=new HashMap<String,Library>();
		books.put("1",new Library("1","��","20","�㽭������"));
		books.put("2",new Library("1","ľ","21","����������"));
		books.put("3",new Library("1","ˮ","22","���ϳ�����"));
		books.put("4",new Library("1","��","23","���ϳ�����"));
		books.put("5",new Library("1","��","24","���������"));
		
		Iterator<Entry<String,Library>> iterator = books.entrySet().iterator(); 
		while(iterator.hasNext()){
            Entry<String,Library> entry = iterator.next();
            System.out.println("���룺"+entry.getKey()+" ���ƣ�"+entry.getValue().getName()+"  ���ۣ�"+entry.getValue().getPrice()+"  �����磺"+entry.getValue().getPress());
        }
	}
}
class Library{
	private String number;
	private String name;
	private String price;
	private String press;
	Library(String number,String name,String price,String press){
		this.number=number;
		this.name=name;
		this.price=price;
		this.press=press;
	}
	public String getName(){
		return name;
	}
	public String getPrice(){
		return price;
	}
	public String getPress(){
		return press;
	}
}
