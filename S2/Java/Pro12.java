import java.util.Scanner;
class Publisher{
    String pub_name;
    Publisher(String pub_name){
        this.pub_name = pub_name;
    }
}
class Book extends Publisher{
    String book_name;
    String author;
    float price;
    Book(String pub_name,String book_name,String author,float price){
        super(pub_name);
        this.book_name = book_name;
        this.author = author;
        this.price = price;
    }
}
class Literature extends Book{
    Literature(String pub_name,String book_name,String author,float price){
        super(pub_name,book_name,author,price);
    }
    void disp(){
        System.out.println("Publisher Name : "+pub_name);
        System.out.println("Book Name : "+book_name);
        System.out.println("Author : "+author);
        System.out.println("Price : "+price);
    }
}
class Fiction extends Book{
    Fiction(String pub_name,String book_name,String author,float price){
        super(pub_name,book_name,author,price);
    }
    void disp(){
        System.out.println("Publisher Name : "+pub_name);
        System.out.println("Book Name : "+book_name);
        System.out.println("Author : "+author);
        System.out.println("Price : "+price);
    }
}
class BookDetails {
    static String t1,t2,t3;
    static float t4;
    static Scanner scn = new Scanner(System.in).useDelimiter("\n");
    static void read(){
        System.out.print("Publisher Name : ");
        t1 = scn.next();
        System.out.print("Book Name : ");
        t2 = scn.next();
        System.out.print("Author : ");
        t3 = scn.next();
        System.out.print("Price : ");
        t4 = scn.nextFloat();
    }
    public static void main(String args[]){
        int i;
        Literature lit[] = new Literature[10];
        Fiction fic[] = new Fiction[10];
        System.out.print("Enter the no. of Literature Books : ");
        int n = scn.nextInt();
        for(i=0;i<n;i++){
            System.out.println("\nEnter the Details of Book "+(i+1));
            read();
            lit[i] = new Literature(t1,t2,t3,t4);
        }
        System.out.print("Enter the no. of Fiction Books : ");
        int m = scn.nextInt();
        for(i=0;i<m;i++){
            System.out.println("\nEnter the Details of Book "+(i+1));
            read();
            fic[i] = new Fiction(t1,t2,t3,t4);
        }
        System.out.println("\nDetails of Literature Books ");
        for(i=0;i<n;i++){
            System.out.println("\nBook "+(i+1));
            lit[i].disp();
        }
        System.out.println("\nDetails of Fiction Books ");
        for(i=0;i<m;i++){
            System.out.println("\nBook "+(i+1));
            fic[i].disp();
        }
    }
}
