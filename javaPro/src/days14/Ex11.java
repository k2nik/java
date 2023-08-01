package days14;

/**
 * @author kenik
 * @date 2023. 8. 1. - 오후 4:12:57
 * @subject
 * @content
 */
public class Ex11 {

	public static void main(String[] args) {
		Document doc1 = new Document(); 
		Document doc2 = new Document(); 
		Document doc3 = new Document("자바문서.txt"); 
		Document doc4 = new Document(); 
		Document doc5 = new Document(); 

	} // main

} // class

//    문서
class Document{
   String fileName;
   static int count = 1;
   
   {
	   count++;
	   System.out.println("인스턴스 초기화 블럭 실행...");
   }
   
   public Document() {
	   // Cannot refer to an instance field count while explicitly invoking a constructor
	   this(String.format("Noname%d.txt", count));
	   
	   // Constructor call must be the first statement in a constructor
	  
   }
   public Document(String fileName) {
	   this.fileName = fileName;
	   System.out.printf("문서 \"%s\"가 생성되었습니다.\n", this.fileName); 
   }
}








