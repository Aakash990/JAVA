//WAP to show Insertion sort in java
class InsertionSort{
public static void main(String args[]){
int arr[]={5,1,6,2,4,3};
int temp,i,j;
for(i=1;i<arr.length;i++){
temp=arr[i];
j=i-1;
while(j>=0&&arr[j]>temp){
arr[j+1]=arr[j];
j--;
}
arr[j+1]=temp;
}
for(i=0;i<arr.length;i++){
System.out.println(arr[i]);
}
}
}
