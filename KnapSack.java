import java.util.*;
public class KnapSack {
    static final int max=20;
    static Scanner sc= new Scanner(System.in);
    static int M;
    static int n;
    static int p[];
    static int w[];
    static int V[][];
    static int Keep[][];
    public static void main(String[] args) {
        w=new int[max];
        p=new int[max];
        V=new int[max][max];
        Keep=new int[max][max];
        int optsoln;
        readMatrix();
        for(int i=0;i<=M;i++){
            V[0][i]=0;
        }
        for(int i=0;i<=n;i++){
            V[i][0]=0;
        }
                optsoln=knapsack();
        System.out.println("Optimum solution : " + optsoln);
    }
    static int knapsack(){
int r;
for(int i=1;i<=n;i++) {
    for (int j = 0; j<= M; j++) {
        if ((w[i] <= j) &&( p[i] + V[i - 1][j - w[i]] > V[i - 1][j])) {
            V[i][j] = p[i] + V[i - 1][j - w[i]];
            Keep[i][j] = 1;
        } else {
            V[i][j] = V[i - 1][j];
            Keep[i][j] = 0;
        }
            }
        }
        r = M;
        System.out.println("items :");
        for ( int i= n; i> 0; i--) {
            if (Keep[i][r] == 1) {
                System.out.println(i);
                r = r - w[i];
    }
}
    System.out.println();
return V[n][M];
}

    static void readMatrix(){
        System.out.println("---Knapsack problem---");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the maximum capacity:");
         M=sc.nextInt();
        System.out.println("Enter the number of objects:");
         n=sc.nextInt();
        System.out.println("Enter the weights:");
        for(int i=1;i<=n;i++)
        w[i]=sc.nextInt();
        System.out.println("Enter the profit:");
        for(int i=1;i<=n;i++)
            p[i]=sc.nextInt();
    }

}
