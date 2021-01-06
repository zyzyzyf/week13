package week13;
import java.util.Set;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;
public class School {
	public static void main(String[] args)
    {
        //保存输入信息到set中
        Set<Student> stuSet = saveStudentInfo();
        //遍历set
        Iterator<Student> it = stuSet.iterator();
        while (it.hasNext())
        {
            String info = it.next().toString();
            System.out.println(info);
        }
    }
    private static Set<Student> saveStudentInfo()
    {
        Scanner input = new Scanner(System.in);
        // 保存学生信息的TreeSet集合对象
        Set<Student> stuSet = new TreeSet<Student>();
        System.out.println("请输入学生信息:(学号#姓名#年龄)");
        while (true)
        {
            // 输入提示
            
            String inputData = input.nextLine();
            // 判断是否退出 inputData.equals("exit")
            if ("exit".equals(inputData))
            {
                break;
            }
            // 将用户输入的学生信息分割为String[]
            String[] info = inputData.split("#");
            // 将输入信息封装到Student对象中
            Student stu = new Student(Integer.parseInt(info[0]),info[1],Integer.parseInt(info[2]));
            // 将学生对象加入集合
            stuSet.add(stu);
        }
        return stuSet;
    }
}
class Student implements Comparable<Student>
{
    private Integer num;
    private String name;
    private Integer age;
    Student(Integer num,String name,Integer age){
		this.num=num;
		this.name=name;
		this.age=age;
	}
    //省略getter和setter方法
    //省略构造方法    
    public int compareTo(Student stu)
    {
        return this.age - stu.age;
    }
    public String toString()
    {
        return "Student [age=" + age + ", name=" + name
                + ", num=" + num + "]";
    }
}
