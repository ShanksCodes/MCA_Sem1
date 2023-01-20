#include <stdio.h>
#include <conio.h>

void main(){
int a,b,c,d;
clrscr();
printf("\nEnter the value for 1st octet: ");
scanf("%d",&a);
printf("\nEnter the value for 2nd octet: ");
scanf("%d",&b);
printf("\nEnter the value for 3rd octet: ");
scanf("%d",&c);
printf("\nEnter the value for 4th octet: " );
scanf("%d",&d);

if
(a>=0 && a<=255 &&
b>=0 && b<=255 &&
c>=0 && c<=255 &&
d>=0 && d<=255)
 printf("Address valid");


else
printf("Address invalid");




if(a>=1 && a<=126)
printf("\nClass A address");


else if(a==127)
printf("\nLoopback address");


else if(a>128 && a<=191)
printf("\nClass B address");


else if(a>=192 && a<=233)
printf("\nClass C address");


else if(a>=234 && a<=239)
printf("\nClass D address");

else if(a>=239 && a<=254)
printf("\nClass E address");

getch();
}

