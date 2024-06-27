

/*
 
   1
   1	2
   2	3	4
   4	5	6	7
   7	8	9	10	11
   
 */ 


#include<stdio.h>

void main() {
	
	int count = 1;
	int rows;
	printf("Enter Rows : ");
	scanf("%d",&rows);
	
	int j=1;
	for(int i=1; i<=rows;) {
	

		if(j>i) {
		
			printf("\n");
			j=1;
			count--;
			i++;

		} else {
		
			printf("%d\t",count);
			count++;
			j++;
		}



	}

}
