//WAP to show shell sort in java
class ShellSort{
public static void main(String args[]){
int arr[]={23,29,15,31,7,9,5,2};
for(int gap=arr.length/2;gap>=1;gap=gap/2){
for(int j=gap;j<arr.length;j++){
for(int i=j-gap;i>=0;i=i-gap){
if(arr[i+gap]>arr[i]){
break;
}else{
int temp=arr[i+gap];
arr[i+gap]=arr[i];
arr[i]=temp;
}
}
}
}
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
}
}
}
