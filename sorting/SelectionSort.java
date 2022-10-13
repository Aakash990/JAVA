//WAP to show selection sort in java
class SelectionSort{
    public static void main(String args[]){
    int a[]={7,4,10,8,3,1};
    int temp;
    for(int i=0;i<a.length-1;i++){
             int min=i;
             for(int j=i+1;j<a.length;j++){
                    if(a[j]<a[min]){
                          min=j;
                       }
              }
              if(min!=i){
              temp=a[i];
              a[i]=a[min];
               a[min]=temp;
              }
         }
     for(int i=0;i<a.length;i++){
     System.out.println(a[i]+" ");
             }
       }
}
