package ogr.oyj.com;


public class Operate {
	 Student stu[]= new Student[]{new Student(1,"张三",0),new Student(2,"李四",0),new Student(3,"王五",0)
			 ,new Student(4,"赵六",0),new Student(5,"王八",0),new Student(6,"强大",0) };
	 private InpuData input=new InpuData();
	 private boolean flag=true;
	 public Operate() {
		 System.out.println("1.张三同学。2.李四同学。\n3.王五同学。4.赵六同学。\n5.王八同学。6.强大同学。");
		 while(flag) {		 
			 this.vote();
		 }
		 this.show();
		 this.result();
	 }
	 public void show() {
		 for(int x=0;x<stu.length;x++) {
			 System.out.println(this.stu[x].getId()+this.stu[x].getName()+"[获得"+this.stu[x].getCount()+"票]");
		 }
	 }
	 public void result() {
		 java.util.Arrays.sort(stu);
		 if(stu[0].getCount()>stu[1].getCount()) {
			 System.out.println(this.stu[0].getId()+"号同学"+this.stu[0].getName()+"获得"+this.stu[0].getCount()+""
			 		+ "票，当选班长");
		 }else if(this.stu[0].getCount()==this.stu[1].getCount()&&this.stu[1].getCount()!=this.stu[2].getCount()) {
			 System.out.println(this.stu[0].getName()+"同学和"+this.stu[1].getName()+"同学票数一样，请大家重选!");
		 }else {
			 System.out.println("超过三个人票数相同，请重选!");
		 }
	 }
	 public  void vote() {
		 int a=input.getInt("请输入候选人的选号(数字0表示结束:)","你输入的选票无效!");
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
				 System.out.println("选票无效,请重新输入!!");
				 
			 }
				 
		 }		 
	 }
}
