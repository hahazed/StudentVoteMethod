package ogr.oyj.com;


public class Operate {
	 Student stu[]= new Student[]{new Student(1,"����",0),new Student(2,"����",0),new Student(3,"����",0)
			 ,new Student(4,"����",0),new Student(5,"����",0),new Student(6,"ǿ��",0) };
	 private InpuData input=new InpuData();
	 private boolean flag=true;
	 public Operate() {
		 System.out.println("1.����ͬѧ��2.����ͬѧ��\n3.����ͬѧ��4.����ͬѧ��\n5.����ͬѧ��6.ǿ��ͬѧ��");
		 while(flag) {		 
			 this.vote();
		 }
		 this.show();
		 this.result();
	 }
	 public void show() {
		 for(int x=0;x<stu.length;x++) {
			 System.out.println(this.stu[x].getId()+this.stu[x].getName()+"[���"+this.stu[x].getCount()+"Ʊ]");
		 }
	 }
	 public void result() {
		 java.util.Arrays.sort(stu);
		 if(stu[0].getCount()>stu[1].getCount()) {
			 System.out.println(this.stu[0].getId()+"��ͬѧ"+this.stu[0].getName()+"���"+this.stu[0].getCount()+""
			 		+ "Ʊ����ѡ�೤");
		 }else if(this.stu[0].getCount()==this.stu[1].getCount()&&this.stu[1].getCount()!=this.stu[2].getCount()) {
			 System.out.println(this.stu[0].getName()+"ͬѧ��"+this.stu[1].getName()+"ͬѧƱ��һ����������ѡ!");
		 }else {
			 System.out.println("����������Ʊ����ͬ������ѡ!");
		 }
	 }
	 public  void vote() {
		 int a=input.getInt("�������ѡ�˵�ѡ��(����0��ʾ����:)","�������ѡƱ��Ч!");
		 switch(a){
			 case 0:{
				 flag=false;
				 break;
			 }
			 case 1:{
				 stu[0].setCount(stu[0].getCount()+1);
				 break;
			 }
			 case 2:{
				 stu[1].setCount(stu[1].getCount()+1);
				 break;
			 }
			 case 3:{
				 stu[2].setCount(stu[2].getCount()+1);
				 break;
			 }
			 case 4:{
				 stu[3].setCount(stu[3].getCount()+1);
				 break;
			 }
			 case 5:{
				 stu[4].setCount(stu[4].getCount()+1);
				 break;
			 }
			 case 6:{
				 stu[5].setCount(stu[5].getCount()+1);
				 break;
			 }
			 default:{
				 System.out.println("ѡƱ��Ч,����������!!");
				 
			 }
				 
		 }		 
	 }
}
