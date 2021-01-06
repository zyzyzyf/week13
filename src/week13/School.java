package week13;
import java.util.Set;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;
public class School {
	public static void main(String[] args)
    {
        //����������Ϣ��set��
        Set<Student> stuSet = saveStudentInfo();
        //����set
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
        // ����ѧ����Ϣ��TreeSet���϶���
        Set<Student> stuSet = new TreeSet<Student>();
        System.out.println("������ѧ����Ϣ:(ѧ��#����#����)");
        while (true)
        {
            // ������ʾ
            
            String inputData = input.nextLine();
            // �ж��Ƿ��˳� inputData.equals("exit")
            if ("exit".equals(inputData))
            {
                break;
            }
            // ���û������ѧ����Ϣ�ָ�ΪString[]
            String[] info = inputData.split("#");
            // ��������Ϣ��װ��Student������
            Student stu = new Student(Integer.parseInt(info[0]),info[1],Integer.parseInt(info[2]));
            // ��ѧ��������뼯��
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
    //ʡ��getter��setter����
    //ʡ�Թ��췽��    
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
