package lec2;

public class P19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
        int row=1;
        int star=n/2+1;
        int space=0;
        while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }

            int j=1;
            while(j<space){
                System.out.print("  ");
                j++;
            }

            int k=1;
            if(row==1 || row==n){
                k=2;
            }
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            if(row<=n/2){
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }
            System.out.println();
            row++;
        }
		
		
		
		
	}

}