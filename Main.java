package javaapplication;

public class JavaApplication{

import java.util.Scanner;
 public static void main(String[] args) {
     int n,flag=0;
     Scanner S = new Scanner(System.in);
        System.out.println("Enter The Number");
        n=S.nextInt();
        for(int i=2;i<=n/2;++i){
            
        if(n%i==0){
            
            System.out.println("Not Prime");
            flag=1;
            break;
        }}
        if(flag==0){
        System.out.println("Prime");}
        else{
            System.out.println("not Prime");}
     
        }
        }
