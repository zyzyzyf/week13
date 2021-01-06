package week13;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Map.Entry;
public class Book {
	public static void main(String[] args){
		Map<String,Library> books=new HashMap<String,Library>();
		books.put("1",new Library("1","金","20","浙江出版社"));
		books.put("2",new Library("1","木","21","北京出版社"));
		books.put("3",new Library("1","水","22","湖南出版社"));
		books.put("4",new Library("1","火","23","河南出版社"));
		books.put("5",new Library("1","土","24","重庆出版社"));
		
		Iterator<Entry<String,Library>> iterator = books.entrySet().iterator(); 
		while(iterator.hasNext()){
            Entry<String,Library> entry = iterator.next();
            System.out.println("编码："+entry.getKey()+" 名称："+entry.getValue().getName()+"  单价："+entry.getValue().getPrice()+"  出版社："+entry.getValue().getPress());
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
