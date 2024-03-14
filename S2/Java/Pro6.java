public class Pro6{
    public static void main(String args[]){
        String sortString[]={"Apple","Cherry","Banana","Orange"};
        String temp;
        for(int i=0;i<sortString.length;i++){
            //System.out.println(sortString[i]);
            for(int j=i+1;j<sortString.length;j++){
                if((sortString[i].compareTo(sortString[j]))>0){
                   temp=sortString[i];
                   sortString[i]=sortString[j];
                   sortString[j]=temp;
                }
            }
        }
        for(int i=0;i<sortString.length;i++){
            System.out.println(sortString[i]);
        }
    }
}
