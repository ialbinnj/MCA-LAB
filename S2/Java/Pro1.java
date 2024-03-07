class Product{
   String pCode;
   String pName;
   int price;
   Product(String pCode,String pName,int price){
     this.pCode=pCode;
     this.pName=pName;
     this.price=price;
   }																																																																																																																																																																																																																																																																							
}

 class Pro1{
   public static void main(String args[]){
        Product product1=new Product("123","Soup",124);
        Product product2=new Product("456","Vodka",170);
        Product product3=new Product("789","Cream",80);
        if(product1.price>product2.price && product1.price>product3.price) System.out.println(product1.pName+" has higher price");
        else if(product2.price>product1.price && product2.price>product3.price) System.out.println(product2.pName+" has higher price");
        else System.out.println(product3.pName+" has higher price");
   }
}
